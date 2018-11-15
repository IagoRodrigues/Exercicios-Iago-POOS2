package view;

public class Main {

	public static void main(String[] args) {
		System.out.println("inicio do main");
		metodoA();
		System.out.println("fim do main");
	}

	private static void metodoA(){
		System.out.println("inicio METODO A");
		try {
			metodoB();
		} catch (Exception e) {
			System.out.println("Tratando a exception maluca");
		}
		System.out.println("fim METODO A");
	}

	private static void metodoB() throws Exception {
		System.out.println("inicio METODO B");
		metodoC();
		System.out.println("fim METODO B");
	}

	private static void metodoC() throws Exception {
		System.out.println("inicio METODO C");
		metodoD();
		System.out.println("fim METODO C");
	}

	private static void metodoD() throws Exception{
		System.out.println("inicio METODO D");
		
		throw new Exception("exception maluca");
	}

}
