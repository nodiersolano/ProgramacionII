package co.uniquindio.fundamenos.biblioteca;

public class Libro {
	/*
	 * Atributos de la clase libro
	 */
	private String genero;
	private String color;
	private double tamaño;
	private int paginas;
	
	/*
	 * @param es el genero del libro
	 */
	public void setGenero(String genero) {
		this.genero= genero;
	}
	
	/*
	 * @param es el color del libro
	 */
	public void setColor(String color) {
		this.color=color;
	}

	/*
	 * @param es el color del libro
	 */
	public void setTamaño(double tamaño) {
		this.tamaño=tamaño;
	}

	/*
	 * @param es el color del libro
	 */
	public void setPaginas(int paginas) {
		this.paginas=paginas;
	}

}
