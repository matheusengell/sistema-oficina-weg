package com.weg.oficina.recuperacao.mapper;

import com.weg.oficina.recuperacao.dto.aluno.AlunoRequestDto;
import com.weg.oficina.recuperacao.dto.aluno.AlunoResponseDto;
import com.weg.oficina.recuperacao.model.Aluno;

public class AlunoMapper {

    public Aluno paraEntidade(AlunoRequestDto requestDto){
        return new Aluno(
                requestDto.nome(),
                requestDto.email()
        );
    }

    public AlunoResponseDto paraDto(Aluno aluno){
        return new AlunoResponseDto(
                aluno.getId(),
                aluno.getNome(),
                aluno.getEmail()
        );
    }

}
