package boardgame;

public class Tabuleiro {
	
	private Integer fileiras;
	private Integer colunas;
	private Peca [][] peca;
	
	public Tabuleiro(Integer fileiras, Integer colunas) {
		this.fileiras = fileiras;
		this.colunas = colunas;
		peca = new Peca [fileiras][colunas];
	}

	public Integer getFileiras() {
		return fileiras;
	}

	public void setFileiras(Integer fileiras) {
		this.fileiras = fileiras;
	}

	public Integer getColunas() {
		return colunas;
	}

	public void setColunas(Integer colunas) {
		this.colunas = colunas;
	}
	
	public Peca peca(int fileira, int coluna) {
		
		return peca[fileira][coluna];
	}
	
	public Peca peca(Posicao posicao) {
		return peca[posicao.getFileira()][posicao.getColuna()];
	}
}
