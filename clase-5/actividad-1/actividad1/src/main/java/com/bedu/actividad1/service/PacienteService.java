package com.bedu.actividad1.service;


import com.bedu.actividad1.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PacienteService {
    HashMap<Integer, Paciente> pacientes = new HashMap<Integer, Paciente>();

    public Paciente addPaciente(Paciente paciente){
        pacientes.put(paciente.getId(), paciente);
        return paciente;
    }

    // int Integer

    public HashMap<Integer, Paciente> getPacientes(){
        return pacientes;
    }

    public int getCantidadPacientes(){
        return pacientes.size();
    }


}
