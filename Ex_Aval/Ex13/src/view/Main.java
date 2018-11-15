package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	private static Scanner input;

	public static void main(String[] args) {
		int nro;
		int flag = 0;
		
		do {
			try {
				System.out.print("Digite um inteiro: ");
				
				nro = ColetaInteiro();
				
				System.out.println("Você digitou: " +  nro);
				flag = 1;
				
			}catch(InputMismatchException imEx) {
				System.out.println("Este não é um inteiro numérico");
			}catch (Exception ex){
				System.out.println("Erro desconhecido: " + ex);
			}
		}while(flag == 0);
	}
	
	public static int ColetaInteiro() {
		input = new Scanner(System.in);
		int nro;
		
		nro = input.nextInt();
		
		return nro;
	}
}
