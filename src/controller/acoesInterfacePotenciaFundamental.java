package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.PotenciaInstantanea;
import view.TelaInicial;

public class acoesInterfacePotenciaFundamental  implements ActionListener{
	
	DesenharGrafico grafico;
	JPanel panel;
	JTextField amplitude;
	JTextField angulo;
	JTextField amplitudeCorrente;
	JTextField anguloCorrente;
	SimulaFluxoDePotenciaFundamental potenciaFundamental = new SimulaFluxoDePotenciaFundamental();
	TrianguloDePotencia triangulo ;
	PotenciaInstantanea potenciaInstantanea = new PotenciaInstantanea();
	JTextField potenciaAtiva;
	JTextField potenciaReativa; 
	JTextField potenciaAparente ;
	JTextField fatorDePotencia ;
	JFrame telaprincipal;
	JPanel painelprincipal;
	
	
	
	
	public acoesInterfacePotenciaFundamental(DesenharGrafico grafico, JPanel panel, JTextField amplitude , JTextField angulo ){
		
		this.grafico = grafico;
		this.panel = panel;
		this.amplitude = amplitude;
		this.angulo = angulo;
		
	}
	
public acoesInterfacePotenciaFundamental(DesenharGrafico grafico, JPanel panel, JTextField amplitude , JTextField angulo , JTextField amplitudeCorrente , JTextField anguloCorrente , JTextField potenciaAtiva , JTextField potenciaReativa ,JTextField potenciaAparente , JTextField fatorDePotencia ,TrianguloDePotencia triangulo ){
		
		this.grafico = grafico;
		this.panel = panel;
		this.amplitude = amplitude;
		this.angulo = angulo;
		this.amplitudeCorrente = amplitudeCorrente;
		this.anguloCorrente = anguloCorrente;
		this.potenciaAtiva = potenciaAtiva;
		this.potenciaReativa = potenciaReativa;
		this.potenciaAparente = potenciaAparente;
		this.fatorDePotencia = fatorDePotencia;
		this.triangulo=triangulo;
		
	}


public acoesInterfacePotenciaFundamental(JFrame telaprincipal, JPanel painelprincipal){
	
	this.telaprincipal = telaprincipal;
	this.painelprincipal = painelprincipal;

	
}
	

	      public void actionPerformed(ActionEvent e) {
	         String command = e.getActionCommand();  
	         if( command.equals( "tensao" ))  {
	        	 grafico.setScores(potenciaFundamental.ControllerListaOndaTensao((Integer.parseInt(amplitude.getText())),Integer.parseInt(angulo.getText())));
	        
	         panel.add(grafico);
	         }
	         else if( command.equals( "corrente" ) )  {
	            
	        	 grafico.setScores(potenciaFundamental.ControllerListaOndaCorrente((Integer.parseInt(amplitude.getText())),Integer.parseInt(angulo.getText())));
	 	        
		         panel.add(grafico);
	  
	         }
	         
	         else if(command.equals("resultados")) {
	        	 
	        	 grafico.setScores( potenciaFundamental.ControllerListaPotenciaInstantanea(Integer.parseInt(amplitude.getText()),Integer.parseInt(angulo.getText()),Integer.parseInt(amplitudeCorrente.getText()),Integer.parseInt(anguloCorrente.getText())));
	        	 
	        	 potenciaAtiva.setText(potenciaFundamental.ControllerPotenciaAtiva(Integer.parseInt(amplitude.getText()),Integer.parseInt(amplitudeCorrente.getText()),Integer.parseInt(angulo.getText()),Integer.parseInt(anguloCorrente.getText())));
	        	 
	        	 potenciaReativa.setText(potenciaFundamental.ControllerPotenciaRetiva(Integer.parseInt(amplitude.getText()),Integer.parseInt(amplitudeCorrente.getText()),Integer.parseInt(angulo.getText()),Integer.parseInt(anguloCorrente.getText())));
	        	 
	        	 potenciaAparente.setText(potenciaFundamental.ControllerPotenciaAparente((Integer.parseInt(amplitude.getText())),Integer.parseInt(amplitudeCorrente.getText())));
	        	 
	        	 fatorDePotencia.setText(potenciaFundamental.ControllerFatorDePotencia(Integer.parseInt(angulo.getText()),Integer.parseInt(anguloCorrente.getText())));
	        	 
	        	 triangulo.setCoordenadas((potenciaFundamental.triangulox(Integer.parseInt(amplitude.getText()),Integer.parseInt(amplitudeCorrente.getText()),Integer.parseInt(angulo.getText()),Integer.parseInt(anguloCorrente.getText())))/100,(potenciaFundamental.trianguloy(Integer.parseInt(amplitude.getText()),Integer.parseInt(amplitudeCorrente.getText()),Integer.parseInt(angulo.getText()),Integer.parseInt(anguloCorrente.getText())))/100);
	        	 
	        	 panel.add(triangulo);
	        	 
	        	 panel.add(grafico);
	         }
	         else if(command.equals("voltar"))
	         {
	        	 
	        
	        	 telaprincipal.setVisible(false);
	        	 new TelaInicial(telaprincipal);
	        	 
	        	 
	         }
	            
	      }
	      
	
	 }
	 

	

