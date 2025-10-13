package Exercicios_02;

import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float raio, area;
		
		raio = sc.nextFloat();
		area = (float) 3.14159 * (raio * raio);
		
		System.out.printf("A área tem: %.2f", area);
		
		sc.close();
	}
}
