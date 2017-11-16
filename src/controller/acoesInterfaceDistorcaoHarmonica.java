package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class acoesInterfaceDistorcaoHarmonica implements ActionListener {
	JPanel harmonico1;
	JPanel harmonico2;
	JPanel harmonico3;
	JPanel harmonico4;
	JPanel harmonico5;
	JPanel harmonico6;
	JTextField tensao1 , angulo1 , ordemHarmonica1 , tensao2 , angulo2 ,  ordemHarmonica2 , tensao3 , angulo3 , ordemHarmonica3 , tensao4 , angulo4 , ordemHarmonica4 , tensao5 , angulo5 ,  ordemHarmonica5 , tensao6 , angulo6 ,  ordemHarmonica6 ;
	int contador = 0;
	
	
	public acoesInterfaceDistorcaoHarmonica (JPanel harmonico1,JPanel harmonico2,JPanel harmonico3,JPanel harmonico4,JPanel harmonico5,JPanel harmonico6 )
	{
		
		this.harmonico1 = harmonico1;
		this.harmonico2 = harmonico2;
		this.harmonico3 = harmonico3;
		this.harmonico4 = harmonico4;
		this.harmonico5 = harmonico5;
		this.harmonico6 = harmonico6;
	
		
	}
	
	
	
	public acoesInterfaceDistorcaoHarmonica (JTextField tensao1 ,JTextField angulo1 , JTextField ordemHarmonica1 ,JTextField tensao2 ,JTextField angulo2 , JTextField ordemHarmonica2 ,JTextField tensao3 ,JTextField angulo3 , JTextField ordemHarmonica3 ,JTextField tensao4 ,JTextField angulo4 , JTextField ordemHarmonica4 ,JTextField tensao5 ,JTextField angulo5 , JTextField ordemHarmonica5 ,JTextField tensao6 ,JTextField angulo6 , JTextField ordemHarmonica6  )
	{
		
		this.tensao1 = tensao1;
		this.angulo1 = angulo1;
		this.ordemHarmonica1 = ordemHarmonica1;
		this.tensao2 = tensao2;
		this.angulo2 = angulo2;
		this.ordemHarmonica2 = ordemHarmonica2;
		this.tensao3 = tensao3;
		this.angulo3 = angulo3;
		this.ordemHarmonica3 = ordemHarmonica3;
		this.tensao4 = tensao4;
		this.angulo4 = angulo4;
		this.ordemHarmonica4 = ordemHarmonica4;
		this.tensao5 = tensao5;
		this.angulo5 = angulo5;
		this.ordemHarmonica5 = ordemHarmonica5;
		this.tensao6 = tensao6;
		this.angulo6 = angulo6;
		this.ordemHarmonica6 = ordemHarmonica6;
	
		
	}
	
	
	  public void actionPerformed(ActionEvent e) {
	         String command = e.getActionCommand(); 
	         if(command.equals("1")) {
	        	 
	        	 harmonico1.setVisible(true);
	        	 harmonico2.setVisible(false);
	        	 harmonico3.setVisible(false);
	        	 harmonico4.setVisible(false);
	        	 harmonico5.setVisible(false);
	        	 harmonico6.setVisible(false);
	        	
	        	 
	        	 
	        	 
	         }else if(command.equals("2")) {
	        	 
	        	 
	        	 harmonico1.setVisible(true);
	        	 harmonico2.setVisible(true);
	        	 harmonico3.setVisible(false);
	        	 harmonico4.setVisible(false);
	        	 harmonico5.setVisible(false);
	        	 harmonico6.setVisible(false);
	        
	        	 
	         }else if(command.equals("3")) {
	        	 
	        	 
	        	 harmonico1.setVisible(true);
	        	 harmonico2.setVisible(true);
	        	 harmonico3.setVisible(true);
	        	 harmonico4.setVisible(false);
	        	 harmonico5.setVisible(false);
	        	 harmonico6.setVisible(false);
	  
	        	 
	         }else if(command.equals("4")) {
	        	 
	        	 
	        	 harmonico1.setVisible(true);
	        	 harmonico2.setVisible(true);
	        	 harmonico3.setVisible(true);
	        	 harmonico4.setVisible(true);
	        	 harmonico5.setVisible(false);
	        	 harmonico6.setVisible(false);
	       
	        	 
	         }else if(command.equals("5")) {
	        	 
	        	 
	        	 harmonico1.setVisible(true);
	        	 harmonico2.setVisible(true);
	        	 harmonico3.setVisible(true);
	        	 harmonico4.setVisible(true);
	        	 harmonico5.setVisible(true);
	        	 harmonico6.setVisible(false);
	        	
	        	 
	         }else if(command.equals("6")) {
	        	 
	        	 
	        	 harmonico1.setVisible(true);
	        	 harmonico2.setVisible(true);
	        	 harmonico3.setVisible(true);
	        	 harmonico4.setVisible(true);
	        	 harmonico5.setVisible(true);
	        	 harmonico6.setVisible(true);
	        	 
	        	 
	         }else if(command.equals("ok")) {
	        	 
	        	 if(Integer.parseInt(tensao1.getText()) != 0 || Integer.parseInt(angulo1.getText()) != 0 || Integer.parseInt(ordemHarmonica1.getText()) != 0) {
	        		 
	        		 contador = contador + 1;
	        		 
	        	 }
	        	 
 if(Integer.parseInt(tensao2.getText()) != 0 || Integer.parseInt(angulo2.getText()) != 0 || Integer.parseInt(ordemHarmonica2.getText()) != 0) {
	        		 
	        		 contador = contador + 1;
	        		 
	        	 }
	        	 
 if(Integer.parseInt(tensao3.getText()) != 0 || Integer.parseInt(angulo3.getText()) != 0 || Integer.parseInt(ordemHarmonica3.getText()) != 0) {
	 
	 contador = contador + 1;
	 
 }
 if(Integer.parseInt(tensao4.getText()) != 0 || Integer.parseInt(angulo4.getText()) != 0 || Integer.parseInt(ordemHarmonica4.getText()) != 0) {
	 
	 contador = contador + 1;
	 
 }
 if(Integer.parseInt(tensao5.getText()) != 0 || Integer.parseInt(angulo5.getText()) != 0 || Integer.parseInt(ordemHarmonica5.getText()) != 0) {
	 
	 contador = contador + 1;
	 
 }
 if(Integer.parseInt(tensao6.getText()) != 0 || Integer.parseInt(angulo6.getText()) != 0 || Integer.parseInt(ordemHarmonica6.getText()) != 0) {
	 
	 contador = contador + 1;
	 
 }
 
 System.out.println(contador);

	        	 
	        	 
	         }
	  }

}
