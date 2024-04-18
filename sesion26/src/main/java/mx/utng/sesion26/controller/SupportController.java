package mx.utng.sesion26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;
import mx.utng.sesion26.model.entity.Support;
import mx.utng.sesion26.model.service.ISupportService;

@Controller
@SessionAttributes ("support")
public class SupportController {
    @Autowired
    private ISupportService service;

    @GetMapping({"support","support","support/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado becas");
        model.addAttribute("supports", service.list());
        return "support-list";
    }

    @GetMapping("/support/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de becas");
        model.addAttribute("supports", new Support());
        return "support-form";
    }

    @PostMapping("/support/form")
    public String save(@Valid Support support, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de becas");
            return "support-form";
        }
        service.save(support);
        return "redirect:/support/list";
    }

    @GetMapping("/support/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Support support = null;
        if(id>0){
            support = service.getById(id);
        }else{
            return "redirect:/support/list";
        }
        model.addAttribute("title", "Editar beca");
        model.addAttribute("support", support);
        return "support-form";
    }

    @GetMapping("/support/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id>0){
            service.delete(id);
        }
        return "redirect:/support/list";
    }
}
