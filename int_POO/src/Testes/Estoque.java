package Testes;

import java.util.Scanner;

import entity.estoqueEntity;

public class Estoque {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados do produto: ");
		String nome = sc.next();
		double preço = sc.nextDouble();
		int quantidade = sc.nextInt();
		
		estoqueEntity produto = new estoqueEntity(nome, preço);//Aqui obrigado
		//o programador a inserir os dados nos campos e evitar que sejam vazios
		
		produto.setName("novo nome");
		System.out.println("Novo nome" + produto.getName());
		produto.setPreço(1200);
		System.out.println("novo valor" + produto.getPreço());
		
		
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
