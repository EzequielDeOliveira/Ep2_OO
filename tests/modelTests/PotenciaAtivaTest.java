package modelTests;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Amplitude;
import model.AnguloSenoide;
import model.PotenciaAtiva;

class PotenciaAtivaTest {
	int tensao;
	int corrente;
	int anguloTensao;
	int anguloCorrente;
	int potenciaAtiva;
	PotenciaAtiva potencia;
	int resultado;
	
	
	@BeforeEach
	void BeforeTests() {
		//Preparação
		tensao = 220;
		corrente = 39;
		anguloTensao = 0;
		anguloCorrente = 35;
		potenciaAtiva = 7028;
		potencia = new PotenciaAtiva();
		
		
	}
	
	@Test
	void CalculaPotenciaAtivatest() {
		
		//ação
	 resultado =  (int) potencia.CalcularPotenciaAtiva(tensao,corrente,anguloTensao,anguloCorrente);
		
		//Verificaçao
		
		assertEquals(potenciaAtiva,resultado);
		
		
	}
	
	@AfterEach
	void afterTests() {
		potencia = null;
		
	}
	
	

}