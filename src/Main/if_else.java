package Main;

import java.util.Scanner;

public class if_else {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		/*int x;
		
		x = sc.nextInt();
		
		if (x < 12) {
			System.out.println("Bom dia");
		} else if (x > 12 && x < 19){
			System.out.println("Bom tarde");
		} else {
		System.out.println("Bom noite");
		}*/
		
		int x;
		x = sc.nextInt();
		double conta = 50.0;
		
		if (x > 100) {
			conta = conta + (x - 100) * 2;
		}
		
		System.out.println("Conta total no valor de: " + conta);
		
		sc.close();
	}
	

}
