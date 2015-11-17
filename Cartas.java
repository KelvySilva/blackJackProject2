package blackJackProject;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cartas {

	private int valor;
	private String nome;
	private NipeEnum nipe;
	private Path path;
	private Icon icone;
	private JLabel label;
	

	public Cartas(int valor, String nome, NipeEnum nipe) {
		this.valor = valor;
		this.nome = nome;
		this.nipe = nipe;
		this.path = Paths.get("C:/Users/Kelvy/workspace4/blackJackProject/src/" + nome + ".png");
		this.icone = new ImageIcon(this.path.toString());
		this.label = new JLabel(this.icone);
	}

	public Path getPath() {
		return path;
	}

	public int getValor() {
		return valor;
	}

	public String getNome() {
		return nome;
	}

	public NipeEnum getNipe() {
		return nipe;
	}

	@Override
	public String toString() {
		return "Cartas [valor=" + valor + ", nome=" + nome + ", nipe=" + nipe + "]";
	}

	public Icon getIcone() {
		return icone;
	}

	public JLabel getLabel() {
		return label;
	}

	


}
