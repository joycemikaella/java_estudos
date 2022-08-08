package aula;

public class EntendendoArrays {
	public static void main(String[] args) {
		String [] carros  = {"Fusca","Kicks","Kombi","Eco Sport","Palio"};
		
		//carros[4] = "Variant";
		
		System.out.println(carros[4]);
		System.out.println("====FORMA INDEXADA====");
		
			for (int i = 0; i < carros.length; i++) {
				System.out.println(carros[i]);
			}
			System.out.println("====FORMA NÃO INDEXADA====");
			
			for (String x : carros) {
				System.out.println(x);
			}
			
			System.out.println(carros.length);
	}

}
