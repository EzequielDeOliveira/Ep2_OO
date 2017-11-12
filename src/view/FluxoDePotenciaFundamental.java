package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.DesenharGrafico;

public class FluxoDePotenciaFundamental {
	
	 JPanel painelPrincipal = new JPanel();
	 JPanel parteSuperior = new JPanel();
	 JPanel parteInferior = new JPanel();
	 JPanel superior1 = new JPanel();
	 JPanel superior2 = new JPanel();
	 JPanel inferior1 = new JPanel();
	 JPanel inferior2 = new JPanel();
	 JPanel esquerdaSuperior1 = new JPanel();
	 JPanel esquerdaSuperior2 = new JPanel();
	 JPanel direitaSuperior1 = new JPanel();
	 JPanel direitaSuperior2 = new JPanel();
	 ArrayList<Double> listaInicial = new  ArrayList<Double> ();
	 DesenharGrafico graficoTensao;
	 DesenharGrafico graficoCorrente;
	 DesenharGrafico graficoPotenciaInstantanea;
	 
	 
	
	 FluxoDePotenciaFundamental(JFrame telaPrincipal){
		 

		 telaPrincipal  = new JFrame("Fluxo de potência fundamental");
		 telaPrincipal.setSize(1300, 650);
		
		 painelPrincipal.setLayout(new GridLayout(2,1));
		 parteSuperior.setLayout(new GridLayout(2,1));
		 parteSuperior.setLayout(new GridLayout(2,1));
		 parteInferior.setLayout(new GridLayout(1,2));
		 superior1.setLayout(new GridLayout(1,2));
		 superior2.setLayout(new GridLayout(1,2));
		 inferior1.setLayout(null);
		 inferior2.setLayout(null);
		 esquerdaSuperior1.setLayout(null);
		 esquerdaSuperior2.setLayout(null);
		 
		 JLabel labelTensao = new JLabel("Amplitude(Tensão)");
		 JLabel labelCorrente = new JLabel("Amplitude(Corrente)");
		 JLabel labelAnguloTensao = new JLabel("Ângulo da fase(Tensão)");
		 JLabel labelAnguloCorrente = new JLabel("Ângulo da fase(Corrente)");
		 JLabel potenciaAtiva = new JLabel("- Pôtencia ativa");
		 JLabel potenciaReativa = new JLabel("- Pôtencia reativa");
		 JLabel potenciaAparente = new JLabel("- Pôtencia aparente");
		 JLabel FatorDePotencia = new JLabel("- Fator de potência");
		 
		 JTextField tensaoTxt = new JTextField("0",3);
		 JTextField correnteTxt = new JTextField("0",3);
		 JTextField anguloTensaoTxt = new JTextField("0",3);
		 JTextField anguloCorrenteTxt = new JTextField("0",3);
		 JTextField potenciaAtivaTxt = new JTextField("0");
		 JTextField potenciaReativaTxt = new JTextField("0");
		 JTextField potenciaAparenteTxt = new JTextField("0");
		 JTextField FatorDePotenciaTxt = new JTextField("0");
		 
		
		 
		labelTensao.setBounds(250, 10, 150, 20);
		tensaoTxt.setBounds(400, 10, 40, 20);
		labelAnguloTensao.setBounds(250, 60, 150,20);
		anguloTensaoTxt.setBounds(400, 60, 40,20);
		
		labelCorrente.setBounds(250, 10, 150, 20);
		correnteTxt.setBounds(400, 10, 40, 20);
		labelAnguloCorrente.setBounds(250, 60, 150,20);
		anguloCorrenteTxt.setBounds(400, 60, 40,20);
		 
		 esquerdaSuperior1.add(labelTensao);
		 esquerdaSuperior1.add(tensaoTxt);
		 esquerdaSuperior1.add(labelAnguloTensao);
		 esquerdaSuperior1.add(anguloTensaoTxt);
		 esquerdaSuperior2.add(labelCorrente);
		 esquerdaSuperior2.add(correnteTxt);
		 esquerdaSuperior2.add(labelAnguloCorrente);
		 esquerdaSuperior2.add(anguloCorrenteTxt);
		 
		 esquerdaSuperior1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		 esquerdaSuperior2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		 
		 atualizaGraficoTensao();
		 
		 direitaSuperior1.setBorder(BorderFactory.createTitledBorder("Tensão"));
		 direitaSuperior2.setBorder(BorderFactory.createTitledBorder("Corrente"));
		 
	     superior1.add(esquerdaSuperior1);
	     superior2.add(esquerdaSuperior2);
	     superior2.add(direitaSuperior2);
	     
	     parteSuperior.add(superior1);
	     parteSuperior.add(superior2);
	     
	     parteSuperior.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
	     
	      potenciaAtiva.setBounds(2, 5, 150, 20);
     	  potenciaReativa.setBounds(2, 25, 150, 20);
		  potenciaAparente.setBounds(2, 45, 150, 20);
		  FatorDePotencia.setBounds(2, 65, 150, 20);
		  
		  
		  potenciaAtivaTxt.setBounds(200, 5, 100, 20);
		  potenciaReativaTxt.setBounds(200, 25, 100, 20);
		  potenciaAparenteTxt.setBounds(200, 45, 100, 20);
		  FatorDePotenciaTxt.setBounds(200, 65, 100, 20); 
		 
	     
	     
	      inferior1.add(potenciaAtiva);
	      inferior1.add(potenciaReativa);
	      inferior1.add(potenciaAparente);
	      inferior1.add(FatorDePotencia);
	      inferior1.add(potenciaAtivaTxt);
	      inferior1.add(potenciaReativaTxt);
	      inferior1.add(potenciaAparenteTxt);
	      inferior1.add(FatorDePotenciaTxt);
	      
	      
	      atualizaGraficoTensao();
	      
	     parteInferior.add(inferior1);
	      
	      
	     painelPrincipal.add(parteSuperior);
	     painelPrincipal.add(parteInferior);
	     
	     
	     telaPrincipal.add(painelPrincipal);
	     
		 
		 
		 
		
		 
		 
		 telaPrincipal.setVisible(true);
		 
	 }
	 
	 public void atualizaGraficoTensao() {
		
		for(float i = 0; i < 10; i = (float) (i + 0.1)) {
			 
			 listaInicial.add(Math.cos(i));
			 
		 }
		
		 direitaSuperior1.setLayout(null);
		 
		 graficoTensao = new DesenharGrafico(listaInicial);
		 graficoTensao.mudaCor(Color.RED);
		 
		graficoTensao.setSize(300, 270);
		 
		 direitaSuperior1.add(graficoTensao);
		 
		 superior1.add(direitaSuperior1);
		 
		 
		
		 		 
		 
	 }
	 

}
