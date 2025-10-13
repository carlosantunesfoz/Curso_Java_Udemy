package Exercicios_02;

import java.util.Scanner;

public class ex_05 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		int cod1, num_p1;
		float value1;
		int cod2, num_p2;
		float value2;
		
		cod1 = sc.nextInt();
		num_p1 = sc.nextInt();
		value1 = sc.nextFloat();
		cod2 = sc.nextInt();
		num_p2 = sc.nextInt();
		value2 = sc.nextFloat();
		
		float total = ((num_p1 * value1) + (num_p2 * value2));
		
		System.out.println("O valor total é: " + total);
		
		sc.close();
	}
}
