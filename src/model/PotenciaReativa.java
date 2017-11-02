package model;

public class PotenciaReativa extends ValorDaPotencia {
	
	private float potenciaReativa;
	private float P;
	
	PotenciaReativa(){}
	
	public float Calcular(int tensao , int corrente , int angulotensao , int angulocorrente) {
		
		P = (float) (tensao * corrente * Math.sin(angulotensao - angulocorrente)) ;
		
		return P;
		
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
