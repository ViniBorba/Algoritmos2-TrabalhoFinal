package test;

import java.io.FileNotFoundException;
import java.io.FileReader;

import datastructures.ListaEncadeada;
import model.Aluno;

public class ProgramaA_Alunos {

	public static void main(String[] args) {

		FileReader arquivo = null;
		try {
			arquivo = new FileReader("data/alunos.csv");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		ListaEncadeada<Aluno> lista = ListaEncadeada.loadFromFile(arquivo, new OrdenaPorEmail());

		Iterador<Aluno> iterador = lista.iterador();
		while (iterador.hasNext()) {
			System.out.println(iterador.next().getEmail());
		}
	}

}
