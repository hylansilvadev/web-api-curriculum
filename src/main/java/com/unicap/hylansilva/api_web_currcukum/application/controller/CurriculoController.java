package com.unicap.hylansilva.api_web_currcukum.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicap.hylansilva.api_web_currcukum.domain.entity.Curriculo;
import com.unicap.hylansilva.api_web_currcukum.domain.service.CurriculoService;



@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {
    
    @Autowired
    private CurriculoService curriculoService;

    @GetMapping()
    public List<Curriculo> getAllCurriculos() {
        return curriculoService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curriculo> getCurriculoById(@PathVariable Long id) {
        Optional<Curriculo> curriculo = curriculoService.findById(id);
        return curriculo.map(ResponseEntity::ok)
                        .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @PostMapping()
    public Curriculo createCurriculo(@RequestBody Curriculo curriculo) {
        return curriculoService.save(curriculo);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Curriculo> updateCurriculoById(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        if (!curriculo.getId().equals(id)) {
            return ResponseEntity.badRequest().build();
        }

        Curriculo updatedCurriculo = curriculoService.save(curriculo);
        return ResponseEntity.ok(updatedCurriculo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCurriculo(@PathVariable Long id) {
        curriculoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
