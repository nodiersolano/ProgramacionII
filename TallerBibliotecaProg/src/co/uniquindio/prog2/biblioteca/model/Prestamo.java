package co.uniquindio.prog2.biblioteca.model;

public class Prestamo {
	/**
	 * atributos de la clase prestamo
	 */
	


	private int fechaPrestamo;
	private String codigo;
	private String codigoPrestamo;
	private int fechaDevolucion;
	private String titulo;
	private int valorPrestamo;
	private int subTotal;

	private Estudiante estudiante;
	private Bibliotecario bibliotecario;

	/**
	 * ESte es el metodo constructor
	 * @param fechaPrestamo
	 * @param codigo
	 * @param fechaDevolucion
	 * @param estudiante
	 * @param bibliotecario
	 * @param valorPrestamo
	 */
	public Prestamo(int fechaPrestamo, String titulo, String codigo, String codigoPrestamo, int fechaDevolucion,int valorPrestamo,
			Estudiante estudiante, Bibliotecario bibliotecario,int subTotal) {
		this.fechaPrestamo = fechaPrestamo;
		this.titulo=titulo;
		this.codigo = codigo;
		this.codigoPrestamo=codigoPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.estudiante = estudiante;
		this.bibliotecario = bibliotecario;
		this.valorPrestamo = valorPrestamo;
		this.subTotal = subTotal;
		
	}

	public Prestamo(int fechaPrestamo, String titulo, String codigo, String codigoPrestamo, int fechaDevolucion, int valorPrestamo, int subTotal) {
		this.fechaPrestamo = fechaPrestamo;
		this.titulo=titulo;
		this.codigo = codigo;
		this.codigoPrestamo=codigoPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.valorPrestamo = valorPrestamo;
		this.subTotal = subTotal;
	}

	public Prestamo() {

	}

	public int getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(int fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getFechaDevolucion() {
		return fechaDevolucion;
	}

	public void setFechaDevolucion(int fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	public int getValorPrestamo() {
		return valorPrestamo;
	}

	public void setValorPrestamo(int fechaDevolucion) {
		this.valorPrestamo = fechaDevolucion;
	}



	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public Bibliotecario getBibliotecario() {
		return bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	} 
	
	public int getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}

	public String getCodigoPrestamo() {
		return codigoPrestamo;
	}

	public void setCodigoPrestamo(String codigoPrestamo) {
		this.codigoPrestamo = codigoPrestamo;
	}

	public boolean verificarEstudiante(String nombre) {

		boolean estudianteVerificado = false;
		if(estudiante != null) {
			estudianteVerificado = estudiante.verificarNombre(nombre);
			if(estudianteVerificado == true) {
				return true;
			}
		}

		return false;
	}
	

	//----------------------------------------------------------------------
	//1.0 Consultar la cantidad de libros de la editorial “Uniquindio”
		//que han sido prestados  en la biblioteca y su título empiece por una vocal.
	
	@Override
	public String toString() {
		return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", codigo=" + codigo + ", codigoPrestamo=" + codigoPrestamo
				+ ", fechaDevolucion=" + fechaDevolucion + ", titulo=" + titulo + ", estudiante=" + estudiante
				+ ", bibliotecario=" + bibliotecario + ", valorPrestamo=" + valorPrestamo + ", subTotal=" + subTotal + "]";
	}
	
	
	/**
	 * Este metodo obtiene el precio que tienen los prestamos con una constante de 2 mil por dia
	 * que puede ser otro valor, el maximo de alquiler de un libro es un mes
	 * @param fechaPrestamo
	 * @param fechaDevolucion
	 * @return el precio de los prestamos segun el tiempo que alquilen un libro
	 */
	public double obtenerPrecioPrestamo(int fechaPrestamo, int fechaDevolucion) {
	
		int dias;
		double precio=0;
		
		if(fechaPrestamo==fechaDevolucion) {
		dias=31;
		precio=dias*2000;
		}else {
			if(fechaDevolucion>fechaPrestamo) {
				dias=fechaDevolucion-fechaPrestamo;
				precio=dias*2000;
			} }
			
				if(fechaDevolucion<fechaPrestamo) {
				dias=fechaDevolucion+31-fechaPrestamo;
				precio=dias*2000;
					}
				
			
		return precio;
	}
	

}