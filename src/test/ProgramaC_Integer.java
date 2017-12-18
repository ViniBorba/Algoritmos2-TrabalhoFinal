package test;

import datastructures.ListaEncadeada;

public class ProgramaC_Integer {

	public static void main(String[] args) {
		
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		for (int i = 0; i < 5; i++) {
			lista.append(10 + i);
		}
		for (int i = 0; i < 5; i++) {
			lista.addFirst(i);
		}
		lista.printObjects();
	}

}
