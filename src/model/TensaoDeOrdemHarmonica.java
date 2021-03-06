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
	
	public ArrayList<Double> GeralistaOrdemHarmonica(int tensao, int anguloharmonico , int ordemharmonica){
		
		amplitude.setAmplitudeTensao(tensao);
		angulo.setAnguloHarmonico(anguloharmonico);
		setOrdemHarmonica(ordemharmonica);
		
		for(setTempoVariavel(0); getTempoVariavel() < getMaximoDepontos() ;   setTempoVariavel((float) (getTempoVariavel() + 0.1))) {
		
		pontosNoGrafico.add(amplitude.getAmplitudeTensao() * Math.cos(Math.toRadians(getOrdemHarmonica()*frequenciaAngular) * getTempoVariavel() + Math.toRadians(angulo.getAnguloHarmonico())));	
	}
		
		return pontosNoGrafico;
	}
	
}
