public class Main{
	public static void main(String[] args){
		USMoney valor1, valor2, valor3;
		
		valor1 = new USMoney(19, 75);
        valor2 = new USMoney(5, 90);
        valor3 = valor1.plus(valor2);
		impressora(valor1, valor2, valor3);
		
		valor1 = new USMoney(0, 0);
        valor2 = new USMoney(5, 99);
        valor3 = valor1.plus(valor2);
		impressora(valor1, valor2, valor3);
		
		valor1 = new USMoney(-19, -75);
        valor2 = new USMoney(5, 90);
        valor3 = valor1.plus(valor2);
		impressora(valor1, valor2, valor3);
		
	}
	
	public static void impressora(USMoney valor1, USMoney valor2, USMoney valor3){

        System.out.printf("\nPrimeiro valor: %d,%d", valor1.getDollars(), valor1.getCents());
		System.out.printf("\nSegundo valor: %d,%d", valor2.getDollars(), valor2.getCents());
		System.out.printf("\nValor da soma: %d,%d\n\n", valor3.getDollars(), valor3.getCents());

    }
}