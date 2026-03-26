package com.weg.oficina.recuperacao.service;

import com.weg.oficina.recuperacao.dto.professor.ProfessorRequestDto;
import com.weg.oficina.recuperacao.dto.professor.ProfessorResponseDto;
import com.weg.oficina.recuperacao.mapper.ProfessorMapper;
import com.weg.oficina.recuperacao.model.Professor;
import com.weg.oficina.recuperacao.repository.ProfessorRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository repository;
    private final ProfessorMapper mapper;

    public ProfessorResponseDto criar(ProfessorRequestDto requestDto){
        Professor professor = mapper.paraEntidade(requestDto);
        repository.save(professor);
        return mapper.paraDto(professor);
    }

    public List<ProfessorResponseDto> listarProfessores(){
        List<Professor> professores = repository.findAll();
        return professores.stream()
                .map(mapper::paraDto)
                .toList();
    }

}
