package ar.edu.unlam.dominio;

import static org.junit.Assert.*;

import org.junit.Test;

public class FigurasTest {
	
	@Test
	public void queSePuedaCrearUnaFiguraDeColorVerde() {
	
		String color = "Verde";
		Figura figura = new Figura(color);
	
		assertEquals(color, figura.getColor());
	
	}

	
	@Test
	public void queSePuedaCrearUnCirculoDeColorRojoConRadio10() {
		String color = "Rojo";
		Double radio = 10.0;
		Circulo circulo = new Circulo(color, radio);
	
		assertEquals(color, circulo.getColor());
		
		assertEquals(color, circulo.getRadio());
	}
}
