package entidades;

public class Retangulo {

	public double largura;
	public double altura;

	public double area() {
		return largura * altura;

	}

	public double perimetro() {
		return 2 * (largura * altura);
	}

	public double diagonal() {
		return Math.sqrt(largura* largura + altura * altura);
	}

	
	public String toString() {
		return "O retangulo possui a area de: " + area() + " , " + perimetro() + " de perimetro, " 
	+ diagonal() + "de diagonal"; 
		
	}
	
}
