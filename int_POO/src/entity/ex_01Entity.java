package entity;


//descrição: calcular a area, diagonal e perimetro de um triangulo
public class ex_01Entity {
	public double largura;
	public double altura;
	
	public double area(){
		return largura * altura;
	}
	
	public double perimetro() {
		return 2 * (largura + altura);
	}
	
	public double diagonal() {
		return Math.sqrt((altura * altura) + (largura * largura));
	}
	
	public String toString() {
		return String.format("area %.2f %n", area())
		+ String.format("perimetro: %.2f %n", perimetro())
		+ String.format("diagonal %.2f %n", diagonal());
				
	}
}
