package com.example.SpringSecurity.Repo;

import com.example.SpringSecurity.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    public Usuario findByEmail(String email);
}
