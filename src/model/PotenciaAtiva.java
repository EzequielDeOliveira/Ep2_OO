package model;

public class PotenciaAtiva extends ValorDaPotencia {

	private float potenciaAtiva;
	FatorDePotencia Fp = new FatorDePotencia();
	
	PotenciaAtiva(){}
	
	public float Calcular(int tensao , int corrente , int angulotensao , int angulocorrente) {
	 float P;
	 
	 P = tensao*corrente*Fp.CalcularFatorDePotencia(angulotensao, angulocorrente);
		
	return P;
		
	}
	
	public float CalcularPotenciaAtiva(int tensao , int corrente , int angulotensao , int angulocorrente) {
	
		amplitude.setAmplitudeTensao(tensao);
		amplitude.setAmplitudeCorrente(corrente);
		angulo.setAnguloTensao(angulotensao);
		angulo.setAnguloCorrente(corrente);
		
		potenciaAtiva = Calcular(amplitude.getAmplitudeTensao(),amplitude.getAmplitudeCorrente(),angulo.getAnguloTensao(),angulo.getAnguloCorrente());
		
		return potenciaAtiva;
	}
	
	
}
