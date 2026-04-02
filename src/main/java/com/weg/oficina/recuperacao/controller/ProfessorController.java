package com.weg.oficina.recuperacao.controller;

import com.weg.oficina.recuperacao.dto.professor.ProfessorRequestDto;
import com.weg.oficina.recuperacao.dto.professor.ProfessorResponseDto;
import com.weg.oficina.recuperacao.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
@RequiredArgsConstructor
public class ProfessorController {

    private final ProfessorService service;

    @PostMapping
    public ProfessorResponseDto criar(@RequestBody ProfessorRequestDto requestDto){
        return service.criar(requestDto);
    }

    @GetMapping
    public List<ProfessorResponseDto> listarProfessores(){
        return service.listarProfessores();
    }

}
