package co.uniquindio.fundamentos.triangulo.model;

/**
 * Clase para representar un triangulo
 * 
 * @author Sonia Jaramillo Valbuena
 * @author Sergio Augusto Cardona
 *
 */

public class Triangulo {

	/**
	 * Son los atributos del triangulo
	 */
	private double base;
	private double altura;

	/**
	 * Metodo modificador
	 * @param base Es la base del triangulo
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * Permite fijar la altura
	 * @param altura Es la altura del triangulo
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Permite calcular el area del triangulo
	 * @return el area
	 */
	public double calcularArea() {
		double area = (base * altura) / 2.0;
		return area;
	}

}