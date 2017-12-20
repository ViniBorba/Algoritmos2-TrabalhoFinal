package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Scanner;

import datastructures.ListaEncadeada;

public class Aluno {
	//Atributos dos alunos
	String matricula;
	String sexo;
	String pais;
	
	private String nome;
	String email;
	String idade;//tem que mudar para inteiro
	String cidade;
	
	
	//Construtor Vazio
	public Aluno(){
		
	}
	
	//Construtor principal com o split da String para seprar com ,
	public Aluno(String linhaDoArquivo ){
		String[] separa = linhaDoArquivo.split(",");
		this.matricula = separa[0];
		this.nome = separa[1];
		this.email = separa[2];
		this.idade = separa[3];
		this.sexo = separa[4];
		this.pais = separa[5];
		this.cidade = separa [6];
	}

	//Construtor original
	public Aluno(String name, String email, String idade, String cidade) {
		// TODO Auto-generated constructor stub
		
		this.setNome(name);
		this.email = email;
		this.idade = idade;
		this.cidade = cidade;
			
	}
	
	public ListaEncadeada<Aluno> pegaArquivo(FileReader arquivo) throws IOException{
		
		//tem que transformar uma linha desse arquivo em um Aluno e depois colocar esse aluno
		//na lista
		
		//Criando o buffer para poder ler o arquivo
		BufferedReader br = new BufferedReader(arquivo);

		//Criando a lista
		ListaEncadeada<Aluno> lista = new ListaEncadeada<>();
		
		//while para colocar cada linha em um elemento da lista
		while(br.ready()){
			String linha = br.readLine();
			
			Aluno quatro = new Aluno(linha);
			
			lista.append(quatro);   

			}
			br.close();

		return lista;
	}
	
	@Override
	public String toString(){
		return "NOME: "+ this.nome +" MATRICULA: "+ this.matricula +" EMAIL: "+this.email + " IDADE: " + this.idade + " SEXO: " + this.sexo + " PAIS: " + this.pais + " CIDADE: " + this.cidade;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
