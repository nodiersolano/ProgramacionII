package co.uniquindio.fundamenos.biblioteca;

public class Lector {
	/*
	 * atributos de la clase Lector
	 */
	private String libroleido;
	private String genero;
	private int edad;
	
	/*
	 * @param es el nombre de de e libro que esta leyendo el lector
	 */
	public void setLibroLeido(String libroleido) {
		this.libroleido= libroleido;
	}
	
	/*
	 * @param es el genero de el/la lector
	 */
	public void setGenero(String genero) {
		this.genero=genero;
	}

	/*
	 * @param es la edad de el/la lector
	 */
	public void setEdad(int edad) {
		this.edad=edad;
	}

}




