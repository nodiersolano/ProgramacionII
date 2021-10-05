package co.uniquindio.fundamentos.triangulo;

import java.util.Scanner;

import co.uniquindio.fundamentos.triangulo.model.Triangulo;

/**
 * Es la clase en donde se invoca el main
 * 
 * @author Sonia Jaramillo Valbuena
 * @author Sergio Augusto Cardona
 *
 */

public class Aplicacion {

	/**
	 * Metodo principal
	 * 
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String args[]) {
		double base =5;
		double altura =4;
		double area = 0;
		base = leerDoubleConsola("Ingrese la base: ");
		altura = leerDoubleConsola("Ingrese la altura: ");
		Triangulo miTriangulo; // miTriangulo es una referencia a un objeto de tipo
		miTriangulo = new Triangulo();
		miTriangulo.setBase(base); // método para fijar el atributo base
		miTriangulo.setAltura(altura); // método para fijar el atributo altura
		area = miTriangulo.calcularArea(); // esto devolvería (15*4)/2=0
		System.out.println("El area es " + area);
	}

	/**
	 * Metodo para leer un double por consola
	 * 
	 * @param mensaje El mensaje a mostrar
	 * @return El numero leido
	 */
	public static double leerDoubleConsola(String mensaje) {
		double dato = 0;
		String captura = "";
		System.out.println(mensaje);
		Scanner teclado = new Scanner(System.in);
		captura = teclado.nextLine();
		dato = Double.parseDouble(captura);
		return dato;
	}

}