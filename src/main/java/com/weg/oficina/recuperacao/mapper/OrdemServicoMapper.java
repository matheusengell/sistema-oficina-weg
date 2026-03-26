package com.weg.oficina.recuperacao.mapper;

import com.weg.oficina.recuperacao.dto.ordemServico.OrdemServicoRequestDto;
import com.weg.oficina.recuperacao.dto.ordemServico.OrdemServicoResponseDto;
import com.weg.oficina.recuperacao.model.Aluno;
import com.weg.oficina.recuperacao.model.OrdemServico;
import com.weg.oficina.recuperacao.model.Professor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrdemServicoMapper {

    public OrdemServico paraEntidade(OrdemServicoRequestDto requestDto, Professor professor, List<Aluno> aluno){
        return new OrdemServico(
        requestDto.equipamento(),
        requestDto.defeitoRelatorio(),
        requestDto.status(),
        requestDto.materiais(),
        requestDto.laudoTecnico(),
        professor,
        aluno

        );
    }

    public OrdemServicoResponseDto paraDto(OrdemServico ordemServico){
        return new OrdemServicoResponseDto(
                ordemServico.getId(),
                ordemServico.getEquipamento(),
                ordemServico.getDefeitoRelatorio(),
                ordemServico.getStatus(),
                ordemServico.getMateriais(),
                ordemServico.getLaudoTecnico()
        );
    }

}
