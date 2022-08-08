package dao;

import java.util.ArrayList;
import java.util.List;

public class DaoCarro {

	private List<Carro> carros = new ArrayList<>();
	
	public void inserir (Carro carro) {
		carros.add(carro);
	}
	
	public List<Carro> pegaTodos () {
		return carros;		
	}
}
