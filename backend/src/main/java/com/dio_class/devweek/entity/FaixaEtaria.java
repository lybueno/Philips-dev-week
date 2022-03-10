package com.dio_class.devweek.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FaixaEtaria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer faixaInicial;
    private Integer faixaFinal;
    private String descricao;

    public FaixaEtaria() {
    }

    public FaixaEtaria(Integer faixaInicial, Integer faixaFinal, String descricao) {
        this.faixaInicial = faixaInicial;
        this.faixaFinal = faixaFinal;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public Integer getFaixaInicial() {
        return faixaInicial;
    }

    public void setFaixaInicial(Integer faixaInicial) {
        this.faixaInicial = faixaInicial;
    }

    public Integer getFaixaFinal() {
        return faixaFinal;
    }

    public void setFaixaFinal(Integer faixaFinal) {
        this.faixaFinal = faixaFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
