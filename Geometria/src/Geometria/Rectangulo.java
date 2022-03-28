package Geometria;

public class Rectangulo {

		//ATRIBUTOS
		private double base;
		private double altura;
		
	//CONSTRUCTORES
	public Rectangulo() {
		
	}

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	//CALCULOS
	public double calcularArea() {
		return this.base * this.altura;
	}

	//GETTERS Y SETTTERS
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}

