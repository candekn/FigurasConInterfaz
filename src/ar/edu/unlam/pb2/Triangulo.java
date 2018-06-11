package ar.edu.unlam.pb2;

public class Triangulo implements Figura{
		//Atributos
	private Double ladoA;
	private Double ladoB;
	private Double ladoC;
	
		//Metodos
	public Triangulo (Double a, Double b, Double c){
		this.ladoA=a;
		this.ladoB=b;
		this.ladoC=c;
	}
	@Override
	public Double calcularArea(){
		return((this.ladoA+this.ladoB+this.ladoC)/2);
	}
	@Override
	public Double calcularPerimetro(){
		return (this.ladoA+this.ladoB+this.ladoC);
		
	}
	public Double getLadoA() {
		return ladoA;
	}
	public void setLadoA(Double ladoA) {
		this.ladoA = ladoA;
	}
	public Double getLadoB() {
		return ladoB;
	}
	public void setLadoB(Double ladoB) {
		this.ladoB = ladoB;
	}
	public Double getLadoC() {
		return ladoC;
	}
	public void setLadoC(Double ladoC) {
		this.ladoC = ladoC;
	}
	
}
