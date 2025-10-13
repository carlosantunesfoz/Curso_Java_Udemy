package Main;

import java.util.Scanner;

public class entrada_de_dados {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int x = sc.nextInt();
		System.out.println("voce digitou: " + x);
		
		char teste = sc.next().charAt(0);
		System.out.println("voce digitou: " + teste);*/
		
		/*parte 2 */
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		sc.close();
	}
}
