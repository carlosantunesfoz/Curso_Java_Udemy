package main;

import java.util.Scanner;

import utilits.ex_mem_est_01;

//Compra de dolares (cotação 3.10) + 6% de IOF em cima do valor em dolares;
//exibir o valor a ser pago no final;

public class ex_mem_est {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira quantos dolares deseja: ");
		double dolar = sc.nextDouble();
		double iof = ex_mem_est_01.calcIOF(dolar);
		System.out.println(iof);
		double real = ex_mem_est_01.real(iof);
		System.out.printf("Valor em real a ser pago: %.2f %n", real);
		
		
		sc.close();
	}

}
