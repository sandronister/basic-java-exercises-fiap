package aula1;

import java.util.Scanner;

public class Kilometers {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, insira o valor inicial do painel");
		var init = leitor.nextFloat();
		System.out.println("Por favor, insira o valor final do painel");
		var fim = leitor.nextFloat();
		
		System.out.println("Por favor, insira o total de litros reabastecidos");
		var litros = leitor.nextFloat();
		
		var total = (fim-init) / litros;
				
		System.out.println("A média de gasto foi de "+total);
				
		
		leitor.close();
	}
}
