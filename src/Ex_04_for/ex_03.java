package Ex_04_for;

import java.util.Scanner;

public class ex_03 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número de instancias: ");
		int n = sc.nextInt();
		
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		
		
		for(int i = 0; i <= n; i++) {
			System.out.println("insira 3 digitos: ");
			n1 = sc.nextDouble();
			n2 = sc.nextDouble();
			n3 = sc.nextDouble();
			
			double media = (n1 * 0.2) + (n2 * 0.3) + (n3 * 0.5);
			System.out.println("A média final é: " + media);
		}
	}

}
