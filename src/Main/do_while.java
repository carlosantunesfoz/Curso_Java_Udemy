package Main;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do{
			System.out.println("Digite a tempera em C°: ");
			double c = sc.nextDouble();
			double f = 9 * c / 5 + 32;
			System.out.printf("Equivalente em farenheight: %.1f%n", f);
			System.out.print("Deseje repetir a ação?");
			resp = sc.next().charAt(0);
		}while(resp != 'n');
		
		sc.close();

	}

}
