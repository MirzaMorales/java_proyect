package mx.utng.sesion26.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult; //nos manda errores al ingresar datos invalidos del estudiante
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.validation.Valid;
import mx.utng.sesion26.model.entity.Student;
import mx.utng.sesion26.model.service.IStudentService;

@Controller
@SessionAttributes("student")
public class StudentController {
    
    @Autowired
    private IStudentService service;

    @GetMapping({"","/","/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado Estudiantes");
        model.addAttribute("students", service.list());
        return "list";
    }

    @GetMapping("/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Estudiantes");
        model.addAttribute("student", new Student());
        return "form";
    }

    @PostMapping("/form")
    public String save(@Valid Student student, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de estudiantes");
            return "form";
        }
        service.save(student);
        return "redirect:list";
    }

    @GetMapping("/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Student student = null;
        if(id>0){
            student = service.getById(id);
        }else{
            return "redirect:list";
        }
        model.addAttribute("title", "Editar estudiante");
        model.addAttribute("student", student);
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id>0){
            service.delete(id);
        }
        return "redirect:/list";
    }
}
