package poo;

import java.text.DecimalFormat;

public class Pessoa {

	private String nome;
	private String fone;
	private String email;
	private double peso;
	private double altura;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		if(fone.length()!=12)
			System.out.println("Formato inválido");
			else
				this.fone = fone;
		
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if(email.contains("@"))
			this.email = email;
		else
			System.out.println("Formato de email incorreto");
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", fone=" + fone + ", email=" + email + ", peso=" + peso + ", altura=" + altura
				+ "]";
	}

	public void calculaIMC() {
		DecimalFormat df = new DecimalFormat("0.00");
		double imc = (this.peso)/(this.altura * this.altura);
		System.out.println(df.format(imc));
		
	}

	public Pessoa() {
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String fone, String email, Double peso, Double altura) {
		super();
		this.nome = nome;
		this.fone = fone;
		this.email = email;
		this.peso = peso;
		this.altura = altura;
	}


	
	
}
