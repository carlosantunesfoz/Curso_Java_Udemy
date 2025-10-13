package Ex_04_for;

import java.util.Scanner;

public class ex_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		int n = sc.nextInt();
		double n1 = 0;
		double n2 = 0;
		
		for(int i = 0; i <= n; i++) {
			System.out.println("Digite 2 números");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			double div = n1 / n2;
			
			if(n2 == 0) {
				System.out.println("Divisão impossivel");
			}else {
				System.out.println(div);
			}
		}
	}
}
