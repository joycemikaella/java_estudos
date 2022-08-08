package heranca;

public class Heranca {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		//a1.especie = "Felino";
		//a1.raca = "Siamês";
		//a1.display();
		
		Animal a2 = new Animal("Bovina","Nelore");
		//a2.display();
		
		
		Mamifero m1 = new Mamifero();
			m1.setMamas(14);
			m1.setEspecie("Suíno");
			m1.setRaca("Piatan");
			m1.display();
		
		Mamifero m2 = new Mamifero("Equino","Crioulo", 2);
			m2.display();
	}

}
