package com.weg.oficina.recuperacao.controller;

import com.weg.oficina.recuperacao.dto.turma.TurmaRequestDto;
import com.weg.oficina.recuperacao.dto.turma.TurmaResponseDto;
import com.weg.oficina.recuperacao.service.TurmaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turma")
@RequiredArgsConstructor
public class TurmaController {

    private final TurmaService service;

    @PostMapping
    public TurmaResponseDto criar(@RequestBody TurmaRequestDto requestDto){
        return service.criar(requestDto);
    }

    @GetMapping
    public List<TurmaResponseDto> listar(){
        return service.turmas();
    }
}
