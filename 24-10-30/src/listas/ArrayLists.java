package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayLists {
public static void main(String[] args) {
	Random r = new Random();

	// 1) Crie uma Lista com dez números aleatórios.
	
	List<Integer> lista = new ArrayList<>();
	int valor = r.nextInt(20) + 1;
	
	for(int i = 0; i < 10; i++) {
		valor = r.nextInt(20) + 1;
		lista.add(valor);
	}
	
	System.out.println(lista);
	// 2) Adicione o número 11 à Lista criada no exercício anterior.
	lista.add(11);
	System.out.println(lista);
	
	// 3) Remova o número na 5ª posição da Lista.
	lista.remove(4);
	System.out.println(lista);
	
	/*4) Concatene a Lista atual com uma nova Lista 
		contendo os números de 12 a 15.*/

	List<Integer> novaLista = new ArrayList<>();
	
	for(int i = 12; i <= 15; i++) {
		novaLista.add(i);
	}
	
	lista.addAll(novaLista);
	
	// 5) Encontre o tamanho da Lista resultante.
	System.out.println("Tamanho da lista: " + lista.size());
	
	//6) Verifique se o número 8 está presente na Lista.
	
	String contem8 = lista.contains(8) ? "sim" : "não";
	System.out.println("A lista contém 8? " + contem8);
	
	// 7) Inverta a ordem dos elementos na Lista.
	
	Collections.reverse(lista); // antes do java 21
	// lista.reversed(); // depois do java 21
	System.out.println(lista);
	
	// 8) Remova todos os números pares da Lista.

	lista.removeIf(n -> n % 2 == 0); // usando lambda
	
	// 9) Substitua o valor da 3ª posição por 30.
	
	lista.set(2, 30);
	
	// 10) Ordene a Lista de forma crescente.
	
	Collections.sort(lista);
	System.out.println(lista);
	Collections.reverse(lista);
	System.out.println(lista);
	
//	List<Integer> listaImpares = new ArrayList<>();
//
//	for(Integer numero : lista) {
//		if(numero % 2 != 0) {
//			listaImpares.add(numero);
//		}
//	}
//	lista.clear();
//	lista.addAll(listaImpares);
	
//	
//for(int i = 0; i < lista.size(); i++) {
//		
//		if(lista.get(i) % 2 != 0) {
//			listaImpares.add(lista.get(i));
//		}
//	
//	}
//	lista.clear();
//	lista.addAll(listaImpares);
	
	
//	String mes = "janeiro";
//	int qtdDias = 
//		mes.equals("janeiro") ? 31 :
//		mes.equals("fevereiro") ? 28 : 
//		mes.equals("março") ? 31 :
//		mes.equals("abril") ? 30 :
//		mes.equals("maio") ? 31 :
//		mes.equals("junho") ? 30 :
//		mes.equals("julho") ? 31 :
//		mes.equals("agosto") ? 31 :
//		mes.equals("setembro") ? 30 :
//		mes.equals("outubro") ? 31 :
//		mes.equals("novembro") ? 30 :
//		mes.equals("dezembro") ? 31 : 0;	
	
}
}
