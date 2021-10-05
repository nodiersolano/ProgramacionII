package co.uniquindio.prog2.biblioteca.model;

public class Prestamo {

	private int fechaPrestamo;
	private String codigo;
	private String codigoPrestamo;
	private int fechaDevolucion;
	private String titulo;

	private Estudiante estudiante;
	private Bibliotecario bibliotecario;

	private DetallePrestamo detallePrestamo1;
	private DetallePrestamo detallePrestamo2;

	/**
	 * ESte es el metodo constructor
	 * 
	 * @param fechaPrestamo
	 * @param codigo
	 * @param fechaDevolucion
	 * @param estudiante
	 * @param bibliotecario
	 */
	public Prestamo(int fechaPrestamo, String titulo, String codigo, String codigoPrestamo, int fechaDevolucion,
			Estudiante estudiante, Bibliotecario bibliotecario) {
		this.fechaPrestamo = fechaPrestamo;
		this.titulo = titulo;
		this.codigo = codigo;
		this.codigoPrestamo = codigoPrestamo;
		this.fechaDevolucion = fechaDevolucion;
		this.estudiante = estudiante;
		this.bibliotecario = bibliotecario;
	}

	public Prestamo(int fechaPrestamo, String titulo, String codigo, String codigoPrestamo, int fechaDevolucion) {
		this.fechaPrestamo = fechaPrestamo;
		this.titulo = titulo;
		this.codigo = codigo;
		this.codigoPrestamo = codigoPrestamo;
		this.fechaDevolucion = fechaDevolucion;
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

	public DetallePrestamo getDetallePrestamo1() {
		return detallePrestamo1;
	}

	public void setDetallePrestamo1(DetallePrestamo detallePrestamo1) {
		this.detallePrestamo1 = detallePrestamo1;
	}

	public DetallePrestamo getDetallePrestamo2() {
		return detallePrestamo2;
	}

	public void setDetallePrestamo2(DetallePrestamo detallePrestamo2) {
		this.detallePrestamo2 = detallePrestamo2;
	}

	public String getCodigoPrestamo() {
		return codigoPrestamo;
	}

	public void setCodigoPrestamo(String codigoPrestamo) {
		this.codigoPrestamo = codigoPrestamo;
	}

	public boolean verificarEstudiante(String nombre) {

		boolean estudianteVerificado = false;
		if (estudiante != null) {
			estudianteVerificado = estudiante.verificarNombre(nombre);
			if (estudianteVerificado == true) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", codigo=" + codigo + ", codigoPrestamo=" + codigoPrestamo
				+ ", fechaDevolucion=" + fechaDevolucion + ", titulo=" + titulo + ", estudiante=" + estudiante
				+ ", bibliotecario=" + bibliotecario + ", detallePrestamo1=" + detallePrestamo1 + ", detallePrestamo2="
				+ detallePrestamo2 + "]";
	}

	// ----------------------------------------------------------------------
	// 1.0 Consultar la cantidad de libros de la editorial “Uniquindio”
	// que han sido prestados en la biblioteca y su título empiece por una vocal.

	public double obtenerPrecioPrestamo(int fechaPrestamo, int fechaDevolucion) {

		int dias;
		double precio = 0;

		if (fechaPrestamo == fechaDevolucion) {
			dias = 31;
			precio = dias * 2000;
		} else {
			if (fechaDevolucion > fechaPrestamo) {
				dias = fechaDevolucion - fechaPrestamo;
				precio = dias * 2000;
			}
		}

		if (fechaDevolucion < fechaPrestamo) {
			dias = fechaDevolucion + 31 - fechaPrestamo;
			precio = dias * 2000;
		}

		return precio;
	}

	public int obtenerCantidadLibrosEditorial(String editorial) {

		int cantidad = 0;

		if (detallePrestamo1 != null) {
			cantidad += detallePrestamo1.obtenerCantidadLibrosEditorialVocal(editorial);
		}
		if (detallePrestamo2 != null) {
			cantidad += detallePrestamo2.obtenerCantidadLibrosEditorialVocal(editorial);
		}
		return cantidad;
	}

}
