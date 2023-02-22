package com.eventoapp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Convidado {

    //Classe responsável pela construção do objeto convidado

    //Atributos
    //NotEmpty foi atribuído aos dois atributos
    @Id
    @NotEmpty
    private String rg;

    @NotEmpty
    private String nomeConvidado;

    @ManyToOne
    private Evento evento;

    //Getters e setters

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeConvidado() {
        return nomeConvidado;
    }

    public void setNomeConvidado(String nomeConvidado) {
        this.nomeConvidado = nomeConvidado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}