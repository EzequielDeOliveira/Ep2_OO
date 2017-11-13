package controller;

import java.util.ArrayList;

import model.OndaDeTensao;

public class SimulaFluxoDePotenciaFundamental extends Simulacao {

	
	
	public ArrayList<Double> GeraListaOndaFundamental(int tensao , int anguloTensao) {
		
		OndaDeTensao ondaTensao = new OndaDeTensao();
		
		listaResultado = ondaTensao.GeraListaTensao(tensao, anguloTensao);
		
		return listaResultado;	
		
	}

	
}
