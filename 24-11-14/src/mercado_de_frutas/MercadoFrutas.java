package mercado_de_frutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MercadoFrutas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<String> frutas = new ArrayList<>();
		List<Integer> qtdsEmEstoque = new ArrayList<>();
		List<Double> precos = new ArrayList<>();
		List<Boolean> naPromocao = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			System.out.println("Informe o nome da fruta: ");
			String tipoFruta = scan.nextLine();
			frutas.add(tipoFruta);

			System.out.println("Informe a qtd em estoque: ");
			int qtdEstoque = scan.nextInt();
			scan.nextLine();
			qtdsEmEstoque.add(qtdEstoque);
			System.out.println("Informe o preco por kg: ");
			double precoPorKg = scan.nextDouble();
			scan.nextLine();
			precos.add(precoPorKg);
			System.out.println("Informe se a fruta esta em promocao");
			boolean estaEmPromocao = scan.nextBoolean();
			scan.nextLine();
			naPromocao.add(estaEmPromocao);
		}

		for (int i = 0; i < 4; i++) {
			System.out.println("Tipo de Fruta: " + frutas.get(i));
			System.out.println("Quantidade em Estoque: " + qtdsEmEstoque.get(i));
			System.out.println("Preço por kg: " + precos.get(i));
			System.out.println("Está em promoção? " + naPromocao.get(i));
		}

		System.out.println(frutas.get(2));
		System.out.println(qtdsEmEstoque.get(2));
		System.out.println(precos.get(2));
		System.out.println(naPromocao.get(2));

	}
}
