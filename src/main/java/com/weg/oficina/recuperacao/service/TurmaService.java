package com.weg.oficina.recuperacao.service;

import com.weg.oficina.recuperacao.dto.turma.TurmaRequestDto;
import com.weg.oficina.recuperacao.dto.turma.TurmaResponseDto;
import com.weg.oficina.recuperacao.mapper.TurmaMapper;
import com.weg.oficina.recuperacao.model.Turma;
import com.weg.oficina.recuperacao.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TurmaService {

    private final TurmaRepository repository;
    private final TurmaMapper mapper;

    public TurmaResponseDto criar(TurmaRequestDto requestDto){
        Turma turma = mapper.paraEntidade(requestDto);
        repository.save(turma);
        return mapper.paraDto(turma);
    }

    public List<TurmaResponseDto> turmas(){
        return repository.findAll().stream()
                .map(mapper::paraDto)
                .toList();
    }
}
