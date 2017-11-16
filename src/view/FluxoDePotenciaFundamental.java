package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.DesenharGrafico;
import controller.SimulaFluxoDePotenciaFundamental;
import controller.TrianguloDePotencia;
import controller.acoesInterfacePotenciaFundamental;

public class FluxoDePotenciaFundamental {

	JPanel painelPrincipal = new JPanel();
	JPanel parteSuperior = new JPanel();
	JPanel parteInferior = new JPanel();
	JPanel superior1 = new JPanel();
	JPanel superior2 = new JPanel();
	JPanel inferior1 = new JPanel();
	JPanel esquerdaSuperior1 = new JPanel();
	JPanel esquerdaSuperior2 = new JPanel();
	JPanel direitaSuperior1 = new JPanel();
	JPanel direitaSuperior2 = new JPanel();

	JButton botaoOndaTensao = new JButton("OK");
	JButton botaoOndaCorrente = new JButton("OK");
	JButton botaoResultados = new JButton("Resultados");
	JButton botaoVoltar = new JButton("Voltar");

	JLabel labelTensao = new JLabel("Amplitude(Tensão)");
	JLabel labelCorrente = new JLabel("Amplitude(Corrente)");
	JLabel labelAnguloTensao = new JLabel("Ângulo da fase(Tensão)");
	JLabel labelAnguloCorrente = new JLabel("Ângulo da fase(Corrente)");
	JLabel potenciaAtiva = new JLabel("- Pôtencia ativa");
	JLabel potenciaReativa = new JLabel("- Pôtencia reativa");
	JLabel potenciaAparente = new JLabel("- Pôtencia aparente");
	JLabel fatorDePotencia = new JLabel("- Fator de potência");
	JLabel labelPotenciaInstantanea = new JLabel("Potência instantânea");

	JTextField tensaoTxt = new JTextField("0");
	JTextField correnteTxt = new JTextField("0");
	JTextField anguloTensaoTxt = new JTextField("0");
	JTextField anguloCorrenteTxt = new JTextField("0");
	JTextField potenciaAtivaTxt = new JTextField("0");
	JTextField potenciaReativaTxt = new JTextField("0");
	JTextField potenciaAparenteTxt = new JTextField("0");
	JTextField fatorDePotenciaTxt = new JTextField("0");

	TrianguloDePotencia triangulo = new TrianguloDePotencia(-2, 0);

	DesenharGrafico graficoTensao = new DesenharGrafico(scoresInit(), false);
	DesenharGrafico graficoCorrente = new DesenharGrafico(scoresInit(), false);
	DesenharGrafico graficoPotenciaInstantanea = new DesenharGrafico(scoresInit(), true);
	SimulaFluxoDePotenciaFundamental potenciaFundamental = new SimulaFluxoDePotenciaFundamental();

	JFrame telaPrincipal = new JFrame();
	
	public FluxoDePotenciaFundamental() {
		
		PreparaTela(telaPrincipal);
		
	}
		
		
		public void PreparaTela(JFrame telaPrincipal) {

	
		telaPrincipal = new JFrame("Fluxo de potência fundamental");
		telaPrincipal.setSize(1300, 650);

		painelPrincipal.setLayout(new GridLayout(2, 1));
		parteSuperior.setLayout(new GridLayout(2, 1));
		parteSuperior.setLayout(new GridLayout(2, 1));
		parteInferior.setLayout(new GridLayout(1, 2));
		superior1.setLayout(new GridLayout(1, 2));
		superior2.setLayout(new GridLayout(1, 2));
		inferior1.setLayout(null);
		esquerdaSuperior1.setLayout(null);
		esquerdaSuperior2.setLayout(null);
		direitaSuperior1.setLayout(null);
		direitaSuperior2.setLayout(null);

		labelTensao.setBounds(250, 10, 150, 20);
		tensaoTxt.setBounds(400, 10, 40, 20);
		labelAnguloTensao.setBounds(250, 60, 150, 20);
		anguloTensaoTxt.setBounds(400, 60, 40, 20);

		botaoOndaTensao.setBounds(500, 35, 80, 20);
		botaoOndaCorrente.setBounds(500, 35, 80, 20);
		botaoResultados.setBounds(550, 20, 100, 40);
		botaoVoltar.setBounds(1190, 280, 70, 20);

		labelCorrente.setBounds(250, 10, 150, 20);
		correnteTxt.setBounds(400, 10, 40, 20);
		labelAnguloCorrente.setBounds(250, 60, 150, 20);
		anguloCorrenteTxt.setBounds(400, 60, 40, 20);

		potenciaAtiva.setBounds(2, 5, 150, 20);
		potenciaReativa.setBounds(2, 25, 150, 20);
		potenciaAparente.setBounds(2, 45, 150, 20);
		fatorDePotencia.setBounds(2, 65, 150, 20);

		potenciaAtivaTxt.setBounds(200, 5, 150, 20);
		potenciaReativaTxt.setBounds(200, 25, 150, 20);
		potenciaAparenteTxt.setBounds(200, 45, 150, 20);
		fatorDePotenciaTxt.setBounds(200, 65, 150, 20);

		labelPotenciaInstantanea.setBounds(190, 100, 150, 10);

		graficoTensao.setBounds(60, 10, 500, 140);
		graficoCorrente.setBounds(60, 10, 500, 140);
		graficoPotenciaInstantanea.setBounds(5, 110, 500, 190);

		triangulo.setBounds(800, 15, 280, 280);
		

		graficoTensao.mudaCor(Color.RED);
		graficoCorrente.mudaCor(Color.BLUE);
		graficoPotenciaInstantanea.mudaCor(Color.MAGENTA);

		esquerdaSuperior1.add(labelTensao);
		esquerdaSuperior1.add(tensaoTxt);
		esquerdaSuperior1.add(labelAnguloTensao);
		esquerdaSuperior1.add(anguloTensaoTxt);
		esquerdaSuperior1.add(botaoOndaTensao);
		esquerdaSuperior2.add(botaoOndaCorrente);
		esquerdaSuperior2.add(labelCorrente);
		esquerdaSuperior2.add(correnteTxt);
		esquerdaSuperior2.add(labelAnguloCorrente);
		esquerdaSuperior2.add(anguloCorrenteTxt);

		esquerdaSuperior1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		esquerdaSuperior2.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

		direitaSuperior1.setBorder(BorderFactory.createTitledBorder("Tensão"));
		direitaSuperior2.setBorder(BorderFactory.createTitledBorder("Corrente"));

		parteSuperior.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

		inferior1.add(botaoResultados);
		inferior1.add(botaoVoltar);
		inferior1.add(triangulo);
		inferior1.add(potenciaAtiva);
		inferior1.add(potenciaReativa);
		inferior1.add(potenciaAparente);
		inferior1.add(fatorDePotencia);
		inferior1.add(potenciaAtivaTxt);
		inferior1.add(potenciaReativaTxt);
		inferior1.add(potenciaAparenteTxt);
		inferior1.add(fatorDePotenciaTxt);
		inferior1.add(labelPotenciaInstantanea);
		inferior1.add(graficoPotenciaInstantanea);

		superior1.add(esquerdaSuperior1);
		superior2.add(esquerdaSuperior2);

		parteSuperior.add(superior1);
		parteSuperior.add(superior2);

		botaoOndaTensao.setActionCommand("tensao");
		botaoOndaCorrente.setActionCommand("corrente");
		botaoResultados.setActionCommand("resultados");
		botaoVoltar.setActionCommand("voltar");

		botaoOndaTensao.addActionListener(new acoesInterfacePotenciaFundamental(graficoTensao, direitaSuperior1, tensaoTxt, anguloTensaoTxt));
		botaoOndaCorrente.addActionListener(new acoesInterfacePotenciaFundamental(graficoCorrente, direitaSuperior2,correnteTxt, anguloCorrenteTxt));
		botaoResultados.addActionListener(new acoesInterfacePotenciaFundamental(graficoPotenciaInstantanea,inferior1, tensaoTxt,anguloTensaoTxt,correnteTxt,anguloCorrenteTxt,potenciaAtivaTxt,potenciaReativaTxt, potenciaAparenteTxt , fatorDePotenciaTxt , triangulo));
		botaoVoltar.addActionListener(new acoesInterfacePotenciaFundamental(telaPrincipal,painelPrincipal));
		
		parteInferior.add(inferior1);
		
		direitaSuperior1.add(graficoTensao);
		direitaSuperior2.add(graficoCorrente);

		superior1.add(direitaSuperior1);
		superior2.add(direitaSuperior2);

		painelPrincipal.add(parteSuperior);
		painelPrincipal.add(parteInferior);

		telaPrincipal.add(painelPrincipal);

		telaPrincipal.setVisible(true);

	}



	public static ArrayList<Double> scoresInit() {
		ArrayList<Double> scores = new ArrayList<>();
		Double value;

		for (double i = 0; i < 70; i = i + 0.5) {
			value = (double) 0;
			scores.add((double) value);
		}

		return scores;
	}

}
