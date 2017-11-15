package controller;

import static java.awt.Color.RED;
import static java.awt.Color.black;
import static java.awt.Color.blue;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;

import javax.swing.JPanel;

public class TrianguloDePotencia extends JPanel {
	
	  private int padding = 1;
	    private int labelPadding = 1;
	    private static final Stroke GRAPH_STROKE = new BasicStroke(2f);
	    private double coordenadaX=0;
	    private double coordenadaY=0;
	    
	    
	    public TrianguloDePotencia(double coordenadaX, double coordenadaY) {
	        this.coordenadaX = coordenadaX;
	        this.coordenadaY=coordenadaY;
	    }
	    
	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2 = (Graphics2D) g;
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        
	        setCoordenadas(coordenadaX,coordenadaY);
	        
	        double xScale = ((double) 600);
	        double yScale = ((double) 600);
	        
	     // desenhar fundo branco
	        g2.setColor(Color.WHITE);
	        g2.fillRect(padding + labelPadding, padding, getWidth() - (2 * padding) - labelPadding, getHeight() - 2 * padding - labelPadding);
	        g2.setColor(Color.BLACK);
	        
	        //Cria bordas
	        g2.drawLine(padding + labelPadding, 280 - padding - labelPadding, padding + labelPadding, padding);
	        g2.drawLine(padding + labelPadding, 280- padding - labelPadding, 280- padding, 280- padding - labelPadding);
	        g2.drawLine(280 - padding, 280- padding - labelPadding, 280 - padding, padding);
	        g2.drawLine(padding + labelPadding , padding , 280 - padding, padding );
	        
	        //Cria os eixos X e Y .
	        g2.drawLine((280/2)-2,278,280/2,2); // y1 axi
	        g2.drawLine(2,280/2,280,280/2); // x axi
	        
	        g2.setColor(Color.CYAN);
	        g2.setStroke(GRAPH_STROKE);
	        g2.drawLine(280/2, 280/2, (int) (coordenadaX+280/2), (int) ((-coordenadaY+280/2)));
	        g2.setColor(black);
	        g2.drawLine((int) (coordenadaX+280/2), (int) ((-coordenadaY+280/2)), (int) (coordenadaX+280/2),280/2);
	        g2.setColor(Color.GREEN);
	        g2.drawLine((int) (coordenadaX+280/2), 280/2,280/2, 280/2);

	    }

	    public double getCoordenadaX() {
	        return coordenadaX;
	    }
	    
	    public double getCoordenadaY() {
	        return coordenadaY;
	    } 
	    
	    public void setCoordenadas(double coordenadaX,double coordenadaY) {
	        this.coordenadaX = coordenadaX;
	        this.coordenadaY = coordenadaY;
	        this.repaint();
	    }

}
