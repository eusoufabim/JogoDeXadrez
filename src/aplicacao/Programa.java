package aplicacao;

import xadrex.PartidaDeXadrez;

public class Programa {

	public static void main(String[] args) {
		
		PartidaDeXadrez partidadexadrez = new PartidaDeXadrez();
		UI.imprimirTabuleiro(partidadexadrez.getPecas());
	
	}

}
