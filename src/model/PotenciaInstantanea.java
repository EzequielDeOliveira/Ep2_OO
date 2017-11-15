package model;

import java.util.ArrayList;
import java.util.List;

public class PotenciaInstantanea extends FormaDeOnda {
	
	CorrenteDeOrdemHarmonica ondaCorrenteHarmonica = new CorrenteDeOrdemHarmonica();
	OndaDaCorrente ondaCorrente = new OndaDaCorrente();
	OndaDeTensao ondaTensao = new OndaDeTensao();
	private ArrayList<Double> ondaDaTensao = new ArrayList<Double>();
	private ArrayList<Double> ondaDaCorrente = new ArrayList<Double>();
	
	public PotenciaInstantanea() {}
	
	public ArrayList<Double> GerarPotenciaSimples(int tensao , int angulotensao ,int corrente  , int angulocorrente){
		ondaDaTensao.clear();
		ondaDaCorrente.clear();
		
		ondaDaTensao = ondaTensao.GeraListaTensao(tensao, angulotensao);
		ondaDaCorrente = ondaCorrente.GeraListaCorrente(corrente, angulocorrente);
		setMaximoDepontos(101);
		
		
		
		for(int i = 0 ; i < getMaximoDepontos() ; i++) {
			
	        pontosNoGrafico.add(ondaDaTensao.get(i) * ondaDaCorrente.get(i));   
			
			
		}
		
		return pontosNoGrafico;
		
	}
	
	
	public ArrayList<Double> GerarPotenciaHarmonica(int tensao, int corrente , int angulotensao , int anguloharmonico){
		
		ondaDaTensao.clear();
		ondaDaCorrente.clear();
		
		ondaDaTensao = ondaTensao.GeraListaTensao(tensao, angulotensao);
		ondaDaCorrente = ondaCorrenteHarmonica.GeralistaOrdemHarmonica(corrente, anguloharmonico);
		
		for(int i = 0 ; i < getMaximoDepontos() ; i++) {
			
	pontosNoGrafico.add(ondaDaTensao.get(i) *ondaDaCorrente.get(i) );   
			 
			
		}
		
		return pontosNoGrafico;
		
	}
	
	

}
