package model;

import java.util.ArrayList;

public class OndaDeTensao extends FormaDeOnda{
	
	public OndaDeTensao(){}
	
	public ArrayList<Double> GeraListaTensao(int tensao, int angulotensao) {
		
		amplitude.setAmplitudeTensao(tensao);
		angulo.setAnguloTensao(angulotensao);
		
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;   setTempoVariavel((float) (getTempoVariavel() + 0.1))) {
		
		pontosNoGrafico.add(amplitude.getAmplitudeTensao() * Math.cos(frequenciaAngular * getTempoVariavel() +Math.toRadians(angulo.getAnguloTensao())));	
	}
		return pontosNoGrafico;
		
	}
	
	
	
	
	
	
}
