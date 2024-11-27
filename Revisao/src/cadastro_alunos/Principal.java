package cadastro_alunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
public static void main(String[] args) {
	/*
	 Em uma turma, os alunos são registrados em uma lista. 
     Escreva um programa que permita cadastrar 
     o nome dos alunos e listar todos os nomes ao final, 
     mostrando quantos alunos foram cadastrados.
	*/
	// List<String> nomesDosAlunos = new ArrayList<>(); //sem POO
	Scanner scan = new Scanner(System.in);
	List<Aluno> alunos = new ArrayList<>(); // com POO
	
	while(true) {
		//cadastro de um aluno
		System.out.println("Digite o nome do aluno: ");
		String nome = scan.nextLine(); // receber o nome do aluno
		Aluno aluno = new Aluno(nome); // preenche o nome através do construtor
		alunos.add(aluno);
		//fim do cadastro de um aluno
		
		System.out.println("Deseja continuar? S/N");
		String opcao = scan.nextLine().toUpperCase();
		
		if(opcao.charAt(0) != 'S') {
			break;
		}
		
	}
	//o for each vai percorrer os itens da lista
	//"para cada aluno na minha lista de alunos"
	for(Aluno aluno : alunos) {
		System.out.print(alunos.indexOf(aluno) + 1 + ". ");
		System.out.println(aluno.nome);
	}
	//1. tadeu
	//2. genesia
	System.out.println("Quantidade de Alunos: " + alunos.size());
	
	System.out.println("Digite o nome do aluno que você quer remover");
	String nomeDoAluno = scan.nextLine();
//	Aluno alunoASerRemovido = new Aluno();
	
//		for(Aluno aluno : alunos) {
//			if(aluno.nome.equalsIgnoreCase(nomeDoAluno)) {
//				alunoASerRemovido = aluno;
//				break;
//			}
//		}
		// lambda -> funções anônimas
		alunos.removeIf(aluno -> aluno.nome.equalsIgnoreCase(nomeDoAluno));
			
		for(Aluno aluno : alunos) {
			System.out.print(alunos.indexOf(aluno) + 1 + ". ");
			System.out.println(aluno.nome);
		}
	
	
//	Aluno aluno = new Aluno("Genésio");
//	System.out.println(aluno.nome);
	
	// adicionar na lista -> .add(objeto)
	// remover da lista -> .remove(objeto)
}
}
