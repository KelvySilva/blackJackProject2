package blackJackProject;

public interface Selecionador<E extends Object>{
	
	public void selecionar(E param);
	public E pegar();

}
