package entidades;

public class Estoque {

	public String nome;
	public double preco;
	public int qtd;
	
	
	public double vTotal() {
		return preco * qtd;
	}
	
	public void addProduct(int qtd) {
		this.qtd+=qtd;
	}
	
	public void removeProduct (int qtd) {
		this.qtd-=qtd;
	}

	
	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", " + qtd + " unidades, Total: R$ "
				+ String.format("%.2f", vTotal());	
		
	
	}
	
	
	
	}

