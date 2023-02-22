package com.eventoapp.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.io.Serializable;
import java.util.List;

@Entity
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;

    //Classe responsável pela construção do objeto evento

    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    //NotEmpty não é definido ao código pois ele é gerado automaticamente
    //NotEmpty foi atribuído a quase todos os atributos

    @NotEmpty
    private String nome;

    @NotEmpty
    private String local;

    @NotEmpty
    private String data;

    @NotEmpty
    private String horario;

    //Getters e setters abaixo

    @OneToMany
    private List<Convidado> convidados;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
}
