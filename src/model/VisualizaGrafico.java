package model;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class VisualizaGrafico {

	private JFrame mainFrame;
	private DesenharGrafico graphPanel;
	private JPanel mainPanel;
	
	public VisualizaGrafico(List<Double> points) {
		buildGraph(points);
	}

	private void buildGraph(List<Double> points) {
		this.mainFrame = new JFrame("Exemplo");
		this.mainFrame.setSize(800, 600);

		mainPanel = new JPanel(new GridLayout(1, 1));
		graphPanel = new DesenharGrafico(points);
		mainPanel.add(graphPanel);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	}

	
}
