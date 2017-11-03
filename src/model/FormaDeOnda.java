package model;

import java.util.ArrayList;

public class FormaDeOnda {
	 
	private Amplitude amplitude = new Amplitude();
	private AnguloSenoide angulo = new AnguloSenoide();
	protected ArrayList<Double> pontosNoGrafico = new ArrayList<Double>();
	private float tempoVariavel;
	private float frequenciaAngular = (float) (2 * Math.PI * 60);
	int MaximoDepontos = 10;
	
	public float getTempoVariavel() {
		return tempoVariavel;
	}
	public void setTempoVariavel(float tempoVariavel) {
		this.tempoVariavel = tempoVariavel;
	}
	
	

	
}
