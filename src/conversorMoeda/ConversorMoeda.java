package entidades;

public class ConversorMoeda {

	private double comprarDolar;
	private double cotacaoD;
	private double converter;

	public ConversorMoeda(double comprarDolar, double cotacaoD) {
		this.comprarDolar = comprarDolar;
		this.cotacaoD = cotacaoD;
	}

	public double getComprarDolar() {
		return comprarDolar;
	}

	public void setComprarDolar(double comprarDolar) {
		this.comprarDolar = comprarDolar;
	}

	public double getCotacaoD() {
		return cotacaoD;
	}

	public void setCotacaoD(double cotacaoD) {
		this.cotacaoD = cotacaoD;
	}

	public double getConverter() {
		return converter;
	}

	public void setConverter(double converter) {
		this.converter = converter;
	}

	public double valorPagamento() {
		cotacaoD = this.comprarDolar * this.cotacaoD;
		double imposto = cotacaoD * 6.0 / 100;
		return imposto + cotacaoD;
	}

}
