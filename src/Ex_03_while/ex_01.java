package Ex_03_while;

import java.util.Scanner;

public class ex_01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = 2002;
		
		while(x != y) {
			System.out.println("Senha invalida");
			x = sc.nextInt();
		}
		
		System.out.println("Acesso permitido");
		
		sc.close();
	}

}
