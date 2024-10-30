package listas;

import java.util.Random;

public class ArrayLists {
public static void main(String[] args) {
	Random r = new Random();

	int valor = r.nextInt(10);
	
	while(valor != 5) {
		System.out.println(valor);
		valor = r.nextInt(10);
	}
	System.out.println(valor);
	
	
}
}
