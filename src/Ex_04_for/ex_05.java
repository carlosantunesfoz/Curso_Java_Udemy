package Ex_04_for;

import java.util.Scanner;

public class ex_05 {
	public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite um número: ");
	int n = sc.nextInt();
	int fat = 1;
	
	for(int i = 1; i <= n; i++) {
		fat = fat * i;
		System.out.println(fat);
		}
	

	}

}
