package Exercicios_02;

import java.util.Scanner;


//calculo de salário com base no tempo x salario por tempo
public class ex_04 {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1;
		float h_trab, h_sal, salario;
		
		n1 = sc.nextInt();
		h_trab = sc.nextFloat();
		h_sal = sc.nextFloat();
		
		salario = h_trab * h_sal;
		
		System.out.printf("O funcionario %d recebem %.2f%n", n1, salario);
		
		sc.close();
		
	}
	
}
