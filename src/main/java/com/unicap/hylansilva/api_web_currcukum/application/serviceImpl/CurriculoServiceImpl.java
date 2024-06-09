package com.unicap.hylansilva.api_web_currcukum.application.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicap.hylansilva.api_web_currcukum.domain.entity.Curriculo;
import com.unicap.hylansilva.api_web_currcukum.domain.repository.CurriculoRepository;
import com.unicap.hylansilva.api_web_currcukum.domain.service.CurriculoService;

@Service
public class CurriculoServiceImpl implements CurriculoService {

    @Autowired
    private CurriculoRepository curriculoRepository;

    @Override
    public Optional<Curriculo> findById(Long id) {
        return curriculoRepository.findById(id);
    }

    @Override
    public Curriculo save(Curriculo data) {
        return curriculoRepository.save(data);
    }

    @Override
    public List<Curriculo> findAll() {
        return curriculoRepository.findAll();
    }

	@Override
	public void deleteById(Long id) {
		curriculoRepository.deleteById(id);
	}

    
    
}
