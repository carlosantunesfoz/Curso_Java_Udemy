package main;

import java.util.Scanner;

import utilits.mem_estaticos_ult;


public class mem_estaticos {


	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor do raio");
		double raio = sc.nextDouble();
		
		double c = mem_estaticos_ult.circumference(raio);
		double v  = mem_estaticos_ult.volume(raio);
		
		System.out.printf("circunferencia: %.2f %n", c);
		System.out.printf("volume: %.2f %n", v);
		System.out.printf("pi: %.2f %n", mem_estaticos_ult.PI);
		sc.close();
	}

}
