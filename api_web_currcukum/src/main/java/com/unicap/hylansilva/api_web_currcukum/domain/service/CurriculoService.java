package com.unicap.hylansilva.api_web_currcukum.domain.service;

import java.util.List;
import java.util.Optional;

import com.unicap.hylansilva.api_web_currcukum.domain.entity.Curriculo;

public interface CurriculoService {
    Curriculo save(Curriculo data);
    Optional<Curriculo> findById(Long id);
    List<Curriculo> findAll();
    void deleteById(Long id);
}
