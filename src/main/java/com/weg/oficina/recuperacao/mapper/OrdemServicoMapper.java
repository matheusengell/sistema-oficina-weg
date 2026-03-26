package com.weg.oficina.recuperacao.mapper;

import com.weg.oficina.recuperacao.dto.ordemServico.OrdemServicoRequestDto;
import com.weg.oficina.recuperacao.dto.ordemServico.OrdemServicoResponseDto;
import com.weg.oficina.recuperacao.model.OrdemServico;

public class OrdemServicoMapper {

    public OrdemServico paraEntidade(OrdemServicoRequestDto requestDto){
        return new OrdemServico(
        requestDto.equipamento(),
        requestDto.defeitoRelatorio(),
        requestDto.status(),
        requestDto.materiais(),
        requestDto.laudoTecnico()
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
