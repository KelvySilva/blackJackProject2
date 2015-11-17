package blackJackProject;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Baralho {

	private Random rdn = new Random();

	Cartas[] cartas = 
	{   new Cartas(1, "AP", NipeEnum.COPAS), new Cartas(1, "AC", NipeEnum.ESPADAS),
		new Cartas(1, "AE", NipeEnum.OURO),  new Cartas(1, "AO", NipeEnum.PAUS), 
		new Cartas(2, "2P", NipeEnum.COPAS), new Cartas(2, "2C", NipeEnum.ESPADAS), 
		new Cartas(2, "2E", NipeEnum.OURO),  new Cartas(2, "2O", NipeEnum.PAUS),
		new Cartas(3, "3P", NipeEnum.COPAS), new Cartas(3, "3C", NipeEnum.ESPADAS), 
		new Cartas(3, "3E", NipeEnum.OURO),  new Cartas(3, "3O", NipeEnum.PAUS),
		new Cartas(4, "4P", NipeEnum.COPAS), new Cartas(4, "4C", NipeEnum.ESPADAS), 
		new Cartas(4, "4E", NipeEnum.OURO),  new Cartas(4, "4O", NipeEnum.PAUS),
		new Cartas(5, "5P", NipeEnum.COPAS), new Cartas(5, "5C", NipeEnum.ESPADAS), 
		new Cartas(5, "5E", NipeEnum.OURO),  new Cartas(5, "5O", NipeEnum.PAUS),
		new Cartas(6, "6P", NipeEnum.COPAS), new Cartas(6, "6C", NipeEnum.ESPADAS), 
		new Cartas(6, "6E", NipeEnum.OURO),  new Cartas(6, "6O", NipeEnum.PAUS),
		new Cartas(7, "7P", NipeEnum.COPAS), new Cartas(7, "7C", NipeEnum.ESPADAS), 
		new Cartas(7, "7E", NipeEnum.OURO),  new Cartas(7, "7O", NipeEnum.PAUS),
		new Cartas(8, "8P", NipeEnum.COPAS), new Cartas(8, "8C", NipeEnum.ESPADAS), 
		new Cartas(8, "8E", NipeEnum.OURO),  new Cartas(8, "8O", NipeEnum.PAUS),
		new Cartas(9, "9P", NipeEnum.COPAS), new Cartas(9, "9C", NipeEnum.ESPADAS), 
		new Cartas(9, "9E", NipeEnum.OURO),  new Cartas(9, "9O", NipeEnum.PAUS),
		new Cartas(10, "10P", NipeEnum.COPAS), new Cartas(10, "10C", NipeEnum.ESPADAS), 
		new Cartas(10, "10E", NipeEnum.OURO),  new Cartas(10, "10O", NipeEnum.PAUS),
		new Cartas(11, "JP", NipeEnum.COPAS), new Cartas(11, "JC", NipeEnum.ESPADAS), 
		new Cartas(11, "JE", NipeEnum.OURO),  new Cartas(11, "JO", NipeEnum.PAUS),
		new Cartas(12, "QP", NipeEnum.COPAS), new Cartas(12, "QC", NipeEnum.ESPADAS), 
		new Cartas(12, "QE", NipeEnum.OURO),  new Cartas(12, "QO", NipeEnum.PAUS),
		new Cartas(13, "KP", NipeEnum.COPAS), new Cartas(13, "KC", NipeEnum.ESPADAS), 
		new Cartas(13, "KE", NipeEnum.OURO),  new Cartas(13, "KO", NipeEnum.PAUS)};
								
	

	public Baralho() {
	}

	public void embaralhar() {
		Cartas[] cartasMix = new Cartas[52];
		for (int indice = 0; indice < 52; indice++) {
			if (cartas.length == 1) {
				cartasMix[indice] = cartas[0];
			} else {
				int posicao = rdn.nextInt(cartas.length);
				if (cartas.length == posicao) {
					posicao--;
				}
				cartasMix[indice] = cartas[posicao];
				cartas[posicao] = null;
			}
			if (cartas.length > 1) {
				cartas = organizarCartas(cartas);
			}
		}
		this.cartas = cartasMix;
	}

	private Cartas[] organizarCartas(Cartas[] cartas) {
		Cartas[] cartasNovas = new Cartas[this.cartas.length - 1];
		int indiceCartasNovas = 0;
		for (int indiceCartas = 0; indiceCartas < this.cartas.length; indiceCartas++) {
			if (this.cartas[indiceCartas] != null) {
				cartasNovas[indiceCartasNovas] = this.cartas[indiceCartas];
				indiceCartasNovas++;
			}
		}
		return cartasNovas;
	}

	public Cartas[] getCartas() {
		return this.cartas;
	}

}
