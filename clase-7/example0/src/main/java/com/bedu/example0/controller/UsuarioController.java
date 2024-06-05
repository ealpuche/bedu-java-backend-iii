package com.bedu.example0.controller;


import com.bedu.example0.model.Usuario;
import com.bedu.example0.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }

    @PostMapping("/usuarios")
    public Usuario addUsuario(@RequestBody @Valid Usuario usuario){
        return usuarioService.addUsuario(usuario);
    }
}
