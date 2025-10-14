package Testes;

import java.util.Scanner;

import entity.ex_03Entity;

//Inserir nome, nota 1 (vale 30%), nota 2 (vale 35%) e nota 3 (vale 35%)
//e, ao final, exibir media e se o aluno foi aprovado ou não.
public class ex_03 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ex_03Entity student = new ex_03Entity();
		
		System.out.println("Insira nome, nota 1, nota 2 e nota 3");
		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		System.out.println(student);
		
		double media = student.mediaSemestres();
		
		if(media >= 60) {
			System.out.println("Aluno aprovado");
		}else {
			System.out.println("Aluno reprovado");
			System.out.printf("Faltou %.2f para ser aprovado", 60-media);
		}
		
		sc.close();
	}
}
