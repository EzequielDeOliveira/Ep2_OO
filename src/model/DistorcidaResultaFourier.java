package model;

import java.util.ArrayList;

public class DistorcidaResultaFourier extends FormaDeOnda {
	
	OndaDeTensao ondaDaTensao = new OndaDeTensao();
	TensaoDeOrdemHarmonica tensaoHarmonica = new TensaoDeOrdemHarmonica();
	ArrayList<Double> listaTensao = new ArrayList<Double>();
	ArrayList<Double> listaTensaoHarmonica = new ArrayList<Double>();
	ArrayList<Double> listaResultante = new ArrayList<Double>();

	
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
	

}
