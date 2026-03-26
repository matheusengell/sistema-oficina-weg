package com.weg.oficina.recuperacao.repository;

import com.weg.oficina.recuperacao.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
