package Geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CirculoTest {
	//anotaciones - tienen la sintaxis @identificador
	//la anotacion @Test indica que el método es una prueba
	@Test
	void testCalculoRadio() {
		//para hacer el caso de prueba es importante tener los valores con anterioridad
		//caso 1	: diámetro 100, el radio es 50.
		//caso 2	: diámetro 50, radio es 25.
		//caso 3	: diámetro 20, radio es 10.
		//casoFail:	: diametro 20, radio Fail.
		
		// Caso1
				Circulo circulo1 = new Circulo();
				circulo1.setDiametro(100);
				double radio1 = circulo1.calcularRadio();
				assertEquals(50.0, radio1);
				
				// Caso2
				Circulo circulo2 = new Circulo();
				circulo2.setDiametro(50);
				double radio2 = circulo2.calcularRadio();
				assertEquals(25.0,radio2);

				// Caso3
				Circulo circulo3 = new Circulo();
				circulo3.setDiametro(20);
				double radio3 = circulo3.calcularRadio();
				assertEquals(10.0,radio3);
				
				//CasoFail
				Circulo circuloFail = new Circulo();
				circuloFail.setDiametro(20);
				double radioFail = circuloFail.calcularRadio();
				assertEquals(1.0,radioFail);
	}
	@Test
	void testCalculoPerimetro() {
		/* 
		 * CALCULO DE PERIMETRO DE CIRCULO
		 * METODO: Circulo.calcularPerimetro()
		 * INPUT: Caso1: Diametro 65
		 * CALCULO ESPERADO: Caso1: Perimetro de 204 
		 */
		
		//Caso1
		Circulo circulo1 = new Circulo();
		circulo1.setDiametro(65);
		double perimetro1 = circulo1.calcularPerimetro();
		perimetro1 = Math.round(perimetro1);
		assertEquals(204.0,perimetro1);

	}
	
	@Test
	void testCalculoArea() {
		/* 
		 * CALCULO DE AREA DE CIRCULO
		 * METODO: Circulo.calcularArea()
		 * INPUT: Caso1: Diametro 70
		 * CALCULO ESPERADO: Caso1: Area de 3848 
		 */
		
		//Caso1
		Circulo circulo1 = new Circulo();
		circulo1.setDiametro(70);
		double area1 = circulo1.calcularArea();
		area1 = Math.round(area1);
		assertEquals(3848.0,area1);

	}

}


