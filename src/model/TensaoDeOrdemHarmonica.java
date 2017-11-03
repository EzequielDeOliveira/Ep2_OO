package model;

import java.util.ArrayList;

public class TensaoDeOrdemHarmonica extends FormaDeOnda {
	private int ordemHarmonica;
	
	
	TensaoDeOrdemHarmonica() {}

	public int getOrdemHarmonica() {
		return ordemHarmonica;
	}

	public void setOrdemHarmonica(int ordemHarmonica) {
		this.ordemHarmonica = ordemHarmonica;
	}
	
	public ArrayList<Double> GeralistaOrdemHarmonica(int tensao, int anguloharmonico){
		
		amplitude.setAmplitudeTensao(tensao);
		angulo.setAnguloHarmonico(anguloharmonico);
		
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;   setTempoVariavel((float) (getTempoVariavel() + 0.1))) {
		
		pontosNoGrafico.add(amplitude.getAmplitudeTensao() * Math.cos(getOrdemHarmonica()*frequenciaAngular * getTempoVariavel() + angulo.getAnguloHarmonico()));	
	}
		
		return pontosNoGrafico;
	}
	
}
