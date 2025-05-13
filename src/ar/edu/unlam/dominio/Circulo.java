package ar.edu.unlam.dominio;

public class Circulo extends Figura {

	private Double radio;

	public Circulo(String color, Double radio) {
		super(color);
		this.radio = radio;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(Double radio) {
		this.radio = radio;
	}

}
