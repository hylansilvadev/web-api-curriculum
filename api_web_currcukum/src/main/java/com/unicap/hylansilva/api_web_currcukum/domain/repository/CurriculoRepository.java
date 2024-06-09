package com.unicap.hylansilva.api_web_currcukum.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unicap.hylansilva.api_web_currcukum.domain.entity.Curriculo;

@Repository
public interface CurriculoRepository extends JpaRepository<Curriculo, Long> {
}

