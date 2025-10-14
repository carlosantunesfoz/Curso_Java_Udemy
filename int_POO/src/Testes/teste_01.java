package Testes;

import java.util.Scanner;

import entity.trianguloEntity;

//Descrição: Introdução a POO
public class teste_01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		trianguloEntity x, y; //Chamou a classe e criou dois "armazens";
		x = new trianguloEntity();//Instanciei o objeto
		y = new trianguloEntity();//Ou seja, criei o objeto
		
		System.out.println("Triangulo 1");
		x.a = sc.nextInt();
		x.b = sc.nextInt();
		x.c = sc.nextInt();
		double t1 = x.area();//O objeto X recebe a função "area";
		//lembrando: o objeto X contem o centeúdo das 3 entidades;
		
		System.out.println("Triangulo 2");
		y.a = sc.nextInt();
		y.b = sc.nextInt();
		y.c  = sc.nextInt();
		double t2 = y.area();
		
		if(t1 > t2) {
			System.out.println("Triangulo um é maior: " + t1);
		}else {
			System.out.println("Triangulo dois é maior: " + t2);
		}
		
		sc.close();
	}

}