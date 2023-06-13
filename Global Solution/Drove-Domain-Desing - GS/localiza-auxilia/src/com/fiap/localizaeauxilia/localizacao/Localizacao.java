package com.fiap.localizaeauxilia.localizacao;

public abstract class Localizacao {
    private String nome;

    public Localizacao() {
    }

    public Localizacao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Localizacao{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
