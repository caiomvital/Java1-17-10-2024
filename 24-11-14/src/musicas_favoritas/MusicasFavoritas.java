package musicas_favoritas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicasFavoritas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<String> musicas = new ArrayList<>();

		while (true) {
			System.out.println("Informe o título da música: ");
			String musica = scan.nextLine();
			musicas.add(musica);

			System.out.println("Deseja adicionar uma nova música? S/N");
			String opcao = scan.nextLine().toUpperCase();

			if (opcao.charAt(0) != 'S') {
				break;
			}

		}

		for (String musica : musicas) { // for each ou para cada
			System.out.println(musica);
			if (musica.equalsIgnoreCase("A lua me traiu")) {
				System.out.println("Isso é Calypso!");
			}
		}

		// System.out.println(musicas); // mostra todo conteudo da lista
		// musicas.forEach(m -> System.out.println(m)); // com lambda
	}
}
