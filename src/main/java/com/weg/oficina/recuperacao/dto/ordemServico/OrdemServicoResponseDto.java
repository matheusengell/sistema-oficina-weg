package com.weg.oficina.recuperacao.dto.ordemServico;

import com.weg.oficina.recuperacao.model.enums.StatusOS;

public record OrdemServicoResponseDto(

        Long id,
        String equipamento,
        String defeitoRelatorio,
        StatusOS status,
        String materiais,
        String laudoTecnico
) {
}
