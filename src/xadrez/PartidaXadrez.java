package xadrez;

import boardgame.Tabuleiro;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	public PecaXadrez[][]pegarPecas(){
		
		PecaXadrez[][]mat = new PecaXadrez[tabuleiro.getFileiras()][tabuleiro.getColunas()];
		for(int i=0; i<tabuleiro.getFileiras(); i++) {
			for(int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez)tabuleiro.peca(i, j);
			}
			
		}
		return mat;
	}

}
