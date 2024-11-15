package p_o_o;

import java.util.Scanner;

public class TesteGato {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	Gato tadeu = new Gato();
	//System.out.println("Digite o nome do seu gato: ");
	//tadeu.nome = scan.nextLine();
	tadeu.corDoPelo = "Cinza";
	tadeu.peso = 4.5;
	tadeu.miar();
	tadeu.miar();
	tadeu.miar();
	tadeu.miar();
	tadeu.miar();
	
}
}
