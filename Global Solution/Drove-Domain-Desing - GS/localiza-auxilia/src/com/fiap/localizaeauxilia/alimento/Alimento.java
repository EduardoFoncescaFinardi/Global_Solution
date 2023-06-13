package com.fiap.localizaeauxilia.alimento;

public class Alimento {

    private String nome;
    private CategoriaAlimenticia categoria;

    public Alimento() {
    }

    public Alimento(String nome, CategoriaAlimenticia categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaAlimenticia getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaAlimenticia categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
