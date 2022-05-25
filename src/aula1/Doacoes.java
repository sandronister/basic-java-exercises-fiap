package aula1;

import java.util.Scanner;

public class Doacoes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, insira o valor da Doaçao em Dolar");
		var doacao = leitor.nextFloat();
		System.out.println("Informe o valor do cambio atual");
		var cotacao = leitor.nextFloat();
		
		var total = doacao* cotacao;
		System.out.println("O total da doacao em reais é de "+ total);
		
		leitor.close();

	}

}
