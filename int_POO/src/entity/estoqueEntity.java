package entity;

public class estoqueEntity {

		public String nome;
		public double preço;
		public int quantidade;

		public double valorTotal() {
			return preço * quantidade;
		}
		
		public void addQuantidade(int quantidade) {//porque depende de uma entrada
			//externa de dados, por isso ele vai dentro das chaves;
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
