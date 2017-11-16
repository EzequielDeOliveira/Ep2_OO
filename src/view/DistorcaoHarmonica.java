package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import controller.DesenharGrafico;
import controller.acoesInterfaceDistorcaoHarmonica;

public class DistorcaoHarmonica {
	
	
	JPanel harmonico1 = new JPanel();
	JPanel harmonico2= new JPanel();
	JPanel harmonico3 = new JPanel();
	JPanel harmonico4 = new JPanel();
	JPanel harmonico5 = new JPanel();
	JPanel harmonico6 = new JPanel();
	JPanel harmonico7 = new JPanel();
	JPanel entrada = new JPanel();
	JPanel saida = new JPanel();
	JPanel coluna1 = new JPanel();
	JPanel coluna2 = new JPanel();
	
	JLabel ampTensaolabel = new JLabel("Amplitude(Tensão)");
	JTextField ampTensaoTxt = new JTextField();
	JLabel angTensaolabel = new JLabel("Ângulo(Tensão)");
	JTextField angTensaoTxt = new JTextField();
	JLabel graficoTensaoLabel = new JLabel("Componente Fundamental");
	JButton okTensao = new JButton("Ok");
	DesenharGrafico graficoTensao = new DesenharGrafico(scoresInit(),false);
	

	JRadioButton par= new JRadioButton("Par",true); 
	JRadioButton impar = new JRadioButton("impar"); 
	ButtonGroup Gp = new ButtonGroup();
	
	JButton umHarmonico = new JButton("1");
	JButton doisHarmonico = new JButton("2");
	JButton tresHarmonico = new JButton("3");
	JButton quatroHarmonico = new JButton("4");
	JButton cincoHarmonico = new JButton("5");
	JButton seisHarmonico = new JButton("6");
	
	
	JLabel ordemHarmonica = new JLabel("Ordem hârmonica");
	JLabel labelTensao = new JLabel("Amplitude(Tensão)");
	JLabel labelAngTensao = new JLabel("Ângulo(Tensão)");
	
	JLabel ordem2 = new JLabel("Ordem hârmonica");
	JLabel labelTensao2 = new JLabel("Amplitude(Tensão)");
	JLabel labelAngTensao2 = new JLabel("Ângulo(Tensão)");

	JLabel ordem3 = new JLabel("Ordem hârmonica");
	JLabel labelTensao3 = new JLabel("Amplitude(Tensão)");
	JLabel labelAngTensao3 = new JLabel("Ângulo(Tensão)");

	JLabel ordem4 = new JLabel("Ordem hârmonica");
	JLabel labelTensao4 = new JLabel("Amplitude(Tensão)");
	JLabel labelAngTensao4 = new JLabel("Ângulo(Tensão)");
	
	JLabel ordem5 = new JLabel("Ordem hârmonica");
	JLabel labelTensao5 = new JLabel("Amplitude(Tensão)");
	JLabel labelAngTensao5 = new JLabel("Ângulo(Tensão)");
	
	JLabel ordem6 = new JLabel("Ordem hârmonica");
	JLabel labelTensao6 = new JLabel("Amplitude(Tensão)");
	JLabel labelAngTensao6 = new JLabel("Ângulo(Tensão)");
	
	JTextField ordemHarmonica1 = new JTextField();
	JTextField ordemHarmonica2 = new JTextField();
	JTextField ordemHarmonica3 = new JTextField();
	JTextField ordemHarmonica4 = new JTextField();
	JTextField ordemHarmonica5 = new JTextField();
	JTextField ordemHarmonica6 = new JTextField();
	
	JTextField ampTensao1Txt = new JTextField();
	JTextField ampTensao2Txt = new JTextField();
	JTextField ampTensao3Txt = new JTextField();
	JTextField ampTensao4Txt = new JTextField();
	JTextField ampTensao5Txt = new JTextField();
	JTextField ampTensao6Txt = new JTextField();
	
	JTextField angTensao1Txt = new JTextField();
	JTextField angTensao2Txt = new JTextField();
	JTextField angTensao3Txt = new JTextField();
	JTextField angTensao4Txt = new JTextField();
	JTextField angTensao5Txt = new JTextField();
	JTextField angTensao6Txt = new JTextField();
	
	JTextField resultado = new JTextField();
	
	DesenharGrafico ondaHarmonica1 = new DesenharGrafico(scoresInit(),false);
	DesenharGrafico ondaHarmonica2 = new DesenharGrafico(scoresInit(),false);
	DesenharGrafico ondaHarmonica3 = new DesenharGrafico(scoresInit(),false);
	DesenharGrafico ondaHarmonica4 = new DesenharGrafico(scoresInit(),false);
	DesenharGrafico ondaHarmonica5 = new DesenharGrafico(scoresInit(),false);
	DesenharGrafico ondaHarmonica6 = new DesenharGrafico(scoresInit(),false);
	DesenharGrafico resultante = new DesenharGrafico(scoresInit(),true);

	JLabel resultanteLabel = new JLabel("Resultante");
	JLabel fourierLabel = new JLabel("Série de Fourier Amplitude-fase");
	
	JFrame telaPrincipal = new JFrame();
	
	JButton okButton = new JButton("OK");
	
	
	public DistorcaoHarmonica(){
		
		ConstroiTela(telaPrincipal);
		
	}
	
	public void ConstroiTela(JFrame telaPrincipal) {
		
		telaPrincipal.setSize(1500,700);
		telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaPrincipal.setLayout(new GridLayout(1,2));
		telaPrincipal.setTitle("Distorção Harmônica");
	
		
		coluna1.setLayout(new GridLayout(2,1));
		coluna2.setLayout(new GridLayout(7,1));
		
		//entrada
		entrada.setBorder(BorderFactory.createLineBorder(Color.black));
		entrada.setLayout(null);
		ampTensaolabel.setBounds(5,10,130,30);
		entrada.add(ampTensaolabel);
		ampTensaoTxt.setBounds(120,17,80,20);
		entrada.add(ampTensaoTxt);
		angTensaolabel.setBounds(10,35,130,30);
		entrada.add(angTensaolabel);
		angTensaoTxt.setBounds(120,40,80,20);
		entrada.add(angTensaoTxt);
		okTensao.setBounds(390, 20, 100, 40);
		entrada.add(okTensao);
		graficoTensaoLabel.setBounds(200, 80, 200, 40);
		entrada.add(graficoTensaoLabel);
	    graficoTensao.setBounds(3,110,625,210);
		entrada.add(graficoTensao);
		par.setBounds(540, 10,50, 20);
		impar.setBounds(540, 30, 80, 20);
		Gp.add(par);
		Gp.add(impar);
		entrada.add(par);
		entrada.add(impar);
		entrada.setBounds(5, 5, 500,300);
		
	
	
		
	// harmonicos	
		harmonico1.setLayout(null);
		JLabel selecaoNum = new JLabel("Numéro de ordens harmonicas:");
		harmonico1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		harmonico1.add(selecaoNum,BorderLayout.CENTER);
		selecaoNum.setBounds(10,1,200,50);
		umHarmonico.setBounds(1,40,50,50);
		doisHarmonico.setBounds(50, 40,50,50);
		tresHarmonico.setBounds(100,40,50,50);
		quatroHarmonico.setBounds(150,40,50,50);
		cincoHarmonico.setBounds(200,40,50,50);
		seisHarmonico.setBounds(250,40,60,50);
		harmonico1.add(selecaoNum);
		harmonico1.add(umHarmonico);
		harmonico1.add(doisHarmonico);
		harmonico1.add(tresHarmonico);
		harmonico1.add(quatroHarmonico);
		harmonico1.add(cincoHarmonico);
		harmonico1.add(seisHarmonico);
		
		harmonico2.setLayout(null);
		harmonico2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ordemHarmonica.setBounds(12,8,120, 10);
		harmonico2.add(ordemHarmonica);
		ordemHarmonica1.setBounds(115, 5,40, 20);
		harmonico2.add(ordemHarmonica1);
		labelTensao.setBounds(10, 30, 120, 20);
		harmonico2.add(labelTensao);
		ampTensao1Txt.setBounds(118, 30, 40, 20);
		harmonico2.add(ampTensao1Txt);
		labelAngTensao.setBounds(10, 55, 140, 20);
		harmonico2.add(labelAngTensao);
		angTensao1Txt.setBounds(118, 55, 40, 20);
		harmonico2.add(angTensao1Txt);
		ondaHarmonica1.setBounds(200, 3, 430,90);
		harmonico2.add(ondaHarmonica1);
		
	
		harmonico3.setLayout(null);
		harmonico3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ordem2.setBounds(12,8,120, 10);
		harmonico3.add(ordem2);
		ordemHarmonica2.setBounds(115, 5,40, 20);
		harmonico3.add(ordemHarmonica2);
		labelTensao2.setBounds(10, 30, 120, 20);
		harmonico3.add(labelTensao2);
		ampTensao2Txt.setBounds(118, 30, 40, 20);
		harmonico3.add(ampTensao2Txt);
		labelAngTensao2.setBounds(10, 55, 140, 20);
		harmonico3.add(labelAngTensao2);
		angTensao2Txt.setBounds(118, 55, 40, 20);
		harmonico3.add(angTensao2Txt);
		ondaHarmonica2.setBounds(200, 3, 430,90);
		harmonico3.add(ondaHarmonica2);
	
		harmonico4.setLayout(null);
		harmonico4.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ordem3.setBounds(12,8,120, 10);
		harmonico4.add(ordem3);
		ordemHarmonica3.setBounds(115, 5,40, 20);
		harmonico4.add(ordemHarmonica3);
		labelTensao3.setBounds(10, 30, 120, 20);
		harmonico4.add(labelTensao3);
		ampTensao3Txt.setBounds(118, 30, 40, 20);
		harmonico4.add(ampTensao3Txt);
		labelAngTensao3.setBounds(10, 55, 140, 20);
		harmonico4.add(labelAngTensao3);
		angTensao3Txt.setBounds(118, 55, 40, 20);
		harmonico4.add(angTensao3Txt);
		ondaHarmonica3.setBounds(200, 3, 430,90);
		harmonico4.add(ondaHarmonica3);
		
		harmonico5.setLayout(null);
		harmonico5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ordem4.setBounds(12,8,120,10);
		harmonico5.add(ordem4);
		ordemHarmonica4.setBounds(115, 5,40, 20);
		harmonico5.add(ordemHarmonica4);
		labelTensao4.setBounds(10, 30, 120, 20);
		harmonico5.add(labelTensao4);
		ampTensao4Txt.setBounds(118, 30, 40, 20);
		harmonico5.add(ampTensao4Txt);
		labelAngTensao4.setBounds(10, 55, 140, 20);
		harmonico5.add(labelAngTensao4);
		angTensao4Txt.setBounds(118, 55, 40, 20);
		harmonico5.add(angTensao4Txt);
		ondaHarmonica4.setBounds(200, 3, 430,90);
		harmonico5.add(ondaHarmonica4);
		
		harmonico6.setLayout(null);
		harmonico6.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ordem5.setBounds(12,8,120, 10);
		harmonico6.add(ordem5);
		ordemHarmonica5.setBounds(115, 5,40, 20);
		harmonico6.add(ordemHarmonica5);
		labelTensao5.setBounds(10, 30, 120, 20);
		harmonico6.add(labelTensao5);
		ampTensao5Txt.setBounds(118, 30, 40, 20);
		harmonico6.add(ampTensao5Txt);
		labelAngTensao5.setBounds(10, 55, 140, 20);
		harmonico6.add(labelAngTensao5);
		angTensao5Txt.setBounds(118, 55, 40, 20);
		harmonico6.add(angTensao5Txt);
		ondaHarmonica5.setBounds(200, 3, 430,90);
		harmonico6.add(ondaHarmonica5);
		
		harmonico7.setLayout(null);
		harmonico7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ordem6.setBounds(12,8,120, 10);
		harmonico7.add(ordem6);
		ordemHarmonica6.setBounds(115, 5,40, 20);
		harmonico7.add(ordemHarmonica6);
		labelTensao6.setBounds(10, 30, 120, 20);
		harmonico7.add(labelTensao6);
		ampTensao6Txt.setBounds(118, 30, 40, 20);
		harmonico7.add(ampTensao6Txt);
		labelAngTensao6.setBounds(10, 55, 140, 20);
		harmonico7.add(labelAngTensao6);
		angTensao6Txt.setBounds(118, 55, 40, 20);
		harmonico7.add(angTensao6Txt);
		ondaHarmonica6.setBounds(200, 3, 430,90);
		harmonico7.add(ondaHarmonica6);
		
		
		// saida
		saida.setBorder(BorderFactory.createLineBorder(Color.black));
		saida.setLayout(null);
		resultanteLabel.setBounds(5,10,130,30);
		saida.add(resultanteLabel);
		resultante.setBounds(80, 20, 550, 200);
		saida.add(resultante);
		fourierLabel.setBounds(5, 230, 200, 20);
		saida.add(fourierLabel);
		resultado.setBounds(10, 250,500, 30);
		saida.add(resultado);
		okButton.setBounds(5, 60, 75, 80);
		saida.add(okButton);
		
		umHarmonico.setActionCommand("1");
		doisHarmonico.setActionCommand("2");
		tresHarmonico.setActionCommand("3");
		quatroHarmonico.setActionCommand("4");
		cincoHarmonico.setActionCommand("5");
		seisHarmonico.setActionCommand("6");
		
		
		okButton.setActionCommand("ok");
		okButton.addActionListener(new acoesInterfaceDistorcaoHarmonica(ampTensao1Txt,angTensao1Txt,ordemHarmonica1 ,ampTensao2Txt,angTensao2Txt,ordemHarmonica2 ,ampTensao3Txt,angTensao3Txt,ordemHarmonica3 ,ampTensao4Txt,angTensao4Txt,ordemHarmonica4 ,ampTensao5Txt,angTensao5Txt,ordemHarmonica5 ,ampTensao6Txt,angTensao6Txt,ordemHarmonica6  ));
		
		umHarmonico.addActionListener(new acoesInterfaceDistorcaoHarmonica(harmonico2,harmonico3,harmonico4,harmonico5,harmonico6,harmonico7));
		doisHarmonico.addActionListener(new acoesInterfaceDistorcaoHarmonica(harmonico2,harmonico3,harmonico4,harmonico5,harmonico6,harmonico7));
		tresHarmonico.addActionListener(new acoesInterfaceDistorcaoHarmonica(harmonico2,harmonico3,harmonico4,harmonico5,harmonico6,harmonico7));
		quatroHarmonico.addActionListener(new acoesInterfaceDistorcaoHarmonica(harmonico2,harmonico3,harmonico4,harmonico5,harmonico6,harmonico7));
		cincoHarmonico.addActionListener(new acoesInterfaceDistorcaoHarmonica(harmonico2,harmonico3,harmonico4,harmonico5,harmonico6,harmonico7));
		seisHarmonico.addActionListener(new acoesInterfaceDistorcaoHarmonica(harmonico2,harmonico3,harmonico4,harmonico5,harmonico6,harmonico7));
		
	
     
  
        coluna1.add(entrada);
        coluna1.add(saida);
		coluna2.add(harmonico1);
		coluna2.add(harmonico2);
		coluna2.add(harmonico3);
		coluna2.add(harmonico4);
		coluna2.add(harmonico5);
		coluna2.add(harmonico6);
		coluna2.add(harmonico7);
		
		
		telaPrincipal.add(coluna1);
		telaPrincipal.add(coluna2);
		
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
