package com.bedu.example1.service;

import com.bedu.example1.model.Contacto;
import com.bedu.example1.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;

    public void deleteContacto(Integer id) {
        contactoRepository.deleteById(id);
    }

    public void deleteAllContactos() {
        contactoRepository.deleteAll();
    }

    public Contacto getContacto(Integer id) {
        return contactoRepository.findById(id).orElse(null);
    }

    public List<Contacto> getContactos() {
        return contactoRepository.findAll();
    }

    public void saveContacto(Contacto contacto) {
        Integer id = contacto.getId();
        if (id == null || contactoRepository.findById(id).isEmpty()) {
            contactoRepository.save(contacto);
        }
    }

    public Contacto updateContacto(Integer id, Contacto contacto){
        if (contactoRepository.findById(id).isPresent()) {
            contacto.setId(id);
            return contactoRepository.save(contacto);
        } else {
            throw new RuntimeException("No existe el contacto con el id proporcionado");
        }
    }
}
