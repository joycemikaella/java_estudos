package heranca;

public class Mamifero extends Animal {
	private int mamas;
	
	
	public int getMamas() {
		return mamas;
	}
	public void setMamas(int mamas) {
		this.mamas = mamas;
	}
	
	public Mamifero() {
		
	}
	public Mamifero(String raca, String especie, int mamas) {
			super(raca,especie);
			this.mamas = mamas;
	}
	
	
	public void display() {
		super.display();
		System.out.printf("\nMamas : %d", this.mamas);
	}
}
