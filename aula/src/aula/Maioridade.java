package aula;

import java.util.Scanner;

public class Maioridade {
	public static void main (String[] args) {
		Scanner tela = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		String nome = tela.nextLine();
		
		System.out.println("Informe sua idade:");
		int idade = tela.nextInt();
		
		if (idade >= 18) {
			System.out.printf("%s, você é maior de idade", nome);
		}else {
			System.out.printf("%s, você é menor de idade", nome);
		}
		
		tela.close();
	}
}
