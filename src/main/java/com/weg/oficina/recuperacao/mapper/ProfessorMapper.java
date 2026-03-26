package com.weg.oficina.recuperacao.mapper;

import com.weg.oficina.recuperacao.dto.professor.ProfessorRequestDto;
import com.weg.oficina.recuperacao.dto.professor.ProfessorResponseDto;
import com.weg.oficina.recuperacao.model.Professor;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapper {

    public Professor paraEntidade(ProfessorRequestDto requestDto){
        return new Professor(
                requestDto.nome(),
                requestDto.email()
        );
    }

    public ProfessorResponseDto paraDto(Professor professor){
        return new ProfessorResponseDto(
                professor.getId(),
                professor.getNome(),
                professor.getEmail()
        );
    }
}
