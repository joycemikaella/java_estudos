package interfaces;

import java.util.List;

public interface ICrud {
	boolean salvar();
	boolean alterar(int id);
	List<String> consultar();
	String consultaUm(int id);
	void apagar(int id);
}
