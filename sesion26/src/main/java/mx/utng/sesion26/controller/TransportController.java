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
import mx.utng.sesion26.model.entity.Transport;
import mx.utng.sesion26.model.service.ITransportSerivice;

@Controller
@SessionAttributes("transport")
public class TransportController {
    @Autowired
    private ITransportSerivice service;

    @GetMapping({"transport","transport","transport/list"})
    public String list(Model model){
        model.addAttribute("title", "Listado de transportes");
        model.addAttribute("transports", service.list());
        return "transport-list";
    }

    @GetMapping("/transport/form")
    public String create(Model model){
        model.addAttribute("title", "Formulario de Trasportes");
        model.addAttribute("transports", new Transport());
        return "transport-form";
    }

    @PostMapping("/transport/form")
    public String save(@Valid Transport transport, BindingResult br, Model model){
        if(br.hasErrors()){
            model.addAttribute("title", "Formulario de transportes");
            return "transport-form";
        }
        service.save(transport);
        return "redirect:/transport/list";
    }

    @GetMapping("/transport/form/{id}")
    public String update(@PathVariable Long id, Model model){
        Transport transport = null;
        if(id>0){
            transport = service.getById(id);
        }else{
            return "redirect:/transport/list";
        }
        model.addAttribute("title", "Editar Transporte");
        model.addAttribute("transport", transport);
        return "transport-form";
    }

    @GetMapping("/transport/delete/{id}")
    public String delete(@PathVariable Long id, Model model){
        if(id>0){
            service.delete(id);
        }
        return "redirect:/transport/list";
    }
}
