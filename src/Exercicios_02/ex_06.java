package Exercicios_02;

import java.util.Scanner;

//calculos matematicos com as variaveis especificando o tipo de calculo
public class ex_06 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a, b, c;
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		double triangulo_area = a * c / 2.0;
		double circulo_raio = 3.14156 * (c * c);
		double area_trapezio = ((a + b) * c) / 2.0;
		double area_quadrado = b * b;
		double area_retangulo = a * b;
		
		System.out.printf("A área é : %.2f%n", triangulo_area);
		System.out.printf("A área é : %.2f%n", circulo_raio);
		System.out.printf("A area do trapezio é: %.2f%n", area_trapezio);
		System.out.println("A area do quadrado é: " + area_quadrado);
		System.out.println("A area do retangulo é: " + area_retangulo);
		
		
		sc.close();
		
	}
}
