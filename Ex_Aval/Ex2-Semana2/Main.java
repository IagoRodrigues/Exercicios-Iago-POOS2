/*
Ex2) Para o exemplo MinhaData implementado em aula, implemento um método que retorne a quantidade
de dias entre a data instanciada e uma data passada como argumento.
*/

public class Main {

	public static void main(String[] args){
		MinhaData hoje;
		MinhaData ontem;
		
		//Data em portugues
		hoje = new MinhaData(20, 07, 2018);
		
		System.out.println("\nHoje no Brasil.: " + hoje.dataBrazil());
		System.out.println("Hoje nos EUA.: " + hoje.dataEUA());
		
		System.out.println("------------------------------------");
		
		//Data em inglês
		hoje = new MinhaData(2018, 07, 20);
		
		System.out.println("Hoje no Brasil.: " + hoje.dataBrazil());
		System.out.println("Hoje nos EUA.: " + hoje.dataEUA());
		
		System.out.println("------------------------------------");
		
		//Diferença entre datas
		hoje = new MinhaData(26, 8, 2018);
		ontem = new MinhaData(15, 7, 2018);
		result(hoje, ontem);
		
	}
	
	public static void result(MinhaData hoje, MinhaData ontem){
		MinhaData diferenca;
		int oDia, oMes, oAno;
		
		oDia = hoje.getDia() - ontem.getDia();
		oMes = hoje.getMes() - ontem.getMes();
		oAno = hoje.getAno() - ontem.getAno();
		
		oAno = oAno * 360;	//Considerando ano comercial
		oMes = oMes * 30;	//Considerando mês comercial
		oDia = oDia + oAno + oMes;
		
		System.out.println("Diferenca entre: " + (hoje.dataBrazil()) + " e " + (ontem.dataBrazil()));
		System.out.println(oDia+ " Dias");
	}
}