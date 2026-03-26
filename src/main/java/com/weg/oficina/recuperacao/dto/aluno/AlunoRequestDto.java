package com.weg.oficina.recuperacao.dto.aluno;

public record AlunoRequestDto(
        String nome,
        String email,
        Long idTurma
) {
}
