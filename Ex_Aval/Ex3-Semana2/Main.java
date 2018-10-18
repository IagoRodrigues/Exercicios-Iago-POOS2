/*
Ex3) Implemente um sistema que simule um jogo de dados, o qual o jogador lança 2
dados de seis lados.
-Deve-se construir uma classe Dado que representa um dado.
-O programa principal deve lançar os dados 3 vezes e apresentar a soma dos
números dos dados a cada um dos lances.
*/

public class Main{
	public static void main(String[] args){
		
		Dado dado = new Dado();
		
		for(int i = 0; i<3; i++){
            
            int dado1 = dado.getLado();
            int dado2 = dado.getLado();
            
            System.out.println("\nDado 1: " + dado1 + "\nDado 2: " + dado2 + "\nSoma: " + (dado1+dado2) );
        }
	}
}