package entity;

public class ex_02Entity {
	public String name;
	public double payment;
	public double tax;
	
	public double liquid() {
		return payment - tax;
	}
	
	public String toString() {
		return String.format("nome: ")
				+ name
				+ ", salario liquido: "
				+ liquid()
				+ String.format(", imposto: ")
				+ tax;
	}
	
	public void nextPayment(double taxas) {
		this.payment += (payment * taxas / 100);
	}
}
