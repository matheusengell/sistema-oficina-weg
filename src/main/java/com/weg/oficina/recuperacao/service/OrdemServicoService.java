package com.weg.oficina.recuperacao.service;

import com.weg.oficina.recuperacao.dto.ordemServico.OrdemServicoRequestDto;
import com.weg.oficina.recuperacao.dto.ordemServico.OrdemServicoResponseDto;
import com.weg.oficina.recuperacao.mapper.OrdemServicoMapper;
import com.weg.oficina.recuperacao.model.Aluno;
import com.weg.oficina.recuperacao.model.OrdemServico;
import com.weg.oficina.recuperacao.model.Professor;
import com.weg.oficina.recuperacao.model.enums.StatusOS;
import com.weg.oficina.recuperacao.repository.AlunoRepository;
import com.weg.oficina.recuperacao.repository.OrdemServicoRepository;
import com.weg.oficina.recuperacao.repository.ProfessorRepository;
import com.weg.oficina.recuperacao.repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdemServicoService {

    private final OrdemServicoRepository ordemServicoRepository;
    private final AlunoRepository alunoRepository;
    private final ProfessorRepository professorRepository;
    private final TurmaRepository turmaRepository;
    private final OrdemServicoMapper mapper;

    public OrdemServicoResponseDto criarOrdemServico(OrdemServicoRequestDto requestDto){
        Professor professor = professorRepository.findById(requestDto.idProfessor())
                .orElseThrow(()-> new RuntimeException("Professor não encontrado") );

        List<Aluno> alunos = alunoRepository.findAllById(requestDto.idAluno());
        if (alunos.isEmpty()){
            throw new RuntimeException("Necessário pelo menos 1 aluno");
        }

        OrdemServico ordemServico = mapper.paraEntidade(requestDto, professor, alunos);
        ordemServico.setStatus(StatusOS.EXECUTANDO);

        OrdemServico salvar = ordemServicoRepository.save(ordemServico);
        return mapper.paraDto(ordemServico);
    }

    public List<OrdemServicoResponseDto> listarTodas(){
        List<OrdemServico> ordemServicos = ordemServicoRepository.findAll();

        return ordemServicos.stream()
                .map(mapper::paraDto)
                .toList();
    }


}
