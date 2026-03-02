package view;

import javax.swing.JOptionPane;
import controller.Operação;

public class Main {
	
	public static void main(String[] args) {
	int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do primeiro numero"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor do segundo numero"));
	
	
	Operação mult = new Operação();
	
	int resultado = mult.multiplicacao(num1, num2);
	
	JOptionPane.showMessageDialog(null, "o resultado de" + num1 + " x " + num2 + " é de: " + resultado);
	
	
	}
}
