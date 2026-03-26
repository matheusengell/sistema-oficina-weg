package com.weg.oficina.recuperacao.model;

import com.weg.oficina.recuperacao.model.enums.StatusOS;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ordemServico")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String equipamento;

    @Column(nullable = false)
    private String defeitoRelatorio;

    private StatusOS status;

    private String materiais;
    private String laudoTecnico;

    public OrdemServico(String equipamento, String defeitoRelatorio, StatusOS status, String materiais, String laudoTecnico) {
        this.equipamento = equipamento;
        this.defeitoRelatorio = defeitoRelatorio;
        this.status = status;
        this.materiais = materiais;
        this.laudoTecnico = laudoTecnico;
    }
}
