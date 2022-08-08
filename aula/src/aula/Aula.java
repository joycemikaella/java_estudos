package aula;

public class Aula {
	//String nome = "MARIA";
//Tipos primitivos
		int idade;
		float peso;
		double altura;
		//boolean ativo;
		//char sexo;
		
//Tipos compostos - classes wrappers
		//Integer idade1;
		//Float peso1;
		//Double altura1;
		//Boolean ativo1;
		
		public static void main (String[] args) {
			//System.out.println("Hello World");
			int n1 = 10;
			int n2 = 20;
			if(n1>n2) {
				System.out.println(n1+"é maior que"+ n2);
			} else if (n1==n2) {
				System.out.printf("%d é igual a %d\n",n1, n2);
				
			}else {
				System.out.printf("%d é menor que %d\n",n1, n2);
			}
			
			System.out.println("fim do programa");
			
			
			int idade = 18;
			String nome = "Maria";
			float peso = 98.5f;
			double altura = 1.66;

			System.out.printf("%s você tem %d anos de idade",nome, idade);
			System.out.printf("\nSeu peso é %.2f e sua altura %.2f",peso, altura);
			
		}
		
		public void test() {
			idade = Integer.parseInt("10");
			peso = 98.5f;
			altura = 1.75;
		}
		
		public void test2() {
			String resp = "A resposta é: ";
			int intResp = 18;
			System.out.printf("%t %r", resp, intResp);
			
		}
	}
