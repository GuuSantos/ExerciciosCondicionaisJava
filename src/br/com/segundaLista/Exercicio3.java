package br.com.segundaLista;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Informe uma idade entre 10 e 25 anos--> ");
		idade = teclado.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.print("Esta pessoa se localiza na categoria INFANTIL");
		}else if(idade >= 15 && idade <= 17) {
			System.out.print("Esta pessoa se localiza na categoria JUVENIL");
		}else if(idade >= 18 && idade <= 25) {
			System.out.print("Esta pessoa se localiza na categoria ADULTO");
		}else {
			System.out.println("Digite uma idade válida");
		}
	}

}
