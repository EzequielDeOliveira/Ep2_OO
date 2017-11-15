package controller;

import java.util.ArrayList;

import model.FatorDePotencia;
import model.OndaDaCorrente;
import model.OndaDeTensao;
import model.PotenciaAparente;
import model.PotenciaAtiva;
import model.PotenciaInstantanea;
import model.PotenciaReativa;

public class SimulaFluxoDePotenciaFundamental extends Simulacao {

	float resultado;
	String resultadoTxt = new String();
	
	public ArrayList<Double> ControllerListaOndaTensao(int tensao , int anguloTensao) {
		
		OndaDeTensao ondaTensao = new OndaDeTensao();
		
		listaResultado = ondaTensao.GeraListaTensao(tensao, anguloTensao);
		
		return listaResultado;	
		
	}
	
	public ArrayList<Double>  ControllerListaOndaCorrente(int corrente , int anguloCorrente) {
		
		OndaDaCorrente ondaCorrente = new OndaDaCorrente();
		
		listaResultado = ondaCorrente.GeraListaCorrente(corrente, anguloCorrente);
		
		return listaResultado;	
		
	}
	
public ArrayList<Double>  ControllerListaPotenciaInstantanea(int tensao , int anguloTensao , int corrente , int anguloCorrente) {
		
		PotenciaInstantanea potenciaInstantanea = new PotenciaInstantanea();
		
		listaResultado = potenciaInstantanea.GerarPotenciaSimples(tensao, anguloTensao, corrente, anguloCorrente);
		
		return listaResultado;	
		
	}

 public  String ControllerPotenciaAtiva( int tensao , int corrente , int anguloTensao , int anguloCorrente) {
	
	 PotenciaAtiva potenciaAtiva = new PotenciaAtiva();
	 
	resultado = potenciaAtiva.CalcularPotenciaAtiva(tensao, corrente, anguloTensao, anguloCorrente);
	
	resultadoTxt = String.valueOf((int)resultado) +  "   Watt";
	
	return resultadoTxt;
	
	
	 
 }
	
 public  String ControllerPotenciaRetiva( int tensao , int corrente , int anguloTensao , int anguloCorrente) {
		
	 PotenciaReativa potenciaReativa = new PotenciaReativa();
	 
	resultado = potenciaReativa.CalcularPotenciaReativa(tensao, corrente, anguloTensao, anguloCorrente);
	
     resultadoTxt = String.valueOf((int)resultado) +  "   VAR";

	return resultadoTxt;
	 
 }
 
 public  String ControllerPotenciaAparente( int tensao , int corrente) {
		
	 PotenciaAparente potenciaAparente = new PotenciaAparente();
	 
	resultado = potenciaAparente.CalcularPotenciaAparente(tensao, corrente);
	
	 resultadoTxt = String.valueOf((int)resultado) +  "   VA";
	
	return resultadoTxt;
	 
 }
 
 public  String ControllerFatorDePotencia( int anguloTensao , int anguloCorrente) {
	 
	
	 FatorDePotencia fatorDePotencia = new  FatorDePotencia();
	 
	resultado = fatorDePotencia.CalcularFatorDePotencia(anguloTensao, anguloCorrente);
	
	 resultadoTxt = String.valueOf(resultado) +  "   " + fatorDePotencia.StatusFatorDePotencia(anguloTensao, anguloCorrente);
	
	return resultadoTxt;
	 
 }
 
 public int triangulox( int tensao , int corrente , int anguloTensao , int anguloCorrente) {
	
	 
	 PotenciaAtiva potenciaAtiva = new PotenciaAtiva();
	 
	resultado = potenciaAtiva.CalcularPotenciaAtiva(tensao, corrente, anguloTensao, anguloCorrente);
		
	 
	 
	 return (int)resultado; 
	 
 }
 
 
public int trianguloy( int tensao , int corrente , int anguloTensao , int anguloCorrente) {
	
	 
	 PotenciaReativa potenciaReativa = new PotenciaReativa();
	 
	resultado = potenciaReativa.CalcularPotenciaReativa(tensao, corrente, anguloTensao, anguloCorrente);
		
	 return (int)resultado; 
	 
 }
	
}
