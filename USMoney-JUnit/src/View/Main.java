package View;

import Model.USMoney;

public class Main{
	public static void main(String[] args){
		USMoney valor1, valor2, valor3;
		
		//Teste com os valores corretos
		valor1 = new USMoney(19, 75);
        valor2 = new USMoney(5, 90);
        valor3 = valor1.plus(valor2);
        System.out.printf(valor3.toString());
		
		//Teste com um dos valores igual a 0
		valor1 = new USMoney(0, 0);
        valor2 = new USMoney(5, 99);
        valor3 = valor1.plus(valor2);
        System.out.printf(valor3.toString());
		
		//Teste com um dos valores negativos
		valor1 = new USMoney(-19, -75);
        valor2 = new USMoney(5, 90);
        valor3 = valor1.plus(valor2);
        System.out.printf(valor3.toString());
		
	}
	
}