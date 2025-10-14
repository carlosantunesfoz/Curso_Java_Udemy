package Exercicios_02;

import java.util.Scanner;

//calculo de soma
public class ex_01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, soma;
		a = sc.nextInt();
		b = sc.nextInt();
		
		soma = a + b;
		
		System.out.println("A soma dos dois é: " + soma);
		sc.close();
		
	}
}
