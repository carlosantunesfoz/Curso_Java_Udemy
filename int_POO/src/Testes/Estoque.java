package Testes;

import java.util.Scanner;

import entity.estoqueEntity;

public class Estoque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		estoqueEntity produto = new estoqueEntity();
		
		System.out.println("Insira os dados do produto: ");
		produto.nome = sc.next();
		produto.preço = sc.nextDouble();
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto);
		
		System.out.println("Adcione ao estoque");
		int qtd = sc.nextInt();
		produto.addQuantidade(qtd);
		
		System.out.println(produto);
		
		System.out.println("remova produtos");
		qtd = sc.nextInt();
		produto.removeQuantidade(qtd);
		
		System.out.println(produto);
		
		sc.close();
	}
	
	
}
