package controller;

public class Operação {

	public Operação() {
		super();
	}

	public int multiplicacao(int num1, int num2) {
		if(num2 == 0 ) {
			return 0;
		}
		
		return num1 + multiplicacao(num1,num2 - 1);
	}
	
}
