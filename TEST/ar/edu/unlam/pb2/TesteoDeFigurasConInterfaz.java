package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteoDeFigurasConInterfaz {

	@Test
	public void testeoDePerimetroAreaCuadrado(){
		Cuadrado test1 = new Cuadrado(5.0);
		Double perim=20.0;
		Double area=25.0;
		assertEquals(perim,test1.calcularPerimetro());
		assertEquals(area, test1.calcularArea());
	}
	@Test
	public void testeoDePerimetroAreaRectangulo(){
		Figura test2 = new Rectangulo(10.0,2.0);
		Double area=20.0;
		Double perim=24.0;
		assertEquals(area,test2.calcularArea());
		assertEquals(perim,test2.calcularPerimetro());
	}
	@Test
	public void testeoDePerimetroAreaCirculo(){
		Circulo test3 = new Circulo(2.5);
		Double area=19.63;
		Double perim=15.70;
		assertEquals(area,test3.calcularArea(),2);
		assertEquals(perim,test3.calcularPerimetro(),2);
	}
	@Test
	public void testeoDePerimetroAreaTriangulo(){
		Figura test4 = new Triangulo(3.0,5.0,6.0);
		Double area=7.0;
		Double perim=14.0;
		assertEquals(area,test4.calcularArea());
		assertEquals(perim,test4.calcularPerimetro());
	}
}

