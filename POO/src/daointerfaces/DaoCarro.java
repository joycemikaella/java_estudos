package daointerfaces;

import java.util.ArrayList;
import java.util.List;

public class DaoCarro implements ICrud<Carro>{
	private List<Carro> carros = new ArrayList<>();

	@Override
	public boolean salvar(Carro obj) {
		carros.add(obj);
		return false;
	}

	@Override
	public boolean alterar(Carro obj) {
		return false;
	}

	@Override
	public List<Carro> consultar() {
		return carros;
	}

	@Override
	public Carro consultar(int id) {
		return null;
	}

	@Override
	public void excluir(int id) {
		// TODO Auto-generated method stub
		
	}

	
}
