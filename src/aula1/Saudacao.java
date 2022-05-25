package aula1;

import java.util.Scanner;

public class Saudacao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Por favor, insira seu nome: ");
		var nome = leitor.next();
		System.out.println("o nome digitado foi "+nome);
		leitor.close();
	}

}
