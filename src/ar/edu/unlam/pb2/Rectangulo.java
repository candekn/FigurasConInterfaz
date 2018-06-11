package ar.edu.unlam.pb2;

public class Rectangulo implements Figura{
		//Atributos
	private Double base;
	private Double altura;
	
		//Metodos
	public Rectangulo (Double base, Double altura){
		this.base=base;
		this.altura=altura;
	}
	@Override
	public Double calcularArea(){
		Double resultado=(this.base*this.altura);
		return resultado;	
	}
	@Override
	public Double calcularPerimetro(){
		return ((this.base*2)+(this.altura*2));
	}
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
}
