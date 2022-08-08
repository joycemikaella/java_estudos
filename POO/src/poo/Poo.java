package poo;

public class Poo {

	public static void main(String[] args) {
		
		UsaCarro();
		
		UsaPessoa();
	
	}
	
	static void UsaCarro() {
		
		/*--------------------CARRO--------------------*/
		/*	Carro c1 = new Carro();
			c1.placa = "abc1234";
			c1.marca = "chevrolet";
			c1.modelo = "corsa";
			System.out.println(c1.toString());
			c1.acelerar();

			Carro c2 = new Carro();
			c2.placa = "def-3456";
			c2.marca = "ford";
			c2.modelo = "del rey";
			System.out.println(c2.toString());

			Carro c3 = new Carro("xpt-5695");
			c3.marca = "ford";
			System.out.println(c3.toString());*/
			
			
			Carro c4 = new Carro();
			c4.setPlaca("9803");
			c4.setMarca("Volks");
			c4.setModelo("Fusca");
			c4.setAnoFabricacao(1995);
			System.out.println(c4.toString());
			c4.ligar();
			c4.acelerar();
			c4.frear();
		
		
	}
	
	static void UsaPessoa() {
		
		/*--------------------PESSOA--------------------*/
		/*Pessoa p1 = new Pessoa();
		p1.nome = "Joyce";
		p1.fone = "99999999";
		p1.email = "joyce@mail.com";
		p1.peso = 93.5;
		p1.altura = 1.71;
		System.out.println(p1.toString());
		p1.calculaIMC();

		Pessoa p2 = new Pessoa();
		p2.nome = "Jana";
		p2.fone = "88888888";
		p2.email = "jana@mail.com";
		p2.peso = 102.1;
		p2.altura = 1.66;
		System.out.println(p2.toString());
		p2.calculaIMC();
		
		Pessoa p3 = new Pessoa("Jaynne");
		p3.fone = "7777777";
		p3.email = "jayjay@mail.com";
		p3.peso = 48.7;
		p3.altura = 1.55;
		System.out.println(p3.toString());
		p3.calculaIMC();*/
		
		Pessoa p4 = new Pessoa();
		p4.setNome("Hugo");
		p4.setFone("666666666");
		p4.setEmail("hugo@mail.com");
		p4.setPeso(85.8);
		p4.setAltura(1.81);
		System.out.println(p4.toString());
		
	}
	
}
