package com.fiap.localizaeauxilia.bioma;

import com.fiap.localizaeauxilia.alimento.Alimento;

import java.util.Vector;

public class Bioma {
	private String nome;
	private String tipoDePlantio;
	private String tecnicaDePlantacao;
	private String centrosComerciais;
	private String meiosDeTransporte;
	private Vector<Alimento> alimentos;

	public Bioma() {
	}

	public Bioma(String nome, String tipoDePlantio, String tecnicaDePlantacao, String centrosComerciais, String meiosDeTransporte, Vector<Alimento> alimentos) {
		this.nome = nome;
		this.tipoDePlantio = tipoDePlantio;
		this.tecnicaDePlantacao = tecnicaDePlantacao;
		this.centrosComerciais = centrosComerciais;
		this.meiosDeTransporte = meiosDeTransporte;
		this.alimentos = alimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoDePlantio() {
		return tipoDePlantio;
	}

	public void setTipoDePlantio(String tipoDePlantio) {
		this.tipoDePlantio = tipoDePlantio;
	}

	public String getTecnicaDePlantacao() {
		return tecnicaDePlantacao;
	}

	public void setTecnicaDePlantacao(String tecnicaDePlantacao) {
		this.tecnicaDePlantacao = tecnicaDePlantacao;
	}

	public String getCentrosComerciais() {
		return centrosComerciais;
	}

	public void setCentrosComerciais(String centrosComerciais) {
		this.centrosComerciais = centrosComerciais;
	}

	public String getMeiosDeTransporte() {
		return meiosDeTransporte;
	}

	public void setMeiosDeTransporte(String meiosDeTransporte) {
		this.meiosDeTransporte = meiosDeTransporte;
	}

	public Vector<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(Vector<Alimento> alimentos) {
		this.alimentos = alimentos;
	}


	@Override
	public String toString() {
		return "Bioma{" +
				"nome='" + nome + '\'' +
				", tipoDePlantio='" + tipoDePlantio + '\'' +
				", tecnicaDePlantacao='" + tecnicaDePlantacao + '\'' +
				", centrosComerciais='" + centrosComerciais + '\'' +
				", meiosDeTransporte='" + meiosDeTransporte + '\'' +
				", alimentos=" + alimentos +
				'}';
	}
}
