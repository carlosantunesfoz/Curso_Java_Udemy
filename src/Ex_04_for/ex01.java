package Ex_04_for;

import java.util.Scanner;

//Descrição: Programa para mostrar os números impares até
//o final do número de entrada manual;
public class ex01 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			if(i % 2 != 0) {
			System.out.println(i);
			}
		}	
		
	}

}
