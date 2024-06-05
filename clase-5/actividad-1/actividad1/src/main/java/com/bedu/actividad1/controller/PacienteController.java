package com.bedu.actividad1.controller;

import com.bedu.actividad1.model.Paciente;
import com.bedu.actividad1.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @GetMapping("/pacientes")
    public HashMap<Integer, Paciente> getPacientes(){
        return pacienteService.getPacientes();
    }

    @GetMapping("/cantidadPacientes")
    public int getCantidadPacientes(){
        return pacienteService.getCantidadPacientes();
    }

    @PutMapping("/pacientes")
    public Paciente addPaciente(@RequestBody Paciente paciente){
        return pacienteService.addPaciente(paciente);
    }

}
