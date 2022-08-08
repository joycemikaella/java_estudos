package dao;

import java.util.ArrayList;
import java.util.List;

public class DaoContato {

	private List<Contato> lista = new ArrayList<>();
	
	public List<Contato> consultarTodos(){
		//escrever rotina para consultar no banco de dados e acrescentar na lista
		return lista;
	}
	
	public boolean salvar(Contato ct) {
		lista.add(ct);
		return true;
	}
	
}
