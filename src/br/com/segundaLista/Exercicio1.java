package br.com.segundaLista;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3, maior;
		
		System.out.print("Informe o primeiro número --> ");
		n1 = teclado.nextInt();
		
		System.out.print("Informe o segundo número --> ");
		n2 = teclado.nextInt();
		
		System.out.print("Informe o terceiro número --> ");
		n3 = teclado.nextInt();
		
		if(n1 > n2 && n2 > n3 || n1 > n3 && n3 > n2) {
			System.out.print("O maior número é --> "+n1);
		}else if(n2 > n1 && n1 > n3 || n2 > n3 && n3 > n1) {
			System.out.print("O maior número é --> "+n2);
		}else {
			System.out.println("O maior número é --> "+n3);
		}
	}

}
