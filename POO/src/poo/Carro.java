package poo;

public class Carro {
	private String placa;
	private String marca;
	private String modelo;
	private int anoFabricacao;
		

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if(placa.length()!=8)
			System.out.println("Placa inválida");
			else
				this.placa = placa ;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	
	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	public void acelerar() {
		System.out.printf("Acelerando o %s", this.modelo +"\n");
		
	}
	public void ligar() {
		System.out.printf("Ligando o %s", this.modelo +" vrum vrum vrum \n");
		
	}
	public void frear() {
		System.out.printf("Freando o %s", this.modelo +" tchoammmm... \n");
		
	}
	public Carro() {
	}


	public Carro(String placa) {
		this.placa = placa;
	}


	public Carro(String placa, String marca, String modelo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
}
