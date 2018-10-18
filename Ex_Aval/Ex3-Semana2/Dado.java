import java.util.Random;

public class Dado{
	private int ladoDado;
	
	public int getLado(){
		Random gerador = new Random();
		
		ladoDado = gerador.nextInt(6) + 1;
		
		return ladoDado;
	}
}