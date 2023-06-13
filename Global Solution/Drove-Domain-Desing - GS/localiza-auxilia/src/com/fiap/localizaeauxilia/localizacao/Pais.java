package com.fiap.localizaeauxilia.localizacao;

import java.util.Vector;

public class Pais extends Localizacao {

    private Vector<Regiao> regioes;
    private Continente continente;

    public Pais() {
    }

    public Pais(String nome, Vector<Regiao> regioes, Continente continente) {
        super(nome);
        this.regioes = regioes;
        this.continente = continente;
    }

    public Vector<Regiao> getRegioes() {
        return regioes;
    }

    public void setRegioes(Vector<Regiao> regioes) {
        this.regioes = regioes;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }


    @Override
    public String toString() {
        return "Pais{" +
                "regioes=" + regioes +
                ", continente=" + continente +
                "} " + super.toString();
    }
}
