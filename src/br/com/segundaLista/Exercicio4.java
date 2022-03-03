package br.com.segundaLista;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double n1, quadrado, raiz;
		
		System.out.print("Informe um número --> ");
		n1 = teclado.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("O número "+n1+" é PAR");
			quadrado = Math.pow(n1, 2);
			System.out.print("O quadrado desse número é --> "+quadrado);
		}else if(n1 % 2 == 1) {
			System.out.println("O número "+n1+" é IMPAR");
			raiz = Math.sqrt(n1);
			System.out.print("A raiz quadrada desse número é --> "+raiz);
		}
	}

}
