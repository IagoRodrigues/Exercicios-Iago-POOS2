import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        int i=0;
		int tri[] = new int[3];
		
		Scanner ler = new Scanner(System.in);
		
		for(i=0; i<5; i++){
			System.out.println("\n------------------------------------------------");
			System.out.printf("Insira o valor dos lados do triangulo %d: \n", i+1);
			tri[0] = ler.nextInt();
			tri[1] = ler.nextInt();
			tri[2] = ler.nextInt();
			
			if((tri[0] + tri[1] > tri[2]) && (tri[0] + tri[2] > tri[1]) && (tri[2] + tri[1] > tri[0])){
				System.out.printf("Eh um triangulo: ");
				
				if((tri[0] == tri[1]) && (tri[1] == tri[2])){
					System.out.printf("Equilatero!");
				}else{
					if( (tri[0] != tri[1]) && (tri[0] != tri[2]) && (tri[1] != tri[2]) ){
						System.out.printf("Escaleno!");
					}else{
						System.out.printf("Isosceles!");
					}
				}
			}else{
				System.out.printf("Nao eh triangulo");
			}
		}
    }
}
