package model;

import java.util.ArrayList;
import java.util.List;


public class teste {

	public static void main(String[] args) {
		
		List<Double> scores = new ArrayList<>();		

        for (float i = 0; i < 10; i = (float) (i + 0.1)) {
            scores.add(Math.cos(i));
        }

		VerGrafico view = new VerGrafico(scores);
	}


	}


