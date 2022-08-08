package aula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		//listaArray();
		//listaLinkada();
		//listaHash();
		listaHashSet();
	}
	
	static void listaHashSet() {
		HashSet<Integer> numeros = new HashSet<>();
		numeros.add(20);
		numeros.add(20);
		numeros.add(30);
		numeros.add(10);
		displayHashSet(numeros);
		
	}
	
	static void displayHashSet(HashSet<Integer> lista) {
		for(Integer x : lista) {
			System.out.println(x);
		}
		
	}
	static void listaHash() {
		HashMap<String, Double> boletim = new HashMap<String, Double>();
		boletim.put("Joyce", 10.0);
		boletim.put("Jussara", 0.5);
		boletim.put("Mirela", 8.0);
		
	}
	
	static void listaLinkada(){
		LinkedList<String> nomes = new LinkedList<>();
		nomes.add("Joyce");
		nomes.add("Mikaella");
		if(!nomes.contains("Mikaella"))
			nomes.add("Mikaella");
		nomes.add("Jaynne");
		nomes.addFirst("Jana");
		displayDadosLista(nomes);
		nomes.set(1, "Michele");
		displayDadosLista(nomes);
		nomes.set(2, "Mirelly");
		displayDadosLista(nomes);	
	}
	
	static void listaArray(){
		ArrayList<String> carros = new ArrayList<>();
		carros.add("Fusca");
		carros.add("Kombi");	
		displayDadosLista(carros);
		carros.set(1, "Kicks");
		displayDadosLista(carros);
		carros.remove(1);
		displayDadosLista(carros);
		
		List<String> frutas = new ArrayList<>();
		frutas.add("Nanabna");
		frutas.add("Uvinha sem caroço");
		frutas.add("Manga");
		displayDadosLista(frutas);
	}
	
	static void displayDadosLista(List<String> x) {
		for (int i = 0; i < x.size() ; i++) {
			System.out.println(x.get(i));
		}
		System.out.println("================================");
	}
}
