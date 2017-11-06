package model;

public class PotenciaReativa extends ValorDaPotencia {
	
	private float potenciaReativa;
	private float Q;
	
	PotenciaReativa(){}
	
	public float Calcular(int tensao , int corrente , int angulotensao , int angulocorrente) {
		
		Q = (float) (tensao * corrente * Math.sin(Math.toRadians(angulotensao - angulocorrente))) ;
		
		return Q;
		
	}
	
	public float CalcularPotenciaReativa(int tensao , int corrente , int angulotensao , int angulocorrente) {
		
	amplitude.setAmplitudeTensao(tensao);
	amplitude.setAmplitudeCorrente(corrente);
	angulo.setAnguloTensao(angulotensao);
	angulo.setAnguloCorrente(angulocorrente);
	
	potenciaReativa = Calcular(amplitude.getAmplitudeTensao(),amplitude.getAmplitudeCorrente(),angulo.getAnguloTensao(),angulo.getAnguloCorrente());
		
	return potenciaReativa;
	
	}
	
}
