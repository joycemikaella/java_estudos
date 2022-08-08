package abstracao;

public abstract class Animal {

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
		public abstract void sound() ;
		
		public void sleep () {
			System.out.println("Animal dormindo");
		}
		

}
