package heranca;

public class Animal {
	private String raca;
	private String especie;
	
	
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public Animal() {
		
	}
	public Animal(String raca, String especie) {
			this.raca = raca;
			this.especie = especie;
	}
	
	
	public void display() {
		System.out.printf("\nRaça: %s \nEspécie : %s", this.raca, this.especie);
	}
}
