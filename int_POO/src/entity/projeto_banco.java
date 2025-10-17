package entity;

public class projeto_banco {
	
	private int id_count;
	private String name;
	private double deposit;
	
	//caso seja chamado em apenas duas opções
	public projeto_banco(int id_count, String name) {
		this.id_count = id_count;
		this.name = name;
	}
	
	//caso seja cahamdo em 3 opções
	public projeto_banco(int id_count, String name, double initial_deposit) {
		this.id_count = id_count;
		this.name = name;
		deposito(initial_deposit);
	}	


	public int getId_count() {
		return id_count;
	}

	/* public void setId_count(int id_count) {
		this.id_count = id_count;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDeposit() {
		return deposit;
	}

	/*public void setDeposit(double deposit) {
		this.deposit = deposit;
	}*/
	
	public void deposito (double deposito) {
		deposit += deposito;
	}
	
	public void saque (double deposito) {
		deposit -= deposito + 5.00; 
	}

	public String toString() {
		return "conta "
				+ id_count
				+ " nome da pessoa "
				+ name
				+ " saldo: "
				+ String.format("%.2f", deposit);
	}
	
}
