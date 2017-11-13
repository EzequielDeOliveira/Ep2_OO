package model;

import java.util.ArrayList;

public class OndaDeTensao extends FormaDeOnda{
	
	public OndaDeTensao(){}
	
	public ArrayList<Double> GeraListaTensao(int tensao, int angulotensao) {
		
		amplitude.setAmplitudeTensao(tensao);
		angulo.setAnguloTensao(angulotensao);
		int tempo = 0;
		
		
		for(i = 0; i < MaximoDepontos ;   i = ((float) (i + 0.1))) {
		pontosNoGrafico.add(amplitude.getAmplitudeTensao() * Math.cos(Math.toRadians(frequenciaAngular) * getTempoVariavel() +Math.toRadians(angulo.getAnguloTensao())));	
		
		tempo++;
		setTempoVariavel(tempo);
		
		}
		return pontosNoGrafico;
		
	}
	
	
	
	
	
	
}
