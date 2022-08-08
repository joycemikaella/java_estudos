package aula;

import java.util.Scanner;

public class Desafio {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		String nome = read.nextLine();
		String resposta = "S";
		
		while (resposta.equalsIgnoreCase("S")){
			
		System.out.println("Informe sua idade:");
		int idade = read.nextInt();
		
		if (idade >= 18) {
			System.out.printf("%s, você é maior de idade", nome);
		}else {
			System.out.printf("%s, você é menor de idade", nome);
		}
		
			System.out.println("Deseja continuar. Digite S para SIM e N para NAO?");
				resposta = read.next();
				
				read.close();
		}
		System.out.println("Encerrando...");
	}
}
