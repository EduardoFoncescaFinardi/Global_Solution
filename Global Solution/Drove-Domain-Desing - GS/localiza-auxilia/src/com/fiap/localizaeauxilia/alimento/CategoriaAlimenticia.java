package com.fiap.localizaeauxilia.alimento;

public enum CategoriaAlimenticia {
    CEREAIS("Cereais"),
    TUBERCULOS("Tuberculos"),
    HORTALICA("Hortaliça"),
    FRUTA("Fruta"),
    LEGUMINOSA("Leguminosa"),
    LATICINIO("Laticínio"),
    CARNE("Carne"),
    OVOS("Ovos");

    private String nome;

    CategoriaAlimenticia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
