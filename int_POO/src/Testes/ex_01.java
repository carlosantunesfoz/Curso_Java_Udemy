package Testes;

import java.util.Scanner;

import entity.ex_01Entity;

//descrição: calcular a area, diagonal e perimetro de um triangulo
public class ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ex_01Entity retan = new ex_01Entity();
		
		System.out.println("Insira largura e alturada");
		retan.altura = sc.nextDouble();
		retan.largura = sc.nextDouble();
		
		System.out.println(retan);
		
		sc.close();

	}

}
