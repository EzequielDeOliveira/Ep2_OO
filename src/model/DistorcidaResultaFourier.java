package model;

import java.util.ArrayList;

public class DistorcidaResultaFourier extends FormaDeOnda {
	
	OndaDeTensao ondaDaTensao = new OndaDeTensao();
	TensaoDeOrdemHarmonica tensaoHarmonica = new TensaoDeOrdemHarmonica();
	ArrayList<Double> listaTensao = new ArrayList<Double>();
	ArrayList<Double> listaTensaoHarmonica = new ArrayList<Double>();
	ArrayList<Double> listaResultante = new ArrayList<Double>();
	String resultante = new String();
	String tensaotxt = new String();
	String anguloTensaotxt = new String();
	String anguloHarmonicotxt = new String();
	String ordemHarmonicotxt = new String();

	
	DistorcidaResultaFourier(){}
	
	public ArrayList<Double> GeraListaDistorcidaResultanteUmHarmonico(int tensao , int angulotensao , int anguloharmonica , int ordemharmonica){
		amplitude.setAmplitudeTensao(tensao);
		angulo.setAnguloTensao(angulotensao);
		angulo.setAnguloHarmonico(anguloharmonica);
		
		listaTensao = ondaDaTensao.GeraListaTensao(amplitude.getAmplitudeTensao(),angulo.getAnguloTensao());
		listaTensaoHarmonica = tensaoHarmonica.GeralistaOrdemHarmonica(amplitude.getAmplitudeTensao(), angulo.getAnguloHarmonico() ,ordemharmonica);
		
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;setTempoVariavel(getTempoVariavel() + 1)) {
			
			pontosNoGrafico.add(listaTensao.get((int) getTempoVariavel()) + listaTensaoHarmonica.get((int) getTempoVariavel()));
				
		}
		
		return pontosNoGrafico;
	}
	
	
	public ArrayList<Double> GeraListaDistorcidaResultanteDoisHarmonicos(int tensao , int tensao2 ,int angulotensao ,int angulotensao2, int anguloharmonico ,int anguloharmonica2 , int ordemharmonica , int ordemharmonica2){
		amplitude.setAmplitudeTensao(tensao2);
		angulo.setAnguloTensao(angulotensao2);
		angulo.setAnguloHarmonico(anguloharmonica2);
		
		listaResultante = GeraListaDistorcidaResultanteUmHarmonico(tensao,angulotensao,anguloharmonico,ordemharmonica);
		listaTensaoHarmonica = tensaoHarmonica.GeralistaOrdemHarmonica(amplitude.getAmplitudeTensao(), angulo.getAnguloHarmonico(), ordemharmonica2);
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;setTempoVariavel(getTempoVariavel() + 1)) {
			
			pontosNoGrafico.add(listaTensaoHarmonica.get((int) getTempoVariavel()) + listaResultante.get((int) getTempoVariavel()));
				
		}
		
		return pontosNoGrafico;
	}
	
	
	public ArrayList<Double> GeraListaDistorcidaResultanteTresHarmonicos(int tensao , int tensao2 , int tensao3 ,int angulotensao ,int angulotensao2 ,int angulotensao3, int anguloharmonico ,int anguloharmonica2  ,int anguloharmonica3, int ordemharmonica , int ordemharmonica2, int ordemharmonica3){
		amplitude.setAmplitudeTensao(tensao3);
		angulo.setAnguloTensao(angulotensao3);
		angulo.setAnguloHarmonico(anguloharmonica3);
		
		listaResultante = GeraListaDistorcidaResultanteDoisHarmonicos(tensao , tensao2 ,angulotensao ,angulotensao2, anguloharmonico ,anguloharmonica2 ,ordemharmonica , ordemharmonica2);
		listaTensaoHarmonica = tensaoHarmonica.GeralistaOrdemHarmonica(amplitude.getAmplitudeTensao(), angulo.getAnguloHarmonico(), ordemharmonica3);
		
	for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;setTempoVariavel(getTempoVariavel() + 1)) {
			
			pontosNoGrafico.add(listaTensaoHarmonica.get((int) getTempoVariavel()) + listaResultante.get((int) getTempoVariavel()));
				
		}
	return pontosNoGrafico;
		
	}
	
	public ArrayList<Double> GeraListaDistorcidaResultanteQuatroHarmonicos(int tensao , int tensao2 , int tensao3  , int tensao4 ,int angulotensao ,int angulotensao2 ,int angulotensao3,int angulotensao4, int anguloharmonico ,int anguloharmonica2  ,int anguloharmonica3,int anguloharmonica4, int ordemharmonica , int ordemharmonica2, int ordemharmonica3, int ordemharmonica4){
		amplitude.setAmplitudeTensao(tensao4);
		angulo.setAnguloTensao(angulotensao4);
		angulo.setAnguloHarmonico(anguloharmonica4);
		
		listaResultante = GeraListaDistorcidaResultanteTresHarmonicos(tensao , tensao2 ,tensao3 , angulotensao ,angulotensao2, angulotensao3, anguloharmonico ,anguloharmonica2 ,anguloharmonica3 , ordemharmonica , ordemharmonica2 , ordemharmonica3);
		listaTensaoHarmonica = tensaoHarmonica.GeralistaOrdemHarmonica(amplitude.getAmplitudeTensao(), angulo.getAnguloHarmonico(), ordemharmonica3);
		
	for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;setTempoVariavel(getTempoVariavel() + 1)) {
			
			pontosNoGrafico.add(listaTensaoHarmonica.get((int) getTempoVariavel()) + listaResultante.get((int) getTempoVariavel()));
				
		}
	return pontosNoGrafico;
		
	}
	
	public ArrayList<Double> GeraListaDistorcidaResultanteCincoHarmonicos(int tensao , int tensao2 , int tensao3  , int tensao4 , int tensao5 ,int angulotensao ,int angulotensao2 ,int angulotensao3,int angulotensao4, int angulotensao5 , int anguloharmonico ,int anguloharmonica2  ,int anguloharmonica3,int anguloharmonica4,int anguloharmonica5, int ordemharmonica , int ordemharmonica2, int ordemharmonica3, int ordemharmonica4, int ordemharmonica5){
		amplitude.setAmplitudeTensao(tensao5);
		angulo.setAnguloTensao(angulotensao5);
		angulo.setAnguloHarmonico(anguloharmonica5);
		
		listaResultante = GeraListaDistorcidaResultanteQuatroHarmonicos(tensao , tensao2 ,tensao3 , tensao4 ,  angulotensao ,angulotensao2, angulotensao3, angulotensao4 , anguloharmonico ,anguloharmonica2 ,anguloharmonica3 , anguloharmonica4 , ordemharmonica , ordemharmonica2 , ordemharmonica3, ordemharmonica4);
		listaTensaoHarmonica = tensaoHarmonica.GeralistaOrdemHarmonica(amplitude.getAmplitudeTensao(), angulo.getAnguloHarmonico(), ordemharmonica3);
		
	for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;setTempoVariavel(getTempoVariavel() + 1)) {
			
			pontosNoGrafico.add(listaTensaoHarmonica.get((int) getTempoVariavel()) + listaResultante.get((int) getTempoVariavel()));
				
		}
	return pontosNoGrafico;
		
	}
	
	public ArrayList<Double> GeraListaDistorcidaResultanteSeisHarmonicos(int tensao , int tensao2 , int tensao3  , int tensao4 , int tensao5 , int tensao6 ,int angulotensao ,int angulotensao2 ,int angulotensao3,int angulotensao4, int angulotensao5 , int angulotensao6 , int anguloharmonico ,int anguloharmonica2  ,int anguloharmonica3,int anguloharmonica4,int anguloharmonica5,int anguloharmonica6, int ordemharmonica , int ordemharmonica2, int ordemharmonica3, int ordemharmonica4, int ordemharmonica5 , int ordemharmonica6){
		amplitude.setAmplitudeTensao(tensao6);
		angulo.setAnguloTensao(angulotensao6);
		angulo.setAnguloHarmonico(anguloharmonica6);
		
		listaResultante = GeraListaDistorcidaResultanteCincoHarmonicos(tensao , tensao2 ,tensao3 , tensao4 , tensao5,  angulotensao ,angulotensao2, angulotensao3, angulotensao4, angulotensao5 , anguloharmonico ,anguloharmonica2 ,anguloharmonica3 , anguloharmonica4 , anguloharmonica5 ,  ordemharmonica , ordemharmonica2 , ordemharmonica3, ordemharmonica4 , ordemharmonica5);
		listaTensaoHarmonica = tensaoHarmonica.GeralistaOrdemHarmonica(amplitude.getAmplitudeTensao(), angulo.getAnguloHarmonico(), ordemharmonica3);
		
	for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;setTempoVariavel(getTempoVariavel() + 1)) {
			
			pontosNoGrafico.add(listaTensaoHarmonica.get((int) getTempoVariavel()) + listaResultante.get((int) getTempoVariavel()));
				
		}
	return pontosNoGrafico;
		
	}
	
	public String FourierResultanteUmHarmonico(int tensao , int angulotensao , int anguloharmonica , int ordemharmonica , int tensaoharmonica){
		
		tensaotxt = String.valueOf(tensao);
		anguloTensaotxt = String.valueOf(angulotensao);
		
		if(angulotensao < 0) {
			
	    resultante = tensaotxt +"cos" + "(" + "w" + "t" + "-" + anguloTensaotxt + "°" + ")";
			
		}else {
			
			resultante = tensaotxt +"cos" + "(" + "w" + "t" + "+" + anguloTensaotxt + "°" + ")";
			
		}
		
		
		
		tensaotxt = String.valueOf(tensaoharmonica);
		ordemHarmonicotxt = String.valueOf(ordemharmonica);
		anguloHarmonicotxt = String.valueOf(anguloharmonica);
		
		if(tensaoharmonica < 0) {
			
			resultante = resultante + "-" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
			
		}else if(anguloharmonica < 0) {
			
			resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "-" + anguloHarmonicotxt + "°" + ")"; 
			
		}else 
		{
			
			resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
			
		}

			
				
	   return resultante;
	
	}
	
	public String FourierResultanteDoisHarmonicos(int tensao , int angulotensao , int anguloharmonica , int anguloharmonica2 , int ordemharmonica , int ordemharmonica2 , int tensaoharmonica, int tensaoharmonica2){
		 
	 resultante = FourierResultanteUmHarmonico(tensao , angulotensao , anguloharmonica , ordemharmonica ,tensaoharmonica);
	 tensaotxt = String.valueOf(tensaoharmonica2);
     ordemHarmonicotxt = String.valueOf(ordemharmonica2);
     anguloHarmonicotxt = String.valueOf(anguloharmonica2);
     
     
     if(tensaoharmonica2 < 0) {
			
			resultante = resultante + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
			
		}else if(anguloharmonica2 < 0) {
			
			resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + anguloHarmonicotxt + "°" + ")"; 
			
		}else 
		{
			
			resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
			
		}
 
  
	   return resultante;
	
	}
	
	public String FourierResultanteTresHarmonicos(int tensao , int angulotensao , int anguloharmonica , int anguloharmonica2 , int anguloharmonica3 , int ordemharmonica , int ordemharmonica2 , int ordemharmonica3 , int tensaoharmonica, int tensaoharmonica2 , int tensaoharmonica3){
		 
		 resultante = FourierResultanteDoisHarmonicos( tensao ,  angulotensao , anguloharmonica ,  anguloharmonica2 ,  ordemharmonica , ordemharmonica2 ,tensaoharmonica,tensaoharmonica2);
		 tensaotxt = String.valueOf(tensaoharmonica3);
	     ordemHarmonicotxt = String.valueOf(ordemharmonica3);
	     anguloHarmonicotxt = String.valueOf(anguloharmonica3);
	     
	     
	     if(tensaoharmonica3 < 0) {
				
				resultante = resultante + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
				
			}else if(anguloharmonica3 < 0) {
				
				resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + anguloHarmonicotxt + "°" + ")"; 
				
			}else 
			{
				
				resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
				
			}
	 
	  
		   return resultante;
		
		}
	
	public String FourierResultanteQuatroHarmonicos(int tensao , int angulotensao , int anguloharmonica , int anguloharmonica2 , int anguloharmonica3 , int anguloharmonica4 , int ordemharmonica , int ordemharmonica2 , int ordemharmonica3 , int ordemharmonica4 , int tensaoharmonica, int tensaoharmonica2 , int tensaoharmonica3 ,int tensaoharmonica4){
		 
		 resultante = FourierResultanteTresHarmonicos( tensao ,  angulotensao ,  anguloharmonica , anguloharmonica2 ,  anguloharmonica3 , ordemharmonica , ordemharmonica2 ,  ordemharmonica3 , tensaoharmonica, tensaoharmonica2 ,tensaoharmonica3);
		 tensaotxt = String.valueOf(tensaoharmonica4);
	     ordemHarmonicotxt = String.valueOf(ordemharmonica4);
	     anguloHarmonicotxt = String.valueOf(anguloharmonica4);
	     
	     
	     if(tensaoharmonica4 < 0) {
				
				resultante = resultante + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
				
			}else if(anguloharmonica4 < 0) {
				
				resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + anguloHarmonicotxt + "°" + ")"; 
				
			}else 
			{
				
				resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
				
			}
	 
	  
		   return resultante;
		
		}
	
	public String FourierResultanteCincoHarmonicos(int tensao , int angulotensao , int anguloharmonica , int anguloharmonica2 , int anguloharmonica3 , int anguloharmonica4 ,int anguloharmonica5 ,  int ordemharmonica , int ordemharmonica2 , int ordemharmonica3 , int ordemharmonica4 , int ordemharmonica5 ,int tensaoharmonica, int tensaoharmonica2 , int tensaoharmonica3 ,int tensaoharmonica4 , int tensaoharmonica5){
		 
		 resultante = FourierResultanteQuatroHarmonicos( tensao ,  angulotensao ,  anguloharmonica ,  anguloharmonica2 , anguloharmonica3 , anguloharmonica4 , ordemharmonica , ordemharmonica2 ,  ordemharmonica3 , ordemharmonica4 ,  tensaoharmonica, tensaoharmonica2 , tensaoharmonica3 ,tensaoharmonica4);
		 tensaotxt = String.valueOf(tensaoharmonica5);
	     ordemHarmonicotxt = String.valueOf(ordemharmonica5);
	     anguloHarmonicotxt = String.valueOf(anguloharmonica5);
	     
	     
	     if(tensaoharmonica5 < 0) {
				
				resultante = resultante + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
				
			}else if(anguloharmonica5 < 0) {
				
				resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + anguloHarmonicotxt + "°" + ")"; 
				
			}else 
			{
				
				resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
				
			}
	 
	  
		   return resultante;
		
		}
	
	public String FourierResultanteSeisHarmonicos(int tensao , int angulotensao , int anguloharmonica , int anguloharmonica2 , int anguloharmonica3 , int anguloharmonica4 ,int anguloharmonica5 , int anguloharmonica6 ,  int ordemharmonica , int ordemharmonica2 , int ordemharmonica3 , int ordemharmonica4 , int ordemharmonica5 , int ordemharmonica6 , int tensaoharmonica, int tensaoharmonica2 , int tensaoharmonica3 ,int tensaoharmonica4 , int tensaoharmonica5 , int tensaoharmonica6 ){
		 
		 resultante =  FourierResultanteCincoHarmonicos( tensao ,  angulotensao , anguloharmonica , anguloharmonica2 ,anguloharmonica3 , anguloharmonica4 ,anguloharmonica5 , ordemharmonica ,  ordemharmonica2 , ordemharmonica3 , ordemharmonica4 ,ordemharmonica5 ,tensaoharmonica, tensaoharmonica2 , tensaoharmonica3 , tensaoharmonica4 ,tensaoharmonica5);
		 tensaotxt = String.valueOf(tensaoharmonica6);
	     ordemHarmonicotxt = String.valueOf(ordemharmonica6);
	     anguloHarmonicotxt = String.valueOf(anguloharmonica6);
	     
	     
	     if(tensaoharmonica6 < 0) {
				
				resultante = resultante + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
				
			}else if(anguloharmonica6 < 0) {
				
				resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + anguloHarmonicotxt + "°" + ")"; 
				
			}else 
			{
				
				resultante = resultante + "+" + tensaotxt + "cos" + "(" + ordemHarmonicotxt + "w" + "t" + "+" + anguloHarmonicotxt + "°" + ")"; 
				
			}
	 
	  
		   return resultante;
		
		}

}
