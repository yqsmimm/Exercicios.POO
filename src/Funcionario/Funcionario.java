package entidades;

public class Funcionario {

	private String nome;
	private double salarioBruto;
	private double taxa;
	private double salarioLiquido;

	public Funcionario(String nome, Double salarioBruto, Double taxa) {
		this.nome=nome;
		this.salarioBruto=salarioBruto;
		this.taxa=taxa;
		salarioLiquido(salarioBruto,taxa);
	}

	public void salarioLiquido(double salarioBruto, double taxa) {
		this.salarioLiquido = salarioBruto - taxa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return nome+ " R$ "+String.format("%.2f", salarioLiquido);
	}
	
	public void reajusteSalario(Double percentual) {
		salarioBruto += salarioBruto * percentual / 100;
		salarioLiquido(salarioBruto, taxa);

	}
}
