package controller;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class DesenharGrafico extends JPanel {
	
	private int padding = 5;
    private int labelPadding = 5;
    private int width = 400;
    private int height = 150;
    private Color lineColor;
	private Color pointColor = new Color(100, 100, 100, 180);
    private Color gridColor = new Color(200, 200, 200, 200);
    private static final Stroke GRAPH_STROKE = new BasicStroke(2f);
    private int pointWidth = 4;
    private int numberYDivisions = 10;
    private List<Double> scores;

    public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public DesenharGrafico(List<Double> scores) {
        this.scores = scores;
    }
    
    public int getWidth() {
    		return this.width;
    }
    
    public int getHeight() {
    		return this.height;
    }

    @Override
    protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        double xScale = ((double) getWidth() - (2 * padding) - labelPadding) / (scores.size() - 1);
        double yScale = ((double) getHeight() - 2 * padding - labelPadding) / (getMaxScore() - getMinScore());

        List<Point> graphPoints = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            int x1 = (int) (i * xScale + padding + labelPadding);
            int y1 = (int) ((getMaxScore() - scores.get(i)) * yScale + padding);
            graphPoints.add(new Point(x1, y1));
        }

        // Desenha o fundo do gráfico
        g2.setColor(Color.WHITE);
        g2.fillRect(padding + labelPadding, padding, getWidth() - (2 * padding) - labelPadding, getHeight() - 2 * padding - labelPadding);
        g2.setColor(Color.BLACK);

        // Desenha as Linhas para X e Y
        
        // Linha para Y
        for (int i = 0; i < numberYDivisions + 1; i++) {
            int x0 = padding + labelPadding;
            int x1 = pointWidth + padding + labelPadding;
            int y0 = getHeight() - ((i * (getHeight() - padding * 2 - labelPadding)) / numberYDivisions + padding + labelPadding);
            int y1 = y0;
            g2.setColor(Color.BLACK);
            if(i%2==0)
                g2.drawLine(x0, y0, x1, y1);
        }
        
        // Linha para X
        for (int i = 0; i < scores.size(); i++) {
            if (scores.size() > 1) {
                int x0 = i * (getWidth() - padding * 2 - labelPadding) / (scores.size() - 1) + padding + labelPadding;
                int x1 = x0;
                int y0 = getHeight() - padding - labelPadding;
                int y1 = y0 - pointWidth;
                g2.setColor(Color.BLACK);
                if(i%2==0)
                    g2.drawLine(x0, y0, x1, y1);
            }
        }
        
        // Cria a moldura para o gráfico
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, padding + labelPadding, padding);
        g2.drawLine(padding + labelPadding, getHeight() - padding - labelPadding, getWidth() - padding, getHeight() - padding - labelPadding);
        g2.drawLine(getWidth() - padding, getHeight() - padding - labelPadding, getWidth() - padding, padding);
        g2.drawLine(padding + labelPadding, padding, getWidth() - padding, padding);
        
        // Desenha as linhas entre os pontos do gráfico
        Stroke oldStroke = g2.getStroke();
        g2.setColor(lineColor);
        g2.setStroke(GRAPH_STROKE);
        for (int i = 0; i < graphPoints.size() - 1; i++) {
            int x1 = graphPoints.get(i).x;
            int y1 = graphPoints.get(i).y;
            int x2 = graphPoints.get(i + 1).x;
            int y2 = graphPoints.get(i + 1).y;
            g2.drawLine(x1, y1, x2, y2);
        }

    }

    private double getMinScore() {
        double minScore = Double.MAX_VALUE;
        for (Double score : scores) {
            minScore = Math.min(minScore, score);
        }
        return minScore;
    }

    private double getMaxScore() {
        double maxScore = Double.MIN_VALUE;
        for (Double score : scores) {
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }

    public void setScores(List<Double> scores) {
        this.scores = scores;
        invalidate();
        this.repaint();
    }

    public List<Double> getScores() {
        return scores;
    }
    
    
    public Color getLineColor() {
  		return lineColor;
  	}

  	public void setLineColor(Color lineColor) {
  		this.lineColor = lineColor;
  	}


	    
	    public void mudaCor(Color cor) {
	    	
	    setLineColor(cor);
	    	
	    }
	    

}