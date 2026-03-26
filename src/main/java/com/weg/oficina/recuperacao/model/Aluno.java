package com.weg.oficina.recuperacao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;


    @ManyToMany(mappedBy = "alunosEscalados")
    private List<Aluno> alunos;

    public Aluno(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
