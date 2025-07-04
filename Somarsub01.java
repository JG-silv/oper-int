package aula03;

import java.util.Scanner;

public class Somarsub01 {
	public static void main(String[] args) {
		// 03 Faça um programa em Java para armazenar 2 números inteiros. Exiba na tela a soma, a subtração, a multiplicação, a divisão e o módulo.
		      Scanner sc = new Scanner(System.in) // Instanciação
		    	        int x, y; // Declaração das variável
		   System.out.print("Digite o primeiro número: ");
		    		x = sc.nextInt();
		     System.out.print("Digite o segundo número: ");
			    		y = sc.nextInt();
			    		System.out.println("Soma: " + (x + y));
			            System.out.println("Subtração: " + (x - y));
			            System.out.println("Multiplicação: " + (x * y));
			            System.out.println("Divisão: " + ((double)x / y));
			            System.out.println("Módulo: " + (x % y));  
		    }
}
