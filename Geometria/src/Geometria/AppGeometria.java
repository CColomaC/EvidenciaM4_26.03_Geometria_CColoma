package Geometria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class AppGeometria {
	
	private static ArrayList<Rectangulo> rectangulo = new ArrayList<Rectangulo>();
	private static ArrayList<Circulo> circulo = new ArrayList<Circulo>();
	
	private final static short OPCION_RECTANGULO_AREA 	= 1;
	private final static short OPCION_CIRCULO_RADIO 	= 2;
	private final static short OPCION_CIRCULO_PERIMETRO = 3;
	private final static short OPCION_CIRCULO_AREA 		= 4;
	private final static short OPCION_SALIR 			= 5;
	
	private static short opcionSeleccionada;

	public static void main(String[] args) {
		do {
			menu();
		}while( opcionSeleccionada != OPCION_SALIR);
	}

	private static void menu() {
		System.out.println("MENU\n_____________");
		System.out.println("1. Calcular el �rea de un rect�ngulo");
		System.out.println("2. Calcular el radio de un c�rculo");
		System.out.println("3. Calcular el per�metro de un c�rculo");
		System.out.println("4. Calcular el �rea de un c�rculo");
		System.out.println("5. SALIR\n");
		
		System.out.println("Seleccione una opci�n del menu:");
		Scanner scanner = new Scanner(System.in);
		try {
			opcionSeleccionada = (short) scanner.nextInt();
		}catch(InputMismatchException ime) {
			System.out.println("S�lo se permite ingresar valores num�ricos!\n");
		}
		
		switch(opcionSeleccionada) {
			case OPCION_RECTANGULO_AREA:
				calcularAreaRectangulo();
				break;
			case OPCION_CIRCULO_RADIO:
				calcularRadioCirculo();
				break;
			case OPCION_CIRCULO_PERIMETRO:
				calcularPerimetroCirculo();
				break;
			case OPCION_CIRCULO_AREA:
				calcularAreaCirculo();
				break;
		}

	}	
	private static void calcularAreaRectangulo() {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la medida de la base del rect�ngulo:");
		double base = scanner.nextDouble();
		System.out.println("Ingrese la altura del rect�ngulo");
		double altura = scanner.nextDouble();
		
		Rectangulo rectangulo = new Rectangulo(base, altura);
		double area = rectangulo.calcularArea();
		System.out.printf("El �rea del rect�ngulo es %f %n%n", area);
		}catch(Exception e) {
			System.out.println("Ingresar s�lo valores num�ricos, si son decimales debe separar con coma!\n");
		}
	}
	private static void calcularRadioCirculo() {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el di�metro del c�rculo:");
		double diametro = scanner.nextDouble();
		
		Circulo circulo = new Circulo(diametro);
		double radio = circulo.calcularRadio();
		System.out.printf("El radio del circulo es %f %n%n", radio);
		}catch(Exception e) {
			System.out.println("Ingresar s�lo valores num�ricos, si son decimales debe separar con coma!\n");
		}
	}
	private static void calcularPerimetroCirculo() {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el di�metro del c�rculo:");
		double diametro = scanner.nextDouble();
		
		Circulo circulo = new Circulo(diametro);
		double perimetro = circulo.calcularPerimetro();
		System.out.printf("El perimetro del circulo es %f %n%n", perimetro);
		}catch(Exception e) {
			System.out.println("Ingresar s�lo valores num�ricos, si son decimales debe separar con coma!\n");
		}
	}
	private static void calcularAreaCirculo() {
		try {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el di�metro del c�rculo:");
		double diametro = scanner.nextDouble();
		
		Circulo circulo = new Circulo(diametro);
		double area = circulo.calcularArea();
		System.out.printf("El �rea del circulo es %f %n%n", area);
		}catch(Exception e) {
			System.out.println("Ingresar s�lo valores num�ricos, si son decimales debe separar con coma!\n");
		}
	}
}
