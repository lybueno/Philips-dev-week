package com.dio_class.devweek.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IncidenciaExame {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer RegiaoId;
    private Integer mes;
    private Long faixa_id;
    private Integer qtdExames;

    public IncidenciaExame() {
    }

    public IncidenciaExame(Integer regiaoId, Integer mes, Long faixa_id, Integer qtdExames) {
        RegiaoId = regiaoId;
        this.mes = mes;
        this.faixa_id = faixa_id;
        this.qtdExames = qtdExames;
    }

    public Long getId() {
        return id;
    }

    public Integer getRegiaoId() {
        return RegiaoId;
    }

    public void setRegiaoId(Integer regiaoId) {
        RegiaoId = regiaoId;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Long getFaixa_id() {
        return faixa_id;
    }

    public void setFaixa_id(Long faixa_id) {
        this.faixa_id = faixa_id;
    }

    public Integer getQtdExames() {
        return qtdExames;
    }

    public void setQtdExames(Integer qtdExames) {
        this.qtdExames = qtdExames;
    }
}
