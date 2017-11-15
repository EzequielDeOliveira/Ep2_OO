package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import controller.acoesInterfaceInicial;

public class TelaInicial {
	
	public TelaInicial(JFrame framePrincipal){
		
		framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePrincipal.setLayout(new FlowLayout());
		
		JPanel painelPrincipal = new JPanel(new GridLayout(4,1));
		
		JPanel primeiroPainel = new JPanel();
		JPanel primeiroPainelColuna1 = new JPanel();
		JButton fluxoDePotenciaFundamental = new JButton("Fluxo de potência fundamental");
		fluxoDePotenciaFundamental.setActionCommand("fluxo de potencia fundamental");
		fluxoDePotenciaFundamental.addActionListener(new acoesInterfaceInicial(framePrincipal,painelPrincipal));
		
		JPanel segundoPainel = new JPanel();
		JPanel segundoPainelColuna1 = new JPanel();
		JButton distorcaoHarmonica = new JButton("Distorção Harmonica");
		
		JPanel terceiroPainel = new JPanel();
		JPanel terceiroPainelColuna1 = new JPanel();
	    JButton fluxoDePotenciaHarmonico = new JButton("Fluxo de potência harmônico");
		
		JLabel texto = new JLabel("              Simulações disponiveis :");
		JLabel texto1 = new JLabel("             -  Forma de onda da tensão");
		JLabel texto2 = new JLabel("             -  Forma de onda da corrente");
		JLabel texto3 = new JLabel("             -  Forma de onda da potêcia instantânea");
		JLabel texto4 = new JLabel("             -  Valor da potência ativa");
		JLabel texto5 = new JLabel("             -  Valor da potência reativa");
		JLabel texto6 = new JLabel("             -  Valor da potência aparente");
		JLabel texto7 = new JLabel("             -  Valor do fator de potência(fp)");
		JLabel texto8 = new JLabel("             -  Trinãngulo de potências");
		
		JLabel textoCaso2 = new JLabel("              -  Forma de onda da fundamental   ");
		JLabel texto1Caso2 = new JLabel("             -  Forma de onda da forma harmônica   ");
		JLabel texto2Caso2 = new JLabel("             -  Forma de onda distorcida resultante");
		
		
		JLabel textoCaso3 = new JLabel("              -  Forma de onda da fundamental");
		JLabel texto1Caso3 = new JLabel("             -  Forma de onda da corrente ordem harmônica h");
		JLabel texto2Caso3 = new JLabel("             -  Forma de onda da  potência harmônica instantânea");
		JLabel texto3Caso3 = new JLabel("             -  Valor da potência liquida");
		JLabel texto4Caso3 = new JLabel("             -  Valor da potência de distorção");
		JLabel texto5Caso3 = new JLabel("             -  Fator de potência verdadeiro(TPF)");
		
		
		primeiroPainel.setLayout(new GridLayout(1,2));
		primeiroPainelColuna1.setLayout(new GridLayout(8,1));
		segundoPainel.setLayout(new GridLayout(1,2));
		segundoPainelColuna1.setLayout(new GridLayout(3,1));
		terceiroPainel.setLayout(new GridLayout(1,2));
		terceiroPainelColuna1.setLayout(new GridLayout(6,1));
		
		
		primeiroPainelColuna1.add(texto1);
		primeiroPainelColuna1.add(texto2);
		primeiroPainelColuna1.add(texto3);
		primeiroPainelColuna1.add(texto4);
		primeiroPainelColuna1.add(texto5);
		primeiroPainelColuna1.add(texto6);
		primeiroPainelColuna1.add(texto7);
		primeiroPainelColuna1.add(texto8);
		segundoPainelColuna1.add(textoCaso2);
		segundoPainelColuna1.add(texto1Caso2);
		segundoPainelColuna1.add(texto2Caso2);
		terceiroPainelColuna1.add(textoCaso3);
		terceiroPainelColuna1.add(texto1Caso3);
		terceiroPainelColuna1.add(texto2Caso3);
		terceiroPainelColuna1.add(texto3Caso3);
		terceiroPainelColuna1.add(texto4Caso3);
		terceiroPainelColuna1.add(texto5Caso3);
		
		
		
		primeiroPainel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		segundoPainel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		terceiroPainel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		
		painelPrincipal.add(texto);
		primeiroPainel.add(primeiroPainelColuna1);
		primeiroPainel.add(fluxoDePotenciaFundamental);
		segundoPainel.add(segundoPainelColuna1);
		segundoPainel.add(distorcaoHarmonica);
		terceiroPainel.add(terceiroPainelColuna1);
		terceiroPainel.add(fluxoDePotenciaHarmonico);
		painelPrincipal.add(primeiroPainel);
		painelPrincipal.add(segundoPainel);
		painelPrincipal.add(terceiroPainel);

		
		framePrincipal.add(painelPrincipal);
		
		
		framePrincipal.setVisible(true);
		
	}

}
