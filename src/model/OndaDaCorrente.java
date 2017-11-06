package model;

import java.util.ArrayList;

public class OndaDaCorrente extends FormaDeOnda {

	OndaDaCorrente(){}
	
	public ArrayList<Double> GeraListaCorrente(int corrente, int angulocorrente) {
		
		amplitude.setAmplitudeCorrente(corrente);
		angulo.setAnguloCorrente(angulocorrente);
		
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;   setTempoVariavel((float) (getTempoVariavel() + 0.1))) {
		
		pontosNoGrafico.add(amplitude.getAmplitudeCorrente() * Math.cos(Math.toRadians(frequenciaAngular) * getTempoVariavel() + Math.toRadians(angulo.getAnguloCorrente())));	
	}
		return pontosNoGrafico;
		
	}
	
	
	
}
