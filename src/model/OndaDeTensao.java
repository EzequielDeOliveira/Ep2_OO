package model;

public class OndaDeTensao extends FormaDeOnda{
	
	OndaDeTensao(){}
	
	public void GeraListaTensao(int tensao, int angulotensao) {
		
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;   setTempoVariavel((float) (getTempoVariavel() + 0.1))) {
		
		pontosNoGrafico.add((double) getTempoVariavel());	
			
		}
		
	}

}
