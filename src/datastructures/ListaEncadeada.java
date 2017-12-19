package datastructures;

import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

import model.Aluno;

public class ListaEncadeada<T> {
	
	//Criador de no
	private static class ListNode<T> {
		private T dado;
		private ListNode<T> proximo;
			public ListNode(T dado) {
				this.dado = dado;
				this.proximo = null;
			}
	}
	
	private ListNode<T> head; 
	private ListNode<T> tail; 
	
	//acrescentar
	public void append(T dado)
	{
		ListNode<T> novo = new ListNode<>(dado);
		if (tail != null) {
			tail.proximo = novo;
		} else {
			head = novo;
		}
		tail = novo;
	}
	
	//Adiciona antes
	public void addFirst(T dado)
	{}
	
	//procura
	public T search(T key, Comparator<T> cmp)
	{
		return null;
	}
	
	//mostra na tela
	public void printObjects()
	{
		ListNode<T> i = head;
		while (i != null) {
			System.out.println(i.dado.toString());
			i = i.proximo;
		}
	}
	
	//para ler arquivo eu acho
	public static ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo) throws IOException
	{
		//tem que retornar uma LISTA
		Aluno um = new Aluno();
		return um.pegaArquivo(arquivo);
	}
}
