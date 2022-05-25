package aula1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, insira o primeiro valor");
		var valor1 = leitor.nextFloat();
		System.out.println("Por favor, insira o segundo valor");
		var valor2 = leitor.nextFloat();
		
		var soma = valor1+valor2;
		var sub = valor1-valor2;
		var mult = valor1*valor2;
		var divi = valor1/valor2;
		
		System.out.println("Resultado soma "+ soma);
		System.out.println("Resultado subtracao "+ sub);
		System.out.println("Resultado multiplicacao "+ mult);
		System.out.println("Resultado divisao "+ divi);
		
		leitor.close();
	}

}
