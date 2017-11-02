package model;

public class FatorDePotencia  {
	
	private float fatorDePotencia;
	FatorDePotencia(){}
	
	
	public float CalcularFatorDePotencia(int anguloTensao, int anguloCorrente) {
		
		fatorDePotencia = (float) Math.cos(anguloTensao - anguloCorrente);
		
		return fatorDePotencia;
	}
	
	public String StatusFatorDePotencia(int anguloTensao, int anguloCorrente) {
	
	
		fatorDePotencia = anguloTensao - anguloCorrente;
		
		if(fatorDePotencia < 0) {
			return "Adiantado";
		} else if(fatorDePotencia > 0) {
			return "Atrasado";
		}else if(fatorDePotencia == 0) {
			
			return "1";
		}else 
			return null;
		
		
		
		
	}
	

}
