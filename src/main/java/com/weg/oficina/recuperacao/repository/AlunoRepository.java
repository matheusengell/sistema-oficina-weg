package com.weg.oficina.recuperacao.repository;

import com.weg.oficina.recuperacao.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
