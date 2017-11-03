package model;

import java.util.ArrayList;

public class FormaDeOnda {
	 
	 protected Amplitude amplitude = new Amplitude();
	 protected AnguloSenoide angulo = new AnguloSenoide();
	protected ArrayList<Double> pontosNoGrafico = new ArrayList<Double>();
	private float tempoVariavel;
	protected float frequenciaAngular = (float) (2 * Math.PI * 60);
	int MaximoDepontos = 10;
	
	public float getTempoVariavel() {
		return tempoVariavel;
	}
	public void setTempoVariavel(float tempoVariavel) {
		this.tempoVariavel = tempoVariavel;
	}
	
	

	
}
