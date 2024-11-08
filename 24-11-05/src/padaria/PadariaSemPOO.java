package padaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PadariaSemPOO {
	public static void main(String[] args) {
		/*
		 * O Sr. Tadeu é o feliz proprietário da padaria "A Massa e a Baguete" e deseja
		 * modernizar seu negócio. Ele gostaria de permitir que seus clientes se
		 * cadastrassem na padaria, fornecendo suas informações básicas. Para isso, os
		 * clientes devem inserir um nome e um CPF válido para efetuar o cadastro. O Sr.
		 * Tadeu decidiu contratar um programador para desenvolver essa funcionalidade.
		 */
		Scanner scan = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		List<String> cpfs = new ArrayList<>();
		List<List<String>> receitas = new ArrayList<>();
		List<Integer> cupons = new ArrayList<>();

// adicionar clientes para facilitar testes
		nomes.add("Tadeu Silva");
		cpfs.add("12345678901");
		receitas.add(new ArrayList<>());
		cupons.add(5);

		nomes.add("Jessica Oliveira");
		cpfs.add("23456789012");
		receitas.add(new ArrayList<>());
		cupons.add(8);

		nomes.add("Gervásio Souza");
		cpfs.add("34567890123");
		receitas.add(new ArrayList<>());
		cupons.add(2);

		nomes.add("Epaminondas Pereira");
		cpfs.add("45678901234");
		receitas.add(new ArrayList<>());
		cupons.add(12);

		nomes.add("Osório Santos");
		cpfs.add("56789012345");
		receitas.add(new ArrayList<>());
		cupons.add(0);
// fim adicionar clientes 

		System.out.println("Bem-vindo à padaria 'A Massa e a Baguete'!");

		boolean executando = true;
		while (executando) {
			System.out.println("\nEscolha uma opção:");
			System.out.println("1 - Cadastrar cliente");
			System.out.println("2 - Adicionar receita");
			System.out.println("3 - Registrar valor de compras para gerar cupons");
			System.out.println("4 - Trocar cupons por receita preparada");
			System.out.println("5 - Encerrar programa");
			System.out.print("Digite sua escolha: ");
			int escolha = scan.nextInt();
			scan.nextLine(); // Limpar buffer do scanner

			switch (escolha) {
			case 1 -> {
				// Cadastro de clientes
				System.out.println("Digite o nome do cliente:");
				String nome = scan.nextLine();
				nomes.add(nome);

				System.out.println("Digite o CPF:");
				String cpf = scan.nextLine();

				while (true) {
					if (!cpf.matches("\\d{11}")) {
						System.out.println("CPF inválido. Deve conter exatamente 11 números.");
						System.out.println("Tente novamente:");
						cpf = scan.nextLine();
					} else if (cpfs.contains(cpf)) {
						System.out.println("CPF já cadastrado. Por favor, insira um CPF diferente.");
						cpf = scan.nextLine();
					} else {
						cpfs.add(cpf);
						receitas.add(new ArrayList<>());
						cupons.add(0);
						System.out.println("Cadastro realizado com sucesso!");
						break;
					}
				}

			}

			case 2 -> {
				// Adição de receitas
				System.out.println("Digite o CPF do cliente para associar a receita:");
				String cpfReceita = scan.nextLine();

				while (!cpfs.contains(cpfReceita)) {
					System.out.println("CPF não encontrado. Tente novamente:");
					cpfReceita = scan.nextLine();
				}

				int indiceCliente = cpfs.indexOf(cpfReceita);
				System.out.println("Digite a receita para adicionar:");
				String receita = scan.nextLine();
				receitas.get(indiceCliente).add(receita);
				System.out.println("Receita adicionada com sucesso!");
				break;

			}
			case 3 -> {
				// Programa de cupons
				System.out.println("Digite o CPF do cliente:");
				String cpfCompras = scan.nextLine();

				while (!cpfs.contains(cpfCompras)) {
					System.out.println("CPF não encontrado. Tente novamente:");
					cpfCompras = scan.nextLine();
				}

				System.out.println("Digite o valor da compra (R$):");
				double valorCompra = scan.nextDouble();
				scan.nextLine(); // Limpar buffer do scanner

				int indiceClienteCompras = cpfs.indexOf(cpfCompras);
				int cuponsGanhos = (int) (valorCompra / 20);
				cupons.set(indiceClienteCompras, cupons.get(indiceClienteCompras) + cuponsGanhos);
				System.out.println("Cupons atualizados. Total de cupons: " + cupons.get(indiceClienteCompras));
				break;
			}
			case 4 -> {
				// Troca de cupons por receitas preparadas
				System.out.println("Digite o CPF do cliente:");
				String cpfTroca = scan.nextLine();

				while (!cpfs.contains(cpfTroca)) {
					System.out.println("CPF não encontrado. Tente novamente:");
					cpfTroca = scan.nextLine();
				}

				int indiceClienteTroca = cpfs.indexOf(cpfTroca);
				if (cupons.get(indiceClienteTroca) >= 10) {
					if (!receitas.get(indiceClienteTroca).isEmpty()) {
						System.out.println("Receita preparada: " + receitas.get(indiceClienteTroca).get(0));
						cupons.set(indiceClienteTroca, cupons.get(indiceClienteTroca) - 10);
						System.out.println(
								"Troca realizada com sucesso! Cupons restantes: " + cupons.get(indiceClienteTroca));
					} else {
						System.out.println("Nenhuma receita associada ao cliente.");
					}
				} else {
					System.out.println(
							"Cupons insuficientes. O cliente possui " + cupons.get(indiceClienteTroca) + " cupons.");
				}
			}
			case 5 -> {

				// Encerrar programa
				executando = false;
				System.out.println("Encerrando o programa.");
			}

			default -> {
				System.out.println("Opção inválida. Tente novamente.");
			}

			}

			/*
			 * Após o sucesso do cadastro, o Sr. Tadeu gostaria de expandir as
			 * funcionalidades do sistema. Ele deseja permitir que os clientes possam
			 * adicionar receitas à sua conta. Para garantir que as receitas sejam
			 * associadas corretamente aos clientes, o CPF deve ser validado a cada vez que
			 * um cliente tentar adicionar uma nova receita.
			 */

			/*
			 * Além disso, o Sr. Tadeu quer implementar um programa de fidelidade para seus
			 * clientes. A cada R$20 em compras, os clientes ganharão um cupom que será
			 * armazenado em seu cadastro. O programador terá que implementar a lógica para
			 * contabilizar os cupons.
			 */

			/*
			 * Por último, o Sr. Tadeu decidiu que, ao acumularem 10 cupons, os clientes
			 * poderão solicitar que a padaria cozinhe a receita que eles adicionaram
			 * anteriormente. O programador deverá criar uma nova lógica para verificar se o
			 * cliente possui cupons suficientes para essa troca.
			 */
		}
	}

}
