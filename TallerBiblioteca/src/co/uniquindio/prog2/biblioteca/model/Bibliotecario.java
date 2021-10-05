package co.uniquindio.prog2.biblioteca.model;

public class Bibliotecario {

	/**
	 * Este atributo representa al nombre del Bibliotecario
	 */
	private String nombre;

	/**
	 * Este atributo representa a la identificacioon del Bibliotecario
	 */
	private String identificacion;

	/**
	 * Este atributo representa la direccion del Bibliotecario
	 */
	private String direccion;

	/**
	 * Este atributo representa el telefono del Bibliotecario
	 */
	private String telefono;
	/**
	 * Este atributo representa el telefono del Bibliotecario
	 */
	private int a�osServicio;


	/**
	 * Metodo constructor que permite inicializar la clase Bibliotecario con sus
	 * atributos
	 * 
	 * @param nombre         Este parametro representa al nombre del Bibliotecario
	 * @param identificacion Este parametro representa a la identificacioon del
	 *                       Bibliotecario
	 * @param direccion      Este parametro representa la direccion del
	 *                       Bibliotecario
	 * @param telefono       Este parametro representa el telefono del Bibliotecario
	 */
	public Bibliotecario(String nombre, String identificacion, String direccion, String telefono, int a�osServicio) {
		super();
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.a�osServicio = a�osServicio;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public void setA�osServicio(int a�osServicio) {
		this.a�osServicio = a�osServicio;
	}


	@Override
	public String toString() {
		return "Bibliotecario [nombre=" + nombre + ", identificacion=" + identificacion + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", a�osServicio=" + a�osServicio +" ]";
	}

}
