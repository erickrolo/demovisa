package com.example.demovisa.repository;


import com.example.demovisa.model.VisaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisaRepository extends JpaRepository<VisaModel, Long> {

    List<VisaModel> findByStatus(String status);
}