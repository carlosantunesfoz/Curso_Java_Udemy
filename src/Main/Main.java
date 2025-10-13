package Main;

import java.util.Locale;

public class Main {
	public static void main(String[] args)/*isso é uma função*/ {
		
		int x = 32;
		double y = 3.21231;
		
		System.out.print("não quebra linha no final");
		System.out.println("quebra linha no final");


		System.out.println(x);
		System.out.println(y);
		System.out.printf("%.2f%n", y);
		System.out.printf("%.4f%n", y);
		/*System.out.prinf(<formato>, <valor>)*/
		Locale.setDefault(Locale.US);
		/*Define a UR que os pontos utilizaram*/
		System.out.printf("%.4f%n", y);
		
		System.out.println("Resultado = " + x + " metros");
		/*exemplo de concatenação*/
		
		System.out.printf("Resultado = %.2f metros%n", y);
		/*usando printf*/
	
		String nome = "maria";
		int idade = 31;
		double renda = 4.000;
		
		System.out.printf("%s tem %d anos e ganha %.2f de pensão%n", nome, idade, renda);;

	}
}
