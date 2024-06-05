package com.bedu.example1.controller;

import com.bedu.example1.model.Contacto;
import com.bedu.example1.service.ContactoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping("/")
    public List<Contacto> getContactos() {
        return contactoService.getContactos();
    }

    @GetMapping("/{id}")
    public Contacto getContacto(@PathVariable Integer id) {
        return contactoService.getContacto(id);
    }

    @DeleteMapping("/{id}")
    public void deleteContacto(@PathVariable Integer id) {
        contactoService.deleteContacto(id);
    }

    @PutMapping("/")
    public void createContacto(@RequestBody @Valid Contacto contacto) {
        contactoService.saveContacto(contacto);
    }

    @PutMapping("/{id}")
    public Contacto updateContacto(@PathVariable Integer id, @RequestBody Contacto contacto) {
        return contactoService.updateContacto(id, contacto);
    }

}
