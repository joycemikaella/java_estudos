package abstracao;

public class Abstracao {
	public static void main(String[] args) {
		Porco a1 = new Porco ();
		a1.getRaca();
		a1.sleep();
		a1.sound();
		listar(a1);
	}
	
	static void listar(Animal x) {
		System.out.println(x.getRaca());
	}
}
