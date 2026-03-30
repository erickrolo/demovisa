package com.example.demovisa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demovisa.model.VisaModel;
import com.example.demovisa.repository.VisaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visas")
public class VisaController {

    private final VisaRepository visaRepository;

    public VisaController(VisaRepository visaRepository) {
        this.visaRepository = visaRepository;
    }

    // ✅ POST - Crear una nueva visa
    @PostMapping
    public VisaModel createVisa(@RequestBody VisaModel visa) {
        visa.setStatus("PENDING");
        return visaRepository.save(visa);
    }

    // ✅ GET - Obtener todas las visas
    @GetMapping
    public List<VisaModel> getAllVisas() {
        return visaRepository.findAll();
    }

    // ✅ GET - Obtener visas por estado (INTERESANTE)
    @GetMapping("/status/{status}")
    public List<VisaModel> getVisasByStatus(@PathVariable String status) {
        return visaRepository.findByStatus(status.toUpperCase());
    }
}
