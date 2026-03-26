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
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private int ano;


    @OneToMany(mappedBy = "turma")
    private List<Aluno> alunos;

    public Turma(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }
}
