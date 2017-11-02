package model;

public class PotenciaAparente extends ValorDaPotencia {
	
	private float PotenciaAparente;
	private float S;
	
	PotenciaAparente(){}

	public float Calcular(int tensao , int corrente) {
		
		S = tensao * corrente;
		
		return S;
		
	}
	
	public float CalcularPotenciaAparente(int tensao , int corrente) {
		
		amplitude.setAmplitudeTensao(tensao);
		amplitude.setAmplitudeCorrente(corrente);
		
		PotenciaAparente = Calcular(amplitude.getAmplitudeTensao(),amplitude.getAmplitudeCorrente());
		
		return PotenciaAparente;
		
	}
	
}
