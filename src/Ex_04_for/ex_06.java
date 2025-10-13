package Ex_04_for;

import java.util.Scanner;

public class ex_06 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}
}
