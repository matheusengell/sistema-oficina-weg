package com.weg.oficina.recuperacao.dto.aluno;

import jakarta.persistence.Column;

public record AlunoResponseDto(
         Long id,
         String nome,
         String email
) {
}
