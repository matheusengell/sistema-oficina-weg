package com.weg.oficina.recuperacao.mapper;

import com.weg.oficina.recuperacao.dto.turma.TurmaRequestDto;
import com.weg.oficina.recuperacao.dto.turma.TurmaResponseDto;
import com.weg.oficina.recuperacao.model.Turma;

public class TurmaMapper {

    public Turma paraEntidade(TurmaRequestDto requestDto){
        return new Turma(
                requestDto.nome(),
                requestDto.ano()
        );
    }

    public TurmaResponseDto paraDto(Turma turma){
        return new TurmaResponseDto(
                turma.getId(),
                turma.getNome(),
                turma.getAno()
        );
    }
}
