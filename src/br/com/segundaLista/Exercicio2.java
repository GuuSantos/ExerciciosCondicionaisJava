package br.com.segundaLista;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n1, n2, n3, maior, segundoMaior, terceiroMaior;
		
		
		
		System.out.print("Informe o primeiro n�mero --> ");
		n1 = teclado.nextInt();
		
		System.out.print("Informe o segundo n�mero --> ");
		n2 = teclado.nextInt();
		
		System.out.print("Informe o terceiro n�mero --> ");
		n3 = teclado.nextInt();
		
		if(n1 > n2 && n2 > n3 || n1 > n3 && n3 > n2) {
			maior = n1;
			if(n2 > n3) {
				segundoMaior = n2;
				terceiroMaior = n3;
			}else{
				segundoMaior = n3;
				terceiroMaior = n2;
			}
		}else if(n2 > n1 && n1 > n3 || n2 > n3 && n3 > n1) {
			maior = n2;
			if(n1 > n3) {
				segundoMaior = n1;
				terceiroMaior = n3;
			}else{
				segundoMaior = n3;
				terceiroMaior = n1;
			}
		}else {
			maior = n3;
			if(n1 > n2) {
				segundoMaior = n1;
				terceiroMaior = n2;
			}else{
				segundoMaior = n2;
				terceiroMaior = n1;
			}
		}
		
		System.out.println("A Ordem Crescente dos n�meros � : \n"+terceiroMaior+"\n"+segundoMaior+"\n"+maior);
			
	
	
	
	
	
	
	
	}

}
