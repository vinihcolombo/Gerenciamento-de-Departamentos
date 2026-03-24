package com.example.departamento.models;

import jakarta.persistence.*;

@Entity
public class DepartamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(name = "LocalizacaoDepartamento")
    private String localizacao;

    //Contrutor
    public DepartamentoModel() {
    }

    //Getters e Setters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}