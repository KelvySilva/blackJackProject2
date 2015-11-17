package blackJackProject;

import java.awt.Color;
import java.awt.Container;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Teste extends JFrame {

	Container container;
	Container containerCartas;
	static Baralho b;
	

	public Teste() {

		super("Janela");
		b = new Baralho();
		b.embaralhar();
		container = getContentPane();
		container.setLayout(null);
		container.setBackground(Color.GREEN);
		
		
		containerCartas = new JPanel();
		containerCartas.setLayout(null);
		containerCartas.setVisible(true);
		containerCartas.setSize(400, 400);
		containerCartas.setLocation(0, 0);
		
		
		for (Cartas c : b.cartas) {
			
			containerCartas.add(c.getLabel());	
			c.getPath();
			c.getLabel().setSize(200, 200);
			c.getLabel().setLocation(0, 0);
			c.getLabel().setVisible(true);
			repaint();
			
					
		}
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1370, 736);
		add(containerCartas);
		setVisible(true);
		
		
		

	}

	public static void main(String[] args) {
			new Teste();
		

		
		for (Cartas c : b.getCartas()) {
			System.out.println(c.getPath().toString());
			System.out.println(c);
		}
	}
}
