package blackJackProject;

public class Jogadores implements Jogador, Selecionador<Cartas>{
	
	String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public Cartas jogar() {
		
		return null;
	}

	
	public void selecionar(Cartas carta) {
		
		}

	@Override
	public Cartas pegar() {
	
		
		return null;
	}

	}
