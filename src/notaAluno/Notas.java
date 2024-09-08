package entidades;

public class Notas {
	private String nome;
	private Float n1, n2, n3, media;

	public Notas(String nome, Float n1, Float n2, Float n3) {
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		notaFinal(n1, n2, n3);
	}

	private void notaFinal(Float n1, Float n2, Float n3) {
		  media = n1 + n2 + n3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
		notaFinal(n1, n2, n3);
	}

	public double getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
		notaFinal(n1, n2, n3);

	}

	public double getN3() {
		return n3;
	}

	public void setN3(float n3) {
		this.n3 = n3;
		notaFinal(n1, n2, n3);
	}

	public Float getMedia() {
		return media;
	}

}
