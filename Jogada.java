package blackJackProject;


public class Jogada implements Selecionador<Jogadores>{
	
	Jogadores jogador;
	
	@Override
	public void selecionar(Jogadores param) {
			this.jogador = jogador;
		// FALTA IMPLEMENTAR O SELECIONADOR
		
	}

	@Override
	public Jogadores pegar() {
		
		
		return jogador;
	}

}
