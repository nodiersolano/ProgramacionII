package co.uniquindio.fundamentos.triangulo;

import javax.swing.JOptionPane;

import co.uniquindio.fundamentos.triangulo.model.Triangulo;

/**
 * Es la clase en donde se invoca el main
 * 
 * @author Sonia Jaramillo Valbuena
 * @author Sergio Augusto Cardona
 *
 */

public class Aplicacionjo {

	/**
	 * Metodo principal
	 * 
	 * @param args Argumentos de la linea de comandos
	 */
	public static void main(String args[]) {
		double base;
		double altura;
		double area = 0;
		base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura: "));
		Triangulo miTriangulo; // miTriangulo es una referencia a un objeto de tipo
		miTriangulo = new Triangulo();
		miTriangulo.setBase(base); // método para fijar el atributo base
		miTriangulo.setAltura(altura); // método para fijar el atributo altura
		area = miTriangulo.calcularArea(); // esto devolvería (15*4)/2=0
		JOptionPane.showMessageDialog(null, "El area es " + area);
	}

	
	}

