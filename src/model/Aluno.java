package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import datastructures.ListaEncadeada;

public class Aluno {
	
	private String nome;
	String email;
	int idade;
	String cidade;
	
	private static final String VIRGULA = ",";
	
	public Aluno(){
		
	}

	public Aluno(String name, String email, int idade, String cidade) {
		// TODO Auto-generated constructor stub
		
		//sc = nome.n
				
		
		this.setNome(name);
		this.email = email;
		this.idade = idade;
		this.cidade = cidade;
			
	}
	
	//Uma classe que 
	
	
	public ListaEncadeada<Aluno> pegaArquivo(FileReader arquivo) throws IOException{
		
		//tem que transformar uma linha desse arquivo em um Aluno e depois colocar esse aluno
		//na lista
		
		//Criando o buffer para poder ler o arquivo
		BufferedReader br = new BufferedReader(arquivo);
		//Scanner sc = br;
		//Criando a lista
		ListaEncadeada<Aluno> lista = new ListaEncadeada<>();
		
		while(br.ready()){
			//Scanner sc = null;
			String linha = br.readLine();
			Aluno quatro = new Aluno();
			
			lista.append(quatro);   
			 
			   //System.out.println(linha);
			}
			br.close();
		
		
			
		//Aluno dois = new Aluno();
		//Aluno tres = new Aluno();
		
			
		
		
		//na lista tem que ser passado um Aluno
		//lista.append(dois);
		//lista.append(tres);
		
		//tem que retornar uma lista
		return lista;
	}
	
	@Override
	public String toString(){
		return this.nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	


}
