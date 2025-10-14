package Testes;

import java.util.Scanner;

import entity.ex_02Entity;

public class ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex_02Entity employee = new ex_02Entity();
		
		System.out.println("Insira os dados do funcionário:: ");
		employee.name = sc.nextLine();
		employee.payment = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		
		System.out.println("Insira a % de aumento");
		double taxas = sc.nextDouble();
		employee.nextPayment(taxas);
		
		System.out.println(employee);
		
		sc.close();
	}

}
