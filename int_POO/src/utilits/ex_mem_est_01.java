package utilits;

//Compra de dolares (cotação 3.10) + 6% de IOF em cima do valor em dolares;
//exibir o valor a ser pago no final;

public class ex_mem_est_01 {
	public static final double COTACAO = 3.10;
	public static final double IOF = 0.06;
	
	public static double calcIOF(double dolar) {
		return dolar + (dolar * IOF);
	}
	
	public static double real(double dolar) {
		return dolar * COTACAO;
	}
	
}
