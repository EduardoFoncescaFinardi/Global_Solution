package com.fiap.localizaeauxilia;


import com.fiap.localizaeauxilia.localizacao.Continente;
import com.fiap.localizaeauxilia.localizacao.GeradorDePais;
import com.fiap.localizaeauxilia.localizacao.Pais;
import com.fiap.localizaeauxilia.localizacao.Regiao;
import com.fiap.localizaeauxilia.relatorio.GeradorDeRelatorio;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import javax.swing.*;


public class Main {

	public static void main(String[] args) {
		int opcaoMenu = 0;
		Vector<Pais> paises = GeradorDePais.gerarPaises();

		while (opcaoMenu == 0) {

			String continente = JOptionPane.showInputDialog(geraMenuContinente());

			Continente continenteSelecionado;

			if ("1".equalsIgnoreCase(continente)) {
				continenteSelecionado = Continente.AMERICA;
			} else {
				continue;
			}

			List<Pais> paisesFiltrados = paises.stream()
					.filter(pais -> continenteSelecionado.equals(pais.getContinente()))
					.collect(Collectors.toList());

			if (paisesFiltrados.isEmpty()) {
				JOptionPane.showMessageDialog(null,"Não há nenhum pais nesse continente! \nTente novamente.");
				continue;
			}

			String pais = JOptionPane.showInputDialog(gerarMenuPaises(paisesFiltrados));

			Pais paisSelecionado;

			if ("1".equalsIgnoreCase(pais)) {
				paisSelecionado = paisesFiltrados.stream()
						.filter(p -> p.getNome().equalsIgnoreCase("Brasil"))
						.findAny().get();
			} else {
				JOptionPane.showMessageDialog(null,"Você digitou o nome do país errado! \nTente novamente.");
				continue;
			}


			String regiao = JOptionPane.showInputDialog(gerarMenuRegioes(paisSelecionado.getRegioes()));

			Regiao regiaoSelecionada;

			if ("1".equalsIgnoreCase(regiao)) {
				regiaoSelecionada = paisSelecionado.getRegioes().stream()
						.filter(reg -> reg.getNome().equalsIgnoreCase("Norte"))
						.findAny().get();
			} else if ("2".equalsIgnoreCase(regiao)) {
				regiaoSelecionada = paisSelecionado.getRegioes().stream()
						.filter(reg -> reg.getNome().equalsIgnoreCase("Sul"))
						.findAny().get();
			} else if ("3".equalsIgnoreCase(regiao)) {
				regiaoSelecionada = paisSelecionado.getRegioes().stream()
						.filter(reg -> reg.getNome().equalsIgnoreCase("Nordeste"))
						.findAny().get();
			} else if ("4".equalsIgnoreCase(regiao)) {
				regiaoSelecionada = paisSelecionado.getRegioes().stream()
						.filter(reg -> reg.getNome().equalsIgnoreCase("Centro-Oeste"))
						.findAny().get();
			} else if ("5".equalsIgnoreCase(regiao)) {
				regiaoSelecionada = paisSelecionado.getRegioes().stream()
						.filter(reg -> reg.getNome().equalsIgnoreCase("Sudeste"))
						.findAny().get();
			} else {
				JOptionPane.showMessageDialog(null, "Você digitou o nome da região errado! \nTente novamente.");
				continue;
			}

			System.out.println(GeradorDeRelatorio.gerarRelatorio(paisSelecionado, regiaoSelecionada.getNome()));

			String escolha = JOptionPane.showInputDialog("Deseja realizar uma nova pesquisa? \n-> \"S\" para continuar\n-> Qualquer tecla para sair");

			if (!escolha.equalsIgnoreCase("s"))
				opcaoMenu = 1;
		}
	}

	//MÉTODO QUE GERA A LISTA DE CONTINENTES NO MENU QUE APARECERÁ PARA O USUÁRIO.
	private static String geraMenuContinente() {
		StringBuilder sb = new StringBuilder();

		sb.append("Digite o continente que deseja pesquisar: \n");

		List<Continente> continentes = Arrays.stream(Continente.values()).toList();

		int contador = 1;

		for (Continente continente: continentes) {
			sb.append("Digite [ ").append(contador).append(" ] ").append(continente).append("\n");
			contador++;
		}

		return sb.toString();
	}

	//MÉTODO QUE GERA A LISTA DE PAÍSES NO MENU QUE APARECERÁ PARA O USUÁRIO.
	private static String gerarMenuPaises(List<Pais> paises) {
		StringBuilder sb = new StringBuilder();

		sb.append("Digite o pais que deseja pesquisar: \n");

		int contador = 1;

		for (Pais pais: paises) {
			sb.append("Digite [ ").append(contador).append(" ] ").append(pais.getNome()).append("\n");
			contador++;
		}

		return sb.toString();
	}

	//MÉTODO QUE GERA A LISTA DE REGIÕES NO MENU QUE APARECERÁ PARA O USUÁRIO.
	private static String gerarMenuRegioes(Vector<Regiao> regioes){
		StringBuilder sb = new StringBuilder();

		sb.append("Digite a região que deseja pesquisar: \n");

		int contador = 1;

		for (Regiao regiao : regioes) {
			sb.append("Digite [ ").append(contador).append(" ] ").append(regiao.getNome()).append("\n");
			contador++;
		}

		return sb.toString();
	}
}