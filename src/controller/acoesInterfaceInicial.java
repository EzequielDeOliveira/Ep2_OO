package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.DistorcaoHarmonica;
import view.FluxoDePotenciaFundamental;

public class acoesInterfaceInicial implements ActionListener {
	
	JFrame telaprincipal;
	JPanel painelprincipal;
	
	public acoesInterfaceInicial(JFrame telaprincipal , JPanel painelprincipal) {
		
		this.telaprincipal = telaprincipal;
		this.painelprincipal = painelprincipal;
		
		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		String commad = e.getActionCommand();
		if(commad.equals("fluxo de potencia fundamental")) {
			
	        telaprincipal.dispose();
	        FluxoDePotenciaFundamental fluxoDePotencia = new FluxoDePotenciaFundamental();
		}
		else if(commad.equals("Distorcao h�rmonica")){

	        telaprincipal.dispose();
	        DistorcaoHarmonica distorcao = new  DistorcaoHarmonica();
		
			
		}
		
		
	}
}
