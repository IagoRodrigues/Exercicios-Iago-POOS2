package Test;

import org.junit.Assert;
import org.junit.Test;

import Model.USMoney;

public class USMoneyTest {
	USMoney valor1, valor2, valor3;
	
	@Test	
	public void testAsset() {
		
		/*
		 * Testando o Assert:
		 * assertEquals(double esperado, double atual, tolerância)
		 * double esperado é o valor esperado pelo programador
		 * double atual é o valor calculado pelas rotinas do programa
		 * tolerância é quantas casas decimais de tolência para menos ou para mais o valor pode ter
		 */
		Assert.assertEquals(10, 5+5, 0);
	}
	
	@Test
	public void testValores() {
		/*
		 * Esse novo método deve testar margens de valores que nosso programa usa
		 * Casos:
		 * ->em caso de dois valores nulos, deve retornar nulo
		 * ->em caso dedois valores negativos, deve retonar nulo
		 * ->em caso de um valor negativo deve retornar o outro valor
		 * ->em caso de dois valores positivos deve retornar a soma destes valores com casas decimais corretas
		 */	
		
		 //->Em caso de dois valores nulos, deve retornar nulo
		valor1 = new USMoney(0, 0);
		valor2 = new USMoney(0, 0);
		valor3 = valor1.plus(valor2);
		USMoney teste = new USMoney(0, 0);
		Assert.assertEquals("Valores nulos", valor3.toString(), teste.toString());
		
		 //->Em caso dedois valores negativos, deve retonar nulo
		valor1 = new USMoney(-9, -16);
		valor2 = new USMoney(-5, -99);
		valor3 = valor1.plus(valor2);
		teste = new USMoney(0, 0);
		Assert.assertEquals("Dois valores negativos", valor3.toString(), teste.toString());
		
		 //->Em caso de um valor negativo deve retornar o outro valor
		valor1 = new USMoney(-19, -75);
		valor2 = new USMoney(5, 99);
		valor3 = valor1.plus(valor2);
		teste = new USMoney(5, 99);
		Assert.assertEquals("Um valor negativo", valor3.toString(), teste.toString());
		
		 //->Em caso de dois valores positivos deve retornar a soma destes valores com casas decimais corretas
		valor1 = new USMoney(19, 75);
        valor2 = new USMoney(5, 90);
		valor3 = valor1.plus(valor2);
		teste = new USMoney(25, 65);
		Assert.assertEquals("Valores positivos", valor3.toString(), teste.toString());

	}
}
