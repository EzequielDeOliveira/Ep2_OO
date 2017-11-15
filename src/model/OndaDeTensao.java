package model;

import java.util.ArrayList;

public class OndaDeTensao extends FormaDeOnda{
	
	public OndaDeTensao(){}
	
	public ArrayList<Double> GeraListaTensao(int tensao, int angulotensao) {
		
		amplitude.setAmplitudeTensao(tensao);
		angulo.setAnguloTensao(angulotensao);
		int contadortempo = 0;
		
		
		for(i = 0; i < getMaximoDepontos() ;   i = ((float) (i + 0.1))) {
		
		pontosNoGrafico.add(amplitude.getAmplitudeTensao() * Math.cos(frequenciaAngular * getTempoVariavel() + angulo.getAnguloTensao()));
			
		contadortempo++;
		setTempoVariavel(contadortempo);
		
		}
		return pontosNoGrafico;
		
	}
	
	
	
	
	
	
}
