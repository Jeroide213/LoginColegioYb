package com.example.SpringSecurity.Controller;

import com.example.SpringSecurity.Dto.UsuarioRegistroDto;
import com.example.SpringSecurity.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class RegistroUser {
    @Autowired
    private UserService userService;
    @ModelAttribute("usuario")
    public UsuarioRegistroDto retornarNuevoUsuarioRegistroDTO(){
        return new UsuarioRegistroDto();
    }
    @GetMapping
    public String mostrarFormularioRegistro(){
        return "registro";
    }
    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario")UsuarioRegistroDto registroDto){
        userService.guardar(registroDto);
        return "redirect:/registro?exito";
    }
}
