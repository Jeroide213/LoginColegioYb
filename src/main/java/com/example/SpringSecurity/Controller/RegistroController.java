package com.example.SpringSecurity.Controller;

import com.example.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistroController {
    @Autowired
    private UserService  userService;
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/")
    public String verPaginaInicio(Model modelo){
        modelo.addAttribute("usuarios", userService.listarUsuarios());
        return "index";
    }
}
