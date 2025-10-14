package entity;

//Descrição: Introdução a POO
public class trianguloEntity {
	public double a;
	public double b;
	public double c;
	

public double area() {//Os dados já estão na classe
	
	double p = (a + b + c) / 2;
	return Math.sqrt(p * (p-a) * (p-b) * (p-c));

	}
	
}
