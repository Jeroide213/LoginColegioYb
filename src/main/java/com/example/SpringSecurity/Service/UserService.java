package com.example.SpringSecurity.Service;

import com.example.SpringSecurity.Dto.UsuarioRegistroDto;
import com.example.SpringSecurity.Models.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    Usuario guardar(UsuarioRegistroDto registroDTO);

    List<Usuario> listarUsuarios();

    public interface UsuarioServicio extends UserDetailsService{

        public Usuario guardar(UsuarioRegistroDto registroDTO);

        public List<Usuario> listarUsuarios();
    }
}
