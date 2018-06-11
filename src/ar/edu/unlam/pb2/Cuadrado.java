package ar.edu.unlam.pb2;

public class Cuadrado implements Figura {
	//Atributos
	private Double lado;

	//Metodos
	public Cuadrado(Double lado) {
		this.lado = lado;
	}
	@Override
	public Double calcularArea() {
		return (Math.pow(this.lado, 2));
	}

	@Override
	public Double calcularPerimetro() {
		return (this.lado*4);
	}
	public Double getLado() {
		return lado;
	}
	public void setLado(Double lado) {
		this.lado = lado;
	}
	

}
