package br.com.segundaLista;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3, maior;
		
		System.out.print("Informe o primeiro n�mero --> ");
		n1 = teclado.nextInt();
		
		System.out.print("Informe o segundo n�mero --> ");
		n2 = teclado.nextInt();
		
		System.out.print("Informe o terceiro n�mero --> ");
		n3 = teclado.nextInt();
		
		if(n1 > n2 && n2 > n3 || n1 > n3 && n3 > n2) {
			System.out.print("O maior n�mero � --> "+n1);
		}else if(n2 > n1 && n1 > n3 || n2 > n3 && n3 > n1) {
			System.out.print("O maior n�mero � --> "+n2);
		}else {
			System.out.println("O maior n�mero � --> "+n3);
		}
	}

}
