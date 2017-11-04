package model;

import java.util.ArrayList;

public class DistorcidaResultaFourier extends FormaDeOnda {
	
	OndaDeTensao ondaDaTensao = new OndaDeTensao();
	TensaoDeOrdemHarmonica tensaoHarmonica = new TensaoDeOrdemHarmonica();
	ArrayList<Double> listaTensao = new ArrayList<Double>();
	ArrayList<Double> listaTensaoHarmonica = new ArrayList<Double>();
	ArrayList<Double> listaTensaoHarmonicaAuxiliar = new ArrayList<Double>();

	
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
		
		listaTensaoHarmonicaAuxiliar = GeraListaDistorcidaResultanteUmHarmonico(tensao,angulotensao,anguloharmonico,ordemharmonica);
		//inacabado
		listaTensao = onda
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;setTempoVariavel(getTempoVariavel() + 1)) {
			
			pontosNoGrafico.add(listaTensao.get((int) getTempoVariavel()) + listaTensaoHarmonica.get((int) getTempoVariavel()));
				
		}
		
		return pontosNoGrafico;
	}

	

}
