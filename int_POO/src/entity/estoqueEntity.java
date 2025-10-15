package entity;

public class estoqueEntity {

		//"variaveis"
		private String nome;
		private double preço;
		private int quantidade;
		
		
		//Construtores
		public estoqueEntity() {
		}
		
		public estoqueEntity(String nome, double preço, int quantidade) {//construtor
			this.nome = nome; //o "this." referencia a classe. Se não colocar, ele referencia
							  //a referencia dentro da public
			this.preço = preço;
			this.quantidade = quantidade;
		}
		
		public estoqueEntity(String nome, double preço) {
			this.nome = nome;
			this.preço = preço;
		}

		
		//Getters and Setters
		//Metodo de segurança segundo o JAVA BEANS
		public void setName(String nome) {
			this.nome  = nome;
		}
		
		public String getName() {
			return nome;
		}
		
		public double getPreço() {
			return preço;
		}
		
		public void setPreço(double preço) {
			this.preço = preço;
		}
		
		public int getQuantidade() {
			return quantidade;
		}
		
		
		//Funções
		public double valorTotal() {
			return preço * quantidade;
		}
		
		public void addQuantidade(int quantidade) {//porque depende de uma entrada
			//externa de dados, por isso ele vai dentro de "()";
			this.quantidade += quantidade;
		}
		
		public void removeQuantidade(int quantidade) {
			this.quantidade -= quantidade;
		}
		
		public String toString() {
			return nome + ", $ "
					+ String.format("%.2f", preço)
					+ ", "
					+ quantidade
					+ " units, total: $ "
					+ String.format("%.2f", valorTotal());
					
		}

}
