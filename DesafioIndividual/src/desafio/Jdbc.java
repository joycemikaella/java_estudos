package desafio;

import desafio.dao.DaoCasaNova;
import desafio.entidades.CasaNova;


public class Jdbc {
	
	public static void main(String[] args) {
	
		//Criacão de ITENS
		DaoCasaNova dc = new DaoCasaNova();
		
		/*CasaNova c1 = new CasaNova("Jogo de panelas","miudezas","COZINHA");
		
				if(dc.salvar(c1)) {
				System.out.println("Item adicionado com sucesso");
				}
		CasaNova c2 = new CasaNova("Escorredor de louça","miudezas","LIMPEZA");

				if(dc.salvar(c2)) {
					System.out.println("Item adicionado com sucesso");
				}
				
		CasaNova c3 = new CasaNova("Edredom","miudezas","ENXOVAL - CAMA");
				if(dc.salvar(c3)) {
					System.out.println("Item adicionado com sucesso");
				}
		CasaNova c4 = new CasaNova("Micro-ondas","mobília","ELETRODOMÉSTICOS");

				if(dc.salvar(c4)) {
					System.out.println("Item adicionado com sucesso");
				}
				
		CasaNova c5 = new CasaNova("Televisão","mobília","SALA");

				if(dc.salvar(c5)) {
					System.out.println("Item adicionado com sucesso");
				}
				
		CasaNova c6 = new CasaNova("Escada","mobília","UTILIDADES");

				if(dc.salvar(c6)) {
					System.out.println("Item adicionado com sucesso");
				}*/
		
		//Consulta de todos os ITENS
			//System.out.println(dc.consultar());
		
		//Consulta de um ID - Consultado a Televisão
			//System.out.println(dc.consultar(5));
				
		//Alteração de um item por ID - Alterado a Televisão para Sofá
				/*CasaNova Item = dc.consultar(5);
				System.out.println(Item);
				Item.setDescricao("Sofá");
				Item.setDimensao("MOBÍLIA");
				if(dc.alterar(Item)) {
					System.out.println("CasaNova alterado com sucesso");
					System.out.println(Item);
					
				}*/
				
		//Excluir um item por ID - Excluído o Sofá
				/*CasaNova Item = dc.consultar(5);
				System.out.println(Item);
				dc.excluir(5);
				Item = dc.consultar(5);
				System.out.println(Item);
					
		
		//ADIÇÃO DE MAIS ITENS
	CasaNova c7 = new CasaNova("Jogo de ferramentas","MOBÍLIA","UTILIDADES");

		if(dc.salvar(c7)) {
			System.out.println("Item adicionado com sucesso");
		}
		*/
	CasaNova c8 = new CasaNova("Air Fryer","MOBÍLIA","ELETRODOMÉSTICOS");

		if(dc.salvar(c8)) {
			System.out.println("Item adicionado com sucesso");
		}
						
	}

}
