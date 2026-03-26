package com.weg.oficina.recuperacao.dto.ordemServico;

import com.weg.oficina.recuperacao.model.enums.StatusOS;
import jakarta.persistence.Column;

public record OrdemServicoRequestDto(
         String equipamento,
         String defeitoRelatorio,
         StatusOS status,
         String materiais,
         String laudoTecnico
) {
}
