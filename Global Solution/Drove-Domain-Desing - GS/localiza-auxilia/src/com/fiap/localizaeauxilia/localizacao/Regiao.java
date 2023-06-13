package com.fiap.localizaeauxilia.localizacao;


import com.fiap.localizaeauxilia.bioma.Bioma;

import java.util.Collection;
import java.util.Vector;
import java.util.stream.Collectors;

public class Regiao extends Localizacao {

    private Vector<Bioma> biomas;

    public Regiao() {
    }

    public Regiao(String nome, Vector<Bioma> biomas) {
        super(nome);
        this.biomas = biomas;
    }

    public Vector<Bioma> getBiomas() {
        return biomas;
    }

    public void setBiomas(Vector<Bioma> biomas) {
        this.biomas = biomas;
    }

    @Override
    public String toString() {
        return "Regiao{" +
                "biomas=" + biomas +
                "} " + super.toString();
    }
}
