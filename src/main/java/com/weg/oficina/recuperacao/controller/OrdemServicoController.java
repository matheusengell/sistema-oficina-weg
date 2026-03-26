package com.weg.oficina.recuperacao.controller;

import com.weg.oficina.recuperacao.dto.ordemServico.OrdemServicoRequestDto;
import com.weg.oficina.recuperacao.dto.ordemServico.OrdemServicoResponseDto;
import com.weg.oficina.recuperacao.model.OrdemServico;
import com.weg.oficina.recuperacao.service.OrdemServicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ordemServico")
@RequiredArgsConstructor
public class OrdemServicoController {

    private final OrdemServicoService service;

    @PostMapping
    public OrdemServicoResponseDto criar(@RequestBody OrdemServicoRequestDto requestDto){
        return service.criarOrdemServico(requestDto);
    }

    @GetMapping
    public List<OrdemServicoResponseDto> listarTodas(){
        return service.listarTodas();
    }

    @PutMapping("/{id}/executar")
    public OrdemServicoResponseDto registrarDevolucao(@PathVariable Long id, @RequestBody OrdemServicoRequestDto requestDto){
       return service.registrarDevolucao(id, requestDto);
    }
}
