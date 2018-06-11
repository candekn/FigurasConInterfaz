package ar.edu.unlam.pb2;

public class Circulo implements Figura {
		//Atributos
		private Double radio;
		
		//Metodos
		public Circulo (Double radio){
			this.radio=radio;
		}
	@Override
	public Double calcularArea() {
		return (Math.PI*(Math.pow(this.radio, 2)));
	}

	@Override
	public Double calcularPerimetro() {
		return (Math.PI*2*this.radio);
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
}
