package com.weg.oficina.recuperacao.controller;

import com.weg.oficina.recuperacao.dto.aluno.AlunoRequestDto;
import com.weg.oficina.recuperacao.dto.aluno.AlunoResponseDto;
import com.weg.oficina.recuperacao.model.Aluno;
import com.weg.oficina.recuperacao.service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {

    private final AlunoService service;

    @PostMapping
    public AlunoResponseDto criar(@RequestBody AlunoRequestDto requestDto){
        return  service.cadastrar(requestDto);
    }

    @GetMapping
    public List<AlunoResponseDto> listar(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public AlunoResponseDto listarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

}
