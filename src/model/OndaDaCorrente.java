package model;

import java.util.ArrayList;

public class OndaDaCorrente extends FormaDeOnda {

	public OndaDaCorrente(){}
	
	public ArrayList<Double> GeraListaCorrente(int corrente, int angulocorrente) {
		
		amplitude.setAmplitudeCorrente(corrente);
		angulo.setAnguloCorrente(angulocorrente);
		int contadorDetempo = 0;
		
		for(i = 0; i < getMaximoDepontos() ;   i = ((float) (i + 0.1))) {
			pontosNoGrafico.add(amplitude.getAmplitudeCorrente() * Math.cos(frequenciaAngular * getTempoVariavel() + angulo.getAnguloCorrente()));	
			
			contadorDetempo++;
			setTempoVariavel(contadorDetempo);
			
			}
		return pontosNoGrafico;
		
	}
	
	
	
}
