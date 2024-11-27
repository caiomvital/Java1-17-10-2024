package loja_de_animais;

import java.util.Scanner;

public class LojaAnimais {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// o nome de cada animal
		String nomeAnimal;
		// a espécie de cada animal
		String especieAnimal;
		// idade em anos
		int idadeAnimal;
		// qtd ração em gramas
		double racaoEmGramas;
		
		System.out.println("Informe o nome do animal: ");
		nomeAnimal = scan.nextLine();
		System.out.println("Informe a espécie do animal: ");
		especieAnimal = scan.nextLine();
		System.out.println("Informe a idade do animal: ");
		idadeAnimal = scan.nextInt();
		System.out.println("Informe a quantidade de ração em gramas");
		racaoEmGramas = scan.nextDouble();
		
		//exibir as informações
		System.out.printf("Nome do Animal: %s\n"
				+ "Espécie do Animal: %s\n"
				+ "Idade do Animal: %d\n"
				+ "Quantidade de Ração: %.2fg", 
				nomeAnimal, especieAnimal, 
				idadeAnimal, racaoEmGramas);
		

	}
}
