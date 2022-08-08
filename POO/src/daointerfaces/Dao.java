package daointerfaces;

import java.util.List;

public class Dao {

	public static void main(String[] args) {
		
		//usaContatos();
		usaCarros();		
	}
	
	static void usaCarros() {
		Carro c1 = new Carro ("2707-jmma", "Volks","Fusca");
		DaoCarro dc = new DaoCarro();
		dc.salvar(c1);		
		listarCarros(dc.consultar());
		
	}
 	static void usaContatos(){
		Contato ct1 = new Contato ("Joyce", "joyce@mail.com");
		Contato ct2 = new Contato ("Mikaella", "mikaella@mail.com");
		
		DaoContato dc = new DaoContato();
		//dc.salvar(ct1);
		//dc.salvar(ct2);
		
		//listar(dc.consultarTodos());
		
	}
 	
 	static void listarCarros(List<Carro> lista) {
		for (Carro c: lista) {
			System.out.printf("\nplaca : %s \nmarca: %s \nmodelo: %s", c.getPlaca(), c.getMarca(), c.getModelo());
		}
	}
	static void listar(List<Contato> lista) {
		for (Contato c: lista) {
			System.out.printf("\nnome : %s  email: %s", c.getNome(), c.getEmail());
		}
	}
}
