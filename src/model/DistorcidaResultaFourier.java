package model;

import java.util.ArrayList;

public class DistorcidaResultaFourier extends FormaDeOnda {
	
	OndaDeTensao ondaDaTensao = new OndaDeTensao();
	TensaoDeOrdemHarmonica tensaoHarmonica = new TensaoDeOrdemHarmonica();
	ArrayList<Double> listaTensao = new ArrayList<Double>();
	ArrayList<Double> listaTensaoHarmonica = new ArrayList<Double>();
	
	
	DistorcidaResultaFourier(){}
	
	public ArrayList<Double> GeraListaDistorcidaResultanteUmHarmonico(int tensao , int angulotensao , int anguloharmonica){
		amplitude.setAmplitudeTensao(tensao);
		angulo.setAnguloTensao(angulotensao);
		angulo.setAnguloHarmonico(anguloharmonica);
		
		listaTensao = ondaDaTensao.GeraListaTensao(amplitude.getAmplitudeTensao(),angulo.getAnguloTensao());
		listaTensaoHarmonica = tensaoHarmonica.GeralistaOrdemHarmonica(amplitude.getAmplitudeTensao(), angulo.getAnguloHarmonico());
		
		for(setTempoVariavel(0); getTempoVariavel() < MaximoDepontos ;setTempoVariavel(getTempoVariavel() + 1)) {
			
			pontosNoGrafico.add(listaTensao.get((int) getTempoVariavel()) + listaTensaoHarmonica.get((int) getTempoVariavel()));
				
		}
		
		return pontosNoGrafico;
	}
	
	
	
	

}
