package com.fiap.localizaeauxilia.localizacao;

import java.util.Vector;

import com.fiap.localizaeauxilia.alimento.Alimento;
import com.fiap.localizaeauxilia.alimento.CategoriaAlimenticia;
import com.fiap.localizaeauxilia.bioma.Bioma;

public class GeradorDePais {

	public static Vector<Pais> gerarPaises() {
		Vector<Pais> paises = new Vector<>();
		paises.add(gerarBrasil());

		return paises;
	}

	//MÉTODO QUE PREENCHE TODAS AS INFORMAÇÕES REFERENTE AO PAÍS BRASIL.

	//INÍCIO DA CRIAÇÃO DOS BIOMAS DA REGIÃO SUL DO BRASIL.

	//BIOMA FLORESTA AMAZÔNICA
	private static Pais gerarBrasil() {
		Alimento acai = new Alimento("Açai", CategoriaAlimenticia.FRUTA);
		Alimento cupuacu = new Alimento("Cupuaçu", CategoriaAlimenticia.FRUTA);
		Alimento pupunha = new Alimento("Pupunha", CategoriaAlimenticia.FRUTA);
		Alimento castanha = new Alimento("Castanha do Brasil", CategoriaAlimenticia.CEREAIS);
		Alimento mandioca = new Alimento("Mandioca", CategoriaAlimenticia.TUBERCULOS);
		Alimento milho = new Alimento("Milho", CategoriaAlimenticia.CEREAIS);
		Alimento feijao = new Alimento("Feijão", CategoriaAlimenticia.LEGUMINOSA);

		Vector<Alimento> alimentosFlorestaAmazonica = new Vector<>();
		alimentosFlorestaAmazonica.add(acai);
		alimentosFlorestaAmazonica.add(cupuacu);
		alimentosFlorestaAmazonica.add(pupunha);
		alimentosFlorestaAmazonica.add(castanha);
		alimentosFlorestaAmazonica.add(mandioca);
		alimentosFlorestaAmazonica.add(milho);
		alimentosFlorestaAmazonica.add(feijao);

		String nomeBioma = "Floresta Amazônica";
		String tipoDePlantio = "O tipo de plantio mais comum é o agroflorestal, que envolve a combinação de cultivos agrícolas e árvores nativas em um mesmo sistema de cultivo. ";
		String tecnicaDePlantacao = "Sistema de roça ou \"cultivo itinerante\". Nesse sistema, as árvores e a vegetação nativa são derrubadas e queimadas para a abertura de clareiras onde são cultivadas as plantações.";
		String centrosComerciais = "Geralmente ficam localizados em cidades de médio e grande porte, como Manaus, Belém e Porto Velho.";
		String meiosDeTransporte = "Fluviais (barcos e balsas) e terrestres.";

		Bioma florestaAmazonica = new Bioma(
				nomeBioma,
				tipoDePlantio,
				tecnicaDePlantacao,
				centrosComerciais,
				meiosDeTransporte,
				alimentosFlorestaAmazonica);


		//______FIM BIOMA FLORESTA AMAZÔNICA______________________________________________________________________________________________________________________________________________________________

		//BIOMA CERRADO- REGIÃO NORTE BRASILEIRA

		Alimento soja = new Alimento("Soja", CategoriaAlimenticia.CEREAIS);
		Alimento arroz = new Alimento("Arroz", CategoriaAlimenticia.CEREAIS);
		Alimento laranja = new Alimento("Laranja", CategoriaAlimenticia.FRUTA);
		Alimento limao = new Alimento("Limao", CategoriaAlimenticia.FRUTA);
		Alimento abacaxi = new Alimento("Abacaxi", CategoriaAlimenticia.FRUTA);
		Alimento maracuja = new Alimento("Maracujá", CategoriaAlimenticia.FRUTA);

		Vector<Alimento> alimentosCerrado = new Vector<>();
		alimentosCerrado.add(soja);
		alimentosCerrado.add(milho);
		alimentosCerrado.add(feijao);
		alimentosCerrado.add(arroz);
		alimentosCerrado.add(laranja);
		alimentosCerrado.add(limao);
		alimentosCerrado.add(abacaxi);
		alimentosCerrado.add(maracuja);

		String nomeBioma2 = "Cerrado";
		String tipoDePlantio2 = "No cerrado, são cultivadas principalmente culturas agrícolas.";
		String tecnicaDePlantacao2 = "No cerrado, é comum o uso da agricultura mecanizada, com o uso de maquinário agrícola para o plantio das culturas. Também tem o terraceamento, que são utilizadas para minimizar a erosão e melhorar a retenção de água. ";
		String centrosComerciais2 = "Geralmente estão localizados em Brasília, Goiânia, Cuiabá e Campo Grande.";
		String meiosDeTransporte2 = "Transporte rodoviário e ferroviário.";

		Bioma cerrado = new Bioma(
				nomeBioma2,
				tipoDePlantio2,
				tecnicaDePlantacao2,
				centrosComerciais2,
				meiosDeTransporte2,
				alimentosCerrado);

		//______FIM BIOMA CERRADO______________________________________________________________________________________________________________________________________________________________


		//INÍCIO DA CRIAÇÃO DOS BIOMAS DA REGIÃO SUL DO BRASIL

		//BIOMA MATA ATLÂNTICA

		Alimento banana = new Alimento("Banana", CategoriaAlimenticia.FRUTA);
		Alimento cacau = new Alimento("Cacau", CategoriaAlimenticia.FRUTA);
		Alimento palmito = new Alimento("Palmito", CategoriaAlimenticia.LEGUMINOSA);

		Vector<Alimento> alimentosMataAtlantica = new Vector<>();
		alimentosMataAtlantica.add(banana);
		alimentosMataAtlantica.add(abacaxi);
		alimentosMataAtlantica.add(cacau);
		alimentosMataAtlantica.add(palmito);

		String nomeBioma3 = "Mata Atlântica";
		String tipoDePlantio3 = "O plantio mais adequado é o sistema agroflorestal, que combina o cultivo de espécies agrícolas com a preservação da vegetação nativa.";
		String tecnicaDePlantacao3 = "É o plantio diversificado em sistemas agroflorestais, onde diferentes culturas são intercaladas com árvores nativas. Essa técnica ajuda a conservar a biodiversidade local, oferece maior resiliência aos impactos climáticos e contribui para a preservação do ecossistema. ";
		String centrosComerciais3 = "Na região da Mata Atlântica, existem diversos centros comerciais próximos, como São Paulo, Rio de Janeiro, Curitiba e Porto Alegre.";
		String meiosDeTransporte3 = "Transporte rodoviário, ferroviário e transporte marítimo em áreas costeiras.";

		Bioma mataAtlantica = new Bioma(
				nomeBioma3,
				tipoDePlantio3,
				tecnicaDePlantacao3,
				centrosComerciais3,
				meiosDeTransporte3,
				alimentosMataAtlantica);

		//______FIM BIOMA MATA ATLÂNTICA______________________________________________________________________________________________________________________________________________________________

		//BIOMA PAMPAS

		Alimento carne = new Alimento("Carne bovina", CategoriaAlimenticia.CARNE);
		Alimento ovo = new Alimento("Ovos", CategoriaAlimenticia.OVOS);
		Alimento leite = new Alimento("Leite", CategoriaAlimenticia.LATICINIO);
		Alimento queijo = new Alimento("Queijo", CategoriaAlimenticia.LATICINIO);
		Alimento trigo = new Alimento("Trigo", CategoriaAlimenticia.CEREAIS);
		Alimento cevada = new Alimento("Cevada", CategoriaAlimenticia.CEREAIS);

		Vector<Alimento> alimentosPampas = new Vector<>();
		alimentosPampas.add(carne);
		alimentosPampas.add(ovo);
		alimentosPampas.add(leite);
		alimentosPampas.add(queijo);
		alimentosPampas.add(trigo);
		alimentosPampas.add(cevada);

		String nomeBioma4 = "Pampas";
		String tipoDePlantio4 = "Nesse bioma, o plantio predominante é o de pastagens, especialmente para a pecuária extensiva de bovinos e ovinos.";
		String tecnicaDePlantacao4 = "A técnica de plantio mais adequada é o manejo de pastagens, que envolve a seleção e o cuidado das espécies de gramíneas nativas adaptadas à região";
		String centrosComerciais4 = " Os grandes centros comerciais nessa região estão localizados em cidades como Porto Alegre, Caxias do Sul, Santa Maria e Pelotas.";
		String meiosDeTransporte4 = "Transporte rodoviário, ferroviário e transporte aéreo.";

		Bioma pampas = new Bioma(
				nomeBioma4,
				tipoDePlantio4,
				tecnicaDePlantacao4,
				centrosComerciais4,
				meiosDeTransporte4,
				alimentosPampas);

		//______FIM BIOMA PAMPAS________________________________________________________________________________________________________________________________________________________

		//INÍCIO DA CRIAÇÃO DOS BIOMAS DA REGIÃO NORDESTE DO BRASIL

		//BIOMA MATA ATLÂNTICA


		Alimento manga = new Alimento("Manga", CategoriaAlimenticia.FRUTA);
		Alimento caju = new Alimento("Caju", CategoriaAlimenticia.FRUTA);
		Alimento tomate = new Alimento("Tomate", CategoriaAlimenticia.FRUTA);
		Alimento pimentao = new Alimento("Pimentão", CategoriaAlimenticia.HORTALICA);
		Alimento ervilha = new Alimento("Ervilha", CategoriaAlimenticia.LEGUMINOSA);

		Vector<Alimento> alimentosMataAtlanticaNordeste = new Vector<>();
		alimentosMataAtlanticaNordeste.add(manga);
		alimentosMataAtlanticaNordeste.add(abacaxi);
		alimentosMataAtlanticaNordeste.add(caju);
		alimentosMataAtlanticaNordeste.add(tomate);
		alimentosMataAtlanticaNordeste.add(pimentao);
		alimentosMataAtlanticaNordeste.add(mandioca);
		alimentosMataAtlanticaNordeste.add(milho);
		alimentosMataAtlanticaNordeste.add(arroz);
		alimentosMataAtlanticaNordeste.add(feijao);
		alimentosMataAtlanticaNordeste.add(ervilha);

		String nomeBioma5 = "Mata Atlântica";
		String tipoDePlantio5 = "Nessa região são realizados diferentes tipos de plantios, incluindo cultivos agrícolas.";
		String tecnicaDePlantacao5 = "Possui técnicas de plantio diversificado e agroflorestal. Isso envolve a combinação de diferentes culturas em um mesmo sistema de cultivo, com a inclusão de espécies agrícolas e florestais.";
		String centrosComerciais5 = "Estão localizados em cidades como Salvador, Recife, Natal e Fortaleza.";
		String meiosDeTransporte5 = "Transporte rodoviário e transporte marítimo.";

		Bioma mataAtlanticaNordeste = new Bioma(
				nomeBioma5,
				tipoDePlantio5,
				tecnicaDePlantacao5,
				centrosComerciais5,
				meiosDeTransporte5,
				alimentosMataAtlanticaNordeste);

		//______FIM BIOMA MATA ATLÂNTICA NORDESTE____________________________________________________________________________________________________________________________________

		//BIOMA CAATINGA


		Alimento umbu = new Alimento("Umbu", CategoriaAlimenticia.FRUTA);

		Vector<Alimento> alimentosCaatinga = new Vector<>();
		alimentosCaatinga.add(umbu);
		alimentosCaatinga.add(maracuja);
		alimentosCaatinga.add(milho);
		alimentosCaatinga.add(feijao);
		alimentosCaatinga.add(mandioca);

		String nomeBioma6 = "Caatinga";
		String tipoDePlantio6 = "Nessa região são são comuns os cultivos de plantas adaptadas às condições semiáridas, que possuem altas temperaturas, solo pobre em nutrientes e baixa umidade.";
		String tecnicaDePlantacao6 = "Devido à escassez de água na região, são utilizadas técnicas de captação e armazenamento de água, como a construção de cisternas e barragens.";
		String centrosComerciais6 = "Os centros comerciais mais próximos da região da Caatinga incluem cidades como Salvador, Recife, Fortaleza, Juazeiro do Norte e Petrolina.";
		String meiosDeTransporte6 = "Transporte rodoviário e transporte ferroviário.";

		Bioma caatinga = new Bioma(
				nomeBioma6,
				tipoDePlantio6,
				tecnicaDePlantacao6,
				centrosComerciais6,
				meiosDeTransporte6,
				alimentosCaatinga);

		//______FIM BIOMA CAATINGA____________________________________________________________________________________________________________________________________


		//INÍCIO DA CRIAÇÃO DOS BIOMAS DA REGIÃO CENTRO-OESTE DO BRASIL

		//BIOMA CERRADO

		Alimento pequi = new Alimento("Pequi", CategoriaAlimenticia.FRUTA);

		Vector<Alimento> alimentosCerradoCentroOeste = new Vector<>();
		alimentosCerradoCentroOeste.add(soja);
		alimentosCerradoCentroOeste.add(milho);
		alimentosCerradoCentroOeste.add(feijao);
		alimentosCerradoCentroOeste.add(arroz);
		alimentosCerradoCentroOeste.add(pequi);
		alimentosCerradoCentroOeste.add(caju);

		String nomeBioma7 = "Cerrado";
		String tipoDePlantio7 = "No cerrado, são cultivadas principalmente culturas agrícolas.";
		String tecnicaDePlantacao7 = "A técnica mais adequada no Cerrado é o sistema de plantio direto, que consiste em evitar o revolvimento do solo e manter a cobertura vegetal sobre ele.";
		String centrosComerciais7 = "Os centros comerciais próximos da região do Cerrado incluem cidades como Brasília, Goiânia, Cuiabá e Campo Grande. .";
		String meiosDeTransporte7 = "Transporte rodoviário, transporte ferroviário e aéreo.";

		Bioma cerradoCentroOeste = new Bioma(
				nomeBioma7,
				tipoDePlantio7,
				tecnicaDePlantacao7,
				centrosComerciais7,
				meiosDeTransporte7,
				alimentosCerradoCentroOeste);

		//______FIM BIOMA CERRADO____________________________________________________________________________________________________________________________________

		//BIOMA PANTANAL

		Vector<Alimento> alimentosPantanal = new Vector<>();
		alimentosPantanal.add(carne);
		alimentosPantanal.add(leite);
		alimentosPantanal.add(queijo);

		String nomeBioma8 = "Pantanal";
		String tipoDePlantio8 = "O plantio predominante é o de pastagens nativas e exóticas para a criação de gado de corte. O Pantanal é uma das maiores áreas de pecuária extensiva do Brasil, onde ocorre a criação de bovinos. ";
		String tecnicaDePlantacao8 = "A técnica de plantação mais adequada é o manejo de pastagens.";
		String centrosComerciais8 = "Os centros comerciais mais próximos do Pantanal estão localizados em cidades como Cuiabá, Corumbá e Campo Grande.";
		String meiosDeTransporte8 = "Transporte rodoviário, fluvial e aéreo";

		Bioma pantanal = new Bioma(
				nomeBioma8,
				tipoDePlantio8,
				tecnicaDePlantacao8,
				centrosComerciais8,
				meiosDeTransporte8,
				alimentosPantanal);

		//______FIM BIOMA PANTANAL____________________________________________________________________________________________________________________________________

		//INÍCIO DA CRIAÇÃO DOS BIOMAS DO SUDESTE DO BRASIL

		//BIOMA MATA ATLÂNTICA

		Alimento goiaba = new Alimento("Goiaba", CategoriaAlimenticia.FRUTA);
		Alimento alface = new Alimento("Alface", CategoriaAlimenticia.HORTALICA);
		Alimento cenoura = new Alimento("Cenoura", CategoriaAlimenticia.HORTALICA);
		Alimento cafe = new Alimento("Café", CategoriaAlimenticia.FRUTA);

		Vector<Alimento> alimentosMataAtlanticaSudeste = new Vector<>();
		alimentosMataAtlanticaSudeste.add(banana);
		alimentosMataAtlanticaSudeste.add(abacaxi);
		alimentosMataAtlanticaSudeste.add(goiaba);
		alimentosMataAtlanticaSudeste.add(alface);
		alimentosMataAtlanticaSudeste.add(tomate);
		alimentosMataAtlanticaSudeste.add(cenoura);
		alimentosMataAtlanticaSudeste.add(milho);
		alimentosMataAtlanticaSudeste.add(arroz);
		alimentosMataAtlanticaSudeste.add(feijao);
		alimentosMataAtlanticaSudeste.add(ervilha);
		alimentosMataAtlanticaSudeste.add(cafe);

		String nomeBioma9 = "Mata Atlântica";
		String tipoDePlantio9 = "Nessa região são realizados diversos tipos de plantio, incluindo cultivos agrícolas diversificados, como frutas tropicais, hortaliças, cereais e legumes. Além disso, são encontradas plantações de café, cana-de-açúcar e produtos florestais não madeireiros. ";
		String tecnicaDePlantacao9 = "Técnicas de plantio diversificado e agroflorestal são mais adequadas. Isso envolve a combinação de diferentes culturas em um mesmo sistema de cultivo, com a inclusão de espécies agrícolas e florestais.";
		String centrosComerciais9 = "Os centros comerciais mais próximos  incluem cidades como São Paulo, Rio de Janeiro, Belo Horizonte e Curitiba.";
		String meiosDeTransporte9 = "Transporte rodoviário e transporte ferroviário.";

		Bioma mataAtlanticaSudeste = new Bioma(
				nomeBioma9,
				tipoDePlantio9,
				tecnicaDePlantacao9,
				centrosComerciais9,
				meiosDeTransporte9,
				alimentosMataAtlanticaSudeste);

		//______FIM BIOMA MATA ATLÂNTICA____________________________________________________________________________________________________________________________________


		//BIOMA CERRADO

		Vector<Alimento> alimentosCerradoSudeste = new Vector<>();
		alimentosCerradoSudeste.add(soja);
		alimentosCerradoSudeste.add(milho);
		alimentosCerradoSudeste.add(feijao);
		alimentosCerradoSudeste.add(arroz);
		alimentosCerradoSudeste.add(pequi);
		alimentosCerradoSudeste.add(caju);
		alimentosCerradoSudeste.add(maracuja);

		String nomeBioma10 = "Cerrado";
		String tipoDePlantio10 = "Na região do Cerrado no Sudeste brasileiro, são realizados diversos tipos de plantio, com destaque para a produção de grãos.";
		String tecnicaDePlantacao10 = "A técnica mais adequada no Cerrado é o sistema de plantio direto, que consiste em evitar o revolvimento do solo e manter a cobertura vegetal sobre ele.";
		String centrosComerciais10 = "Os centros comerciais próximos da região do Cerrado incluem cidades como Brasília, Goiânia, Uberlândia e Ribeirão Preto.";
		String meiosDeTransporte10 = "Transporte rodoviário, transporte ferroviário e aéreo.";

		Bioma cerradoSudeste = new Bioma(
				nomeBioma10,
				tipoDePlantio10,
				tecnicaDePlantacao10,
				centrosComerciais10,
				meiosDeTransporte10,
				alimentosCerradoSudeste);


		//______FIM BIOMA CERRADO____________________________________________________________________________________________________________________________________


		Vector<Bioma> biomasRegiaoNorte = new Vector<>();
		biomasRegiaoNorte.add(florestaAmazonica);
		biomasRegiaoNorte.add(cerrado);

		Vector<Bioma> biomasRegiaoSul = new Vector<>();
		biomasRegiaoSul.add(mataAtlantica);
		biomasRegiaoSul.add(pampas);

		Vector<Bioma> biomasRegiaoNordeste = new Vector<>();
		biomasRegiaoNordeste.add(mataAtlanticaNordeste);
		biomasRegiaoNordeste.add(caatinga);

		Vector<Bioma> biomasCentroOeste = new Vector<>();
		biomasCentroOeste.add(cerradoCentroOeste);
		biomasCentroOeste.add(pantanal);

		Vector<Bioma> biomasSudeste = new Vector<>();
		biomasSudeste.add(mataAtlanticaSudeste);
		biomasSudeste.add(cerradoSudeste);


		Regiao norte = new Regiao("Norte", biomasRegiaoNorte);
		Regiao sul = new Regiao("Sul", biomasRegiaoSul);
		Regiao nordeste = new Regiao("Nordeste", biomasRegiaoNordeste);
		Regiao centroOeste = new Regiao("Centro-Oeste", biomasCentroOeste);
		Regiao sudeste = new Regiao("Sudeste", biomasSudeste);


		Vector<Regiao> regioes = new Vector<>();
		regioes.add(norte);
		regioes.add(sul);
		regioes.add(nordeste);
		regioes.add(centroOeste);
		regioes.add(sudeste);

		Pais brasil = new Pais("Brasil", regioes, Continente.AMERICA);
		return brasil;

		//FIM DA CRIAÇÃO DE TODOS OS BIOMAS POR REGIÃO BRASILEIRA.
	}
}
