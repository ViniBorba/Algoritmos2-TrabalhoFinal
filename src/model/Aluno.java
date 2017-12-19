package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import datastructures.ListaEncadeada;

public class Aluno {
	
	String nome;
	String email;
	int idade;
	String cidade;
	
	

	//public Aluno(String name, String email, int idade, String cidade) {
		// TODO Auto-generated constructor stub
		
		
		
	//}
	
	//Uma classe que 
	
	
	public ListaEncadeada<Aluno> pegaArquivo(FileReader arquivo) throws IOException{
		
		//tem que transformar uma linha desse arquivo em um Aluno e depois colocar esse aluno
		//na lista
		
		BufferedReader br = new BufferedReader(arquivo);
		
		while(br.ready()){
			   String linha = br.readLine();
			   System.out.println(linha);
			}
			br.close();
		
		
			
		Aluno dois = new Aluno();
		Aluno tres = new Aluno();
		
			
		ListaEncadeada<Aluno> lista = new ListaEncadeada<>();
		
		//na lista tem que ser passado um Aluno
		lista.append(dois);
		lista.append(tres);
		
		//tem que retornar uma lista
		return lista;
	}
	


}
