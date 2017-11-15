package model;

import java.util.ArrayList;

public abstract class FormaDeOnda {

	protected Amplitude amplitude = new Amplitude();
	protected AnguloSenoide angulo = new AnguloSenoide();
	protected ArrayList<Double> pontosNoGrafico = new ArrayList<Double>();
	private float tempoVariavel;
	protected float frequenciaAngular = (float) (2 * 3.14 * 60);
	private int MaximoDepontos = 11;
	float i;

	public float getTempoVariavel() {
		return tempoVariavel;
	}

	public void setTempoVariavel(float tempoVariavel) {
		this.tempoVariavel = tempoVariavel;
	}

	public int getMaximoDepontos() {
		return MaximoDepontos;
	}

	public void setMaximoDepontos(int maximoDepontos) {
		MaximoDepontos = maximoDepontos;
	}

}
