package view;

import java.awt.Window;

import javax.swing.JFrame;

public class TelaPrincipal {
	
	public TelaPrincipal(){
		
		JFrame telaPrincipal = new JFrame("QEE");
		telaPrincipal.setSize(1000, 600);
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaInicial teste = new TelaInicial(telaPrincipal);
		
		
		
	}
	
	

}
