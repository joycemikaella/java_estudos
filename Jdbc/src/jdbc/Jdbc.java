package jdbc;

import jdbc.dao.DaoContato;
import jdbc.entidades.Contato;
//import jdbc.utilidades.Conexao;

public class Jdbc {
	
	public static void main(String[] args) {
		
		/*if(Conexao.conectar() !=null) {
			System.out.println("Conectado");
		}
		else {
			System.out.println("Erro ao conectar");
		}*/

		//Contato c1 = new Contato("Antônia","988839933","tonha@gmail.com");
		DaoContato dc = new DaoContato();
		
	/*	if(dc.salvar(c1)) {
			System.out.println("Contato cadastrado com sucesso");
		}
		
		Contato c2 = new Contato("Pedro","988779933","pedro@gmail.com");

		if(dc.salvar(c2)) {
			System.out.println("Contato cadastrado com sucesso");
		}
		
		Contato c3 = new Contato("Jamilly","9867r933","jam@gmail.com");
				if(dc.salvar(c3)) {
					System.out.println("Contato cadastrado com sucesso");
				}
		Contato c4 = new Contato("Shrek","405887689","shrek@gmail.com");

				if(dc.salvar(c4)) {
					System.out.println("Contato cadastrado com sucesso");
				}
		*/
		//consultar todos
		//System.out.println(dc.consultar());
		
		//Consultar por um ID
				//System.out.println(dc.consultar(3));
				
				//alterar um contato por ID
				/*Contato contato = dc.consultar(3);
				System.out.println(contato);
				contato.setNome("Henrique");
				contato.setFone("65994506568");
				contato.setEmail("ph@gmail.com");
				if(dc.alterar(contato)) {
					System.out.println("Contato alterado com sucesso");
					System.out.println(contato);
					
				}*/
				
				//excluir um contato por ID
				/*Contato contato = dc.consultar(5);
				System.out.println(contato);
				dc.excluir(5);
				contato = dc.consultar(5);
				System.out.println(contato);*/
		
		
		
				
						
	}

}
