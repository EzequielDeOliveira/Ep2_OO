package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import view.TelaInicio;


public class teste {

	public static void main(String[] args) {
		/*
		PotenciaInstantanea onda = new PotenciaInstantanea();
		
		List<Double> scores = new ArrayList<>();
		
		scores = onda.GerarPotenciaSimples(10,2,120,20);

      
		VerGrafico view = new VerGrafico(scores);
	}
*/
/*	
float a;
String b = new String();
		FatorDePotencia fator = new FatorDePotencia();
	a = fator.CalcularFatorDePotencia(0,35);
	b = fator.StatusFatorDePotencia(0, 35);
	System.out.println(a);
	System.out.println(b);
	
*/
		/*
		PotenciaAtiva P = new PotenciaAtiva();
		System.out.println(P.CalcularPotenciaAtiva(220, 39, 0, 35));
	*/
		
		/*PotenciaReativa Q = new PotenciaReativa();
		System.out.println(Q.CalcularPotenciaReativa(220,39,0,35));
		*/
	/*	
		DistorcidaResultaFourier teste = new DistorcidaResultaFourier();
		System.out.println(teste.FourierResultanteSeisHarmonicos(10, 20, 30, 40, 40, 20, -50,80, 90, 5, 6, 2,1, 0, 220,140, 110,100,80, -15));
	*/
		
		JFrame teste  = new JFrame();
		teste = new JFrame("QEE");
		teste.setSize(1000, 600);
		teste.setLocationRelativeTo(null);
		teste.setResizable(true);
		teste.setVisible(true);
		TelaInicio tela = new TelaInicio(teste);
		
		
	
	
	}
}


