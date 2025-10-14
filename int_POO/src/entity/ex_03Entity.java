package entity;

public class ex_03Entity {
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double mediaSemestres(){
		return (n1 * 0.3) + (n2 * 0.35) + (n3 * 0.35);
	}
	
	public String toString() {
		return "nome: "
				+ name
				+", nota 1: "
				+n1
				+", nota 2: "
				+n2
				+", nota 3: "
				+n3
				+String.format("%nmedia final: %.2f", mediaSemestres());
	}
	
	
	
}
