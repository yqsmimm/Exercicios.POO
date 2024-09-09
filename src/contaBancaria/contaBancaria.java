package entidades;

public class contaBancaria {
	private String nomeTitular;
	private int numeroConta;
	private double saldoConta;

	public contaBancaria(String nomeTitular, int numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
	}

	public contaBancaria(String nomeTitular, int numeroConta, double depositoInicial) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		deposito(depositoInicial);
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void deposito(double valor) {
		saldoConta += valor;
	}

	public void sacar(double valor) {
		saldoConta -= valor + 5.0;
	}

	@Override
	public String toString() {
		return "Conta " + numeroConta + ", Nome do Titular: " + nomeTitular + ", Saldo: R$ "
				+ String.format("%.2f", saldoConta);
	}
}
