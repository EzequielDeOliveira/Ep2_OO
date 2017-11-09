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
	Amplitude amplitude = new Amplitude();
	AnguloSenoide angulo = new AnguloSenoide();
	PotenciaAtiva potencia;
	int potenciaAtiva;
	int resultado;
	
	
	@BeforeEach
	void BeforeTests() {
		//Preparação
		amplitude.setAmplitudeTensao(220);
		amplitude.setAmplitudeCorrente(39);
		angulo.setAnguloTensao(0);
		angulo.setAnguloCorrente(35);
		potenciaAtiva = 7028;
		potencia = new PotenciaAtiva();
		
		
	}
	
	@Test
	void CalculaPotenciaAtivatest() {
		
		//ação
		resultado = (int) potencia.CalcularPotenciaAtiva(amplitude.getAmplitudeTensao(), amplitude.getAmplitudeCorrente(),angulo.getAnguloTensao(),angulo.getAnguloCorrente());
		
		//Verificaçao
		
		assertEquals(resultado,potenciaAtiva);
		
		
	}
	
	@AfterEach
	void afterTests() {
		potencia = null;
		amplitude = null;
		angulo = null;
		
	}
	
	

}
