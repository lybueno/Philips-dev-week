package com.dio_class.devweek.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_regiao")
public class Regiao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String regiao;
    private Integer totalExames;

    public Regiao() {
    }

    public Regiao(String regiao, Integer totalExames) {
        this.regiao = regiao;
        this.totalExames = totalExames;
    }

    public Long getId() {
        return id;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Integer getTotalExames() {
        return totalExames;
    }

    public void setTotalExames(Integer totalExames) {
        this.totalExames = totalExames;
    }
}
