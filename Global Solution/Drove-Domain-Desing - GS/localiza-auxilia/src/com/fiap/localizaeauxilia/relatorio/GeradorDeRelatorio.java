package com.fiap.localizaeauxilia.relatorio;

import com.fiap.localizaeauxilia.alimento.Alimento;
import com.fiap.localizaeauxilia.bioma.Bioma;
import com.fiap.localizaeauxilia.localizacao.Pais;
import com.fiap.localizaeauxilia.localizacao.Regiao;

public class GeradorDeRelatorio {

	//MÉTODO QUE GERA O RELATÓRIO FINAL NO TERMINAL COM TODAS AS INFORMAÇÕES, COM BASE NAS ESCOLHAS DE MENU DO USUÁRIO..
	public static String gerarRelatorio(Pais pais, String nomeRegiao) {
		Regiao regiao = pais.getRegioes().stream()
				.filter(regiaoBrasil -> regiaoBrasil.getNome().equalsIgnoreCase(nomeRegiao))
				.findAny().get();

		StringBuilder sb = new StringBuilder();

		sb.append("===== Relatório do País: ").append(pais.getNome()).append(" =====").append("\n")
				.append("Região: ").append(regiao.getNome()).append("\n")
				.append("=====================\n");

		regiao.getBiomas().forEach(bioma -> sb.append(geraTextoBioma(bioma)));

		sb.append("===== Fim do relatório =====");
		return sb.toString();
	}

	//MÉTODO QUE GERA AS INFORMAÇÕES DE TEXTO NO TERMINAL SOBRE OS BIOMAS..
	private static String geraTextoBioma(Bioma bioma) {
		StringBuilder sb = new StringBuilder();

		sb.append("=====================\n");
		sb.append("Bioma: ").append(bioma.getNome()).append("\n");

		sb.append("=====================\n");
		sb.append("Alimentos:").append("\n");
		bioma.getAlimentos().forEach(alimento -> sb.append(geraTextoAlimento(alimento)));
		sb.append("=====================\n");

		sb.append("Tipo de Plantio:").append("\n")
				.append("-> ").append(bioma.getTipoDePlantio()).append("\n")
				.append("=====================\n")
				.append("Técnica de plantação:").append("\n")
				.append("-> ").append(bioma.getTecnicaDePlantacao()).append("\n")
				.append("=====================\n")
				.append("Centros comerciais mais próximos:").append("\n")
				.append("-> ").append(bioma.getCentrosComerciais()).append("\n")
				.append("=====================\n")
				.append("Meios de transporte: ").append("\n")
				.append("-> ").append(bioma.getMeiosDeTransporte()).append("\n")
				.append("=====================\n")
				.append("\n");

		return sb.toString();
	}

	//MÉTODO QUE GERA AS INFORMAÇÕES DE TEXTO NO TERMINAL SOBRE OS ALIMENTOS.
	private static String geraTextoAlimento(Alimento alimento) {
		return new StringBuilder()
				.append("-> Nome: ").append(alimento.getNome()).append(" | ")
				.append("Categoria: ").append(alimento.getCategoria().getNome())
				.append("\n").toString();
	}
}
