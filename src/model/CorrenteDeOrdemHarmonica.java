package model;

import java.util.ArrayList;

public class CorrenteDeOrdemHarmonica extends FormaDeOnda{

	private int ordemHarmonica;
	
	
	CorrenteDeOrdemHarmonica() {}

	public int getOrdemHarmonica() {
		return ordemHarmonica;
	}

	public void setOrdemHarmonica(int ordemHarmonica) {
		this.ordemHarmonica = ordemHarmonica;
	}
	
	public ArrayList<Double> GeralistaOrdemHarmonica(int corrente , int anguloharmonico){
		
		amplitude.setAmplitudeCorrente(corrente);
		angulo.setAnguloHarmonico(anguloharmonico);
		
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;   setTempoVariavel((float) (getTempoVariavel() + 0.1))) {
		
		pontosNoGrafico.add(amplitude.getAmplitudeCorrente() * Math.cos(Math.toRadians(getOrdemHarmonica()*frequenciaAngular * getTempoVariavel() + angulo.getAnguloHarmonico())));	
	}
		
		return pontosNoGrafico;
	}
	
}
