package com.bedu.example0.service;


import com.bedu.example0.model.Usuario;
import com.bedu.example0.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario addUsuario(Usuario usuario){
        return usuarioRepository.addUsuario(usuario);
    }

    public Usuario getUsuario(String email){
        return usuarioRepository.getUsuario(email);
    }

    public Usuario updateUsuario(String email, Usuario usuario){
        return usuarioRepository.updateUsuario(email, usuario);
    }

    public void deleteUsuario(String email){
        usuarioRepository.deleteUsuario(email);
    }

    public List<Usuario> getUsuarios(){
        return usuarioRepository.getUsuarios();
    }

    public int contarUsuarios(){
        return usuarioRepository.getUsuarios().size();
    }

    public List<Usuario> getUsuariosPorDominio(String dominio){
        List<Usuario> usuarios = usuarioRepository.getUsuarios();
        List<Usuario> usuariosFiltrados = new ArrayList<>();
        for(Usuario usuario: usuarios){
            if(usuario.getEmail().endsWith(dominio)){
                usuariosFiltrados.add(usuario);
            }
        }
        return usuariosFiltrados;
    }









}
