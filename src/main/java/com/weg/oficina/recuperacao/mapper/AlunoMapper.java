package com.weg.oficina.recuperacao.mapper;

import com.weg.oficina.recuperacao.dto.aluno.AlunoRequestDto;
import com.weg.oficina.recuperacao.dto.aluno.AlunoResponseDto;
import com.weg.oficina.recuperacao.model.Aluno;
import com.weg.oficina.recuperacao.model.Turma;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

    public Aluno paraEntidade(AlunoRequestDto requestDto, Turma turma){
        return new Aluno(
                requestDto.nome(),
                requestDto.email(),
                turma
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
