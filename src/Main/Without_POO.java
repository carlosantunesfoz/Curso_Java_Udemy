package Main;

import java.util.Scanner;

public class Without_POO {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Triangulo 1");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double t1 = area(a,b,c);
		
		System.out.println("Triangulo 2");
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		double t2 = area(d,e,f);
		
		if(t1 > t2) {
			System.out.println("Triangulo um é maior: " + t1);
		}else {
			System.out.println("Triangulo dois é maior: " + t2);
		}
		
		sc.close();
	}


public static double area(int a, int b, int c) {
	double aux;
	double p;
	
	p = (a + b + c) / 2;
	aux = Math.sqrt(p * (p-a) * (p-b) * (p-c));
	
	return aux;
	}
}