package main;

import java.util.Scanner;

import entity.projeto_banco;

public class ex_final {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		projeto_banco cadastro;
		
		//cadastro inicial
		System.out.println("Olá, bem vindo ao banco udemy");
		System.out.println("Vamos iniciar seu cadastro");
		System.out.println("Insira número da conta");
		int id_count = sc.nextInt();	
		System.out.println("Insira nome completo");
		String name = sc.next();
		
		//se será depositado algo
		System.out.println("Deseja realizar um deposito inicial?");
		double response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println("Valor do deposito: ");
			double initial_deposit = sc.nextDouble();			
			cadastro = new projeto_banco(id_count, name, initial_deposit);
		}else {
			cadastro = new projeto_banco(id_count, name);
		}
		
		//exibe o pre cadastro
		System.out.println(cadastro);
		System.out.println();

		//deposito
		System.out.println("valor a ser depositado: ");
		double deposit_value = sc.nextDouble();
		cadastro.deposito(deposit_value);
		System.out.println("valor atualizado: ");
		System.out.println(cadastro);
		
		//saque
		System.out.println("Valor a ser sacado: ");
		double saque_value = sc.nextDouble();
		cadastro.saque(saque_value);
		System.out.println("Valor atualizado: ");
		System.out.println(cadastro);
		
		sc.close();

	}

}
