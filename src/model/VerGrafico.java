package model;

import java.awt.GridLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class VerGrafico {
	private JFrame mainFrame;
	private DesenhaGrafico graphPanel;
	private JPanel mainPanel;
	
	public VerGrafico(List<Double> points) {
		buildGraph(points);
	}

	private void buildGraph(List<Double> points) {
		this.mainFrame = new JFrame("Exemplo Gráfico java");
		this.mainFrame.setSize(800, 600);
        this.mainFrame.setLocation(293, 70);

		mainPanel = new JPanel(new GridLayout(1, 1));
		graphPanel = new DesenhaGrafico(points);
		mainPanel.add(graphPanel);
		mainFrame.add(mainPanel);
		mainFrame.setVisible(true);
	}

}
