package com.weg.oficina.recuperacao.service;

import com.weg.oficina.recuperacao.dto.aluno.AlunoRequestDto;
import com.weg.oficina.recuperacao.dto.aluno.AlunoResponseDto;
import com.weg.oficina.recuperacao.mapper.AlunoMapper;
import com.weg.oficina.recuperacao.model.Aluno;
import com.weg.oficina.recuperacao.model.Turma;
import com.weg.oficina.recuperacao.repository.AlunoRepository;
import com.weg.oficina.recuperacao.repository.TurmaRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository repository;
    private final AlunoMapper mapper;
    private final TurmaRepository turmaRepository;


    public AlunoResponseDto cadastrar(AlunoRequestDto requestDto){
        Turma turma = turmaRepository.findById(requestDto.idTurma())
                .orElseThrow(()-> new RuntimeException("Turma não encontrada"));

        Aluno aluno = mapper.paraEntidade(requestDto, turma);
        repository.save(aluno);
        return mapper.paraDto(aluno);
    }


    public List<AlunoResponseDto> listarTodos(){
        List<Aluno> alunos = repository.findAll();

        return alunos.stream()
                .map(mapper::paraDto)
                .toList();
    }

    public AlunoResponseDto buscarPorId(Long id){
        Aluno aluno = repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Aluno não encontrado"));
        return mapper.paraDto(aluno);
    }


}
