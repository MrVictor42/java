package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); //Centralizar na Tela!
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		botao.addActionListener(evento ->{
			System.out.println("Evento ocorreu!!");
		});
		
		botao.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				
				
			}
		});
		
		janela.setVisible(true);
	}
}