package com.bedu.example0.repository;


import com.bedu.example0.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    List<Usuario> usuarios = new ArrayList<>();

    public Usuario addUsuario(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    public Usuario getUsuario(String email){
        for(Usuario usuario: usuarios){
            if(usuario.getEmail().equals(email)){
                return usuario;
            }
        }
        return null;
    }

    public Usuario updateUsuario(String email, Usuario usuario){
        for(Usuario u: usuarios){
            if(u.getEmail().equals(email)){
                u.setNombre(usuario.getNombre());
                u.setApellido(usuario.getApellido());
                u.setDireccion(usuario.getDireccion());
                u.setEmail(usuario.getEmail());
                return u;
            }
        }
        return null;
    }

    public void deleteUsuario(String email){
        usuarios.removeIf(u -> u.getEmail().equals(email));
    }

}
