package co.uniquindio.prog2.biblioteca.model;

import co.uniquindio.prog2.biblioteca.aplicacion.Aplicacion;

/**
 * Clase
 * @author johangiraldohurtado
 *
 */
public class Biblioteca {
	
	/**
	 * Atributo
	 */
	private String nombre;
	
	/**
	 * 
	 */
	private String direccion;
	
	//Relaciones
	private Libro libro1;
	private Libro libro2;
	private Libro libro3;
	private Prestamo prestamo1;
	private Prestamo prestamo2;
	private Estudiante estudiante1;
	private Estudiante estudiante2;
	private Bibliotecario bibliotecario1;
	private Bibliotecario bibliotecario2;
	
	/**
	 * Construtor
	 * @param nombre
	 * @param direccion
	 */
	public Biblioteca(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/**
	 * Constructor
	 * @param nombre
	 */
	public Biblioteca(String nombre){
		this.nombre = nombre;
	}
	
	
	public Biblioteca() {
		super();
	}

	/**
	 * set nombre
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * get nombre
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * set direccion
	 * @param direccion Es el parametro que representa la direccion de la biblioteca
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * get direccion
	 * @return retorna la direccion de la biblioteca
	 */
	public String getDireccion() {
		return direccion;
	}
	
	

	public Libro getLibro1() {
		return libro1;
	}

	public void setLibro1(Libro libro1) {
		this.libro1 = libro1;
	}

	public Libro getLibro2() {
		return libro2;
	}

	public void setLibro2(Libro libro2) {
		this.libro2 = libro2;
	}

	public Prestamo getPrestamo1() {
		return prestamo1;
	}

	public void setPrestamo1(Prestamo prestamo1) {
		this.prestamo1 = prestamo1;
	}

	public Prestamo getPrestamo2() {
		return prestamo2;
	}

	public void setPrestamo2(Prestamo prestamo2) {
		this.prestamo2 = prestamo2;
	}

	public Estudiante getEstudiante1() {
		return estudiante1;
	}

	public void setEstudiante1(Estudiante estudiante1) {
		this.estudiante1 = estudiante1;
	}

	public Estudiante getEstudiante2() {
		return estudiante2;
	}

	public void setEstudiante2(Estudiante estudiante2) {
		this.estudiante2 = estudiante2;
	}

	public Bibliotecario getBibliotecario1() {
		return bibliotecario1;
	}

	
	public Bibliotecario getBibliotecario2() {
		return bibliotecario2;
	}

	public void setBibliotecario2(Bibliotecario bibliotecario2) {
		this.bibliotecario2 = bibliotecario2;
	}


	//CRUD (Create, Research, Update, Delete)
	

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", direccion=" + direccion + ", libro1=" + libro1 + ", libro2=" + libro2
				+ ", libro3=" + libro3 + ", prestamo1=" + prestamo1 + ", prestamo2=" + prestamo2 + ", estudiante1="
				+ estudiante1 + ", estudiante2=" + estudiante2 + ", bibliotecario1=" + bibliotecario1
				+ ", bibliotecario2=" + bibliotecario2 + "]";
	}

	/**
	 * Crear Estudiante
	 * @param nombre
	 * @param identificacion
	 * @param direccion
	 * @param telefono
	 * @return mensaje de que se ha creado o no, y tambien crea un estudiante
	 */
	public String crearEstudiante(String nombre, String identificacion, String direccion, String telefono) {
		String mensaje = "No es posible crear más estudiantes";
		if(estudiante1 == null) {
			estudiante1 = new Estudiante(nombre, identificacion, direccion, telefono);
			mensaje = "Estudiante creado con exito";
		}
		else {
			if(estudiante2 == null) {
				estudiante2 = new Estudiante(nombre, identificacion, direccion, telefono);
				mensaje = "Estudiante creado con exito";
			}
		}
		
		return mensaje;
	}
	
	/**
	 * Crear Bibliotecario
	 * @param nombre
	 * @param identificacion
	 * @param direccion
	 * @param telefono
	 * @return mensaje de que se ha creado o no, y tambien crea un bibliotecario
	 */
	public String crearBibliotecario(String nombre, String identificacion, String direccion, String telefono, int aniosExp) {
		String mensaje = "No es posible crear más bibliotecarios";
		if(bibliotecario1 == null) {
			bibliotecario1 = new Bibliotecario(nombre, identificacion, direccion, telefono, aniosExp);
			mensaje = "Bibliotecario creado con exito";
		}
		else {
			if(bibliotecario2 == null) {
				bibliotecario2 = new Bibliotecario(nombre, identificacion, direccion, telefono, aniosExp);
				mensaje = "Bibliotecario creado con exito";
			}
		}
		
		return mensaje;
	}
	
	/**
	 * Consultar Estudiante
	 * @param identificacionEstudiante
	 * @return el estudiante encontrado y sus datos
	 */
	public Estudiante consultarEstudiante(String identificacionEstudiante){
		Estudiante estudianteEncontrado = null;
		if(estudiante1 != null) {
			if(estudiante1.getIdentificacion().equals(identificacionEstudiante)) {
				estudianteEncontrado = estudiante1;
			}
		}
		if(estudianteEncontrado == null && estudiante2 != null ) {
			if(estudiante2.getIdentificacion().equals(identificacionEstudiante)) {
				estudianteEncontrado = estudiante2;
			}
		}
	
		return estudianteEncontrado;
		
	}
	/**
	 * Consultar informacion bibliotecario
	 * @param isbn
	 * @return datos
	 */
	public Bibliotecario consultarBibliotecario(String isbn){
		Bibliotecario datos = null;
		if(Bibliotecario1 != null) {
			if(Bibliotecario1.getIdentificacion().equals(nombreBibliotecario, identificacionBibliotecario, direccionBibliotecario, telefonoBibliotecario, aniosExpBibliotecario)) {
				datos = Bibliotecario1;
			}
		}
		if(estudianteEncontrado == null && estudiante2 != null ) {
			if(bibliotecario2.getIdentificacion().equals(nombreBibliotecario, identificacionBibliotecario, direccionBibliotecario, telefonoBibliotecario, aniosExpBibliotecario)
					datos = bibliotecario2;
			}
		}
	
		return datos;
		
	}
	/**
	 * Eliminar estudiante
	 * @param identificacionEstudiante
	 * @return un mensaje de que se ha eliminado el estudiante o no, y si es asi se pone en null
	 */
	public String eliminarEstudiante(String identificacionEstudiante) {
		String mensaje = "Estudiante no eliminardo";
		Estudiante estudianteEncontrado = null;
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante);
		if(estudianteEncontrado != null) {
			if(estudiante1.equals(estudianteEncontrado)) {
				estudiante1 = null;
				mensaje = "Estudiante eliminado";
			} else {
				if(estudiante2.equals(estudianteEncontrado)) {
					estudiante2 = null;
					mensaje = "Estudiante eliminado";
				}
			}
		}
		
		return mensaje;
	}
	
	/**
	 * Actualizar estudiante
	 * @param nombre
	 * @param identificacion
	 * @param direccion
	 * @param telefono
	 * @return mensaje de si se actualizo o no, y si es asi actualiza el estudiante
	 */
	public String actualizarEstudiante(String nombreEstudiante, String identificacionEstudiante, String direccionEstudiante, String telefonoEstudiante) {
		String mensaje = "Estudiante no actualizado";
		Estudiante estudianteEncontrado = null;
		estudianteEncontrado = consultarEstudiante(identificacionEstudiante);
		if(estudianteEncontrado != null) {
			estudianteEncontrado.setNombre(nombreEstudiante);
			estudianteEncontrado.setDireccion(direccionEstudiante);
			estudianteEncontrado.setTelefono(telefonoEstudiante);
			mensaje = "Estudiante actualizado";
		}
		return mensaje;
	}
	
	/**
	 * Crear libro
	 * @param nombreLibro
	 * @param isbn
	 * @return mensaje de si se creo el libro o no, y si es asi se crea un libro
	 */
	public String crearLibro(String codigo, String isbn, String titulo, String autor, int numeroPaginas, String editorial,
			String estado, String fechaPublicacion, int cantidadDisponible, int precioPrestamo) {
		
		String mensaje = "No es posible crear mas libros";
		if(libro1 == null) {
			libro1 = new Libro(codigo, isbn, titulo, autor, numeroPaginas,  editorial,
					 estado,  fechaPublicacion,  cantidadDisponible, precioPrestamo);
			mensaje = "Libro creado con exito";
		}
		
		else {
			if(libro2 == null) {
				libro2 = new Libro(codigo, isbn, titulo, autor, numeroPaginas, editorial,
						 estado, fechaPublicacion, cantidadDisponible, precioPrestamo);
				mensaje = "Libro creado con exito";
				
			} else {
				if(libro3==null){
					libro3= new Libro(codigo, isbn, titulo, autor, numeroPaginas, editorial,
							 estado, fechaPublicacion, cantidadDisponible, precioPrestamo);
					mensaje= "Libro creado con exito";
				}
			}
		}
		
		return mensaje;
	}
	
	
	/**
	 * Consultar datosLibro
	 * @param codigoLibro
	 * @return  devuelve los datos de un libro
	 */
	
	public Libro consultarLibro(String codigoLibro){
		Libro libroEncontrado = null;
		if(libro1 != null) {
			if(libro1.getCodigo().equals(codigoLibro)) {
				libroEncontrado = libro1;
			}
		}
		if(libroEncontrado == null && libro2 != null ) {
			if(libro2.getCodigo().equals(codigoLibro)) {
				libroEncontrado = libro2;
			}
		}
		if(libroEncontrado == null && libro3 !=null) {
			if(libro3.getCodigo().equals(codigoLibro)) {
				libroEncontrado= libro3;
			}
		}
	
		return libroEncontrado;
		
	}
	
	/**
	 * Metodo para crear un prestamo 
	 * @param fechaPrestamo
	 * @param titulo
	 * @param codigo
	 * @param codigoPrestamo
	 * @param fechaDevolucion
	 * @param estudiante
	 * @param bibliotecario
	 * @return un mensaje que contiene varias cosas, 1. No hay libros si su cantidad es == 0. 2. el conto de un prestamo
	 * 3. tambien cuantos libros quedan 4. si se hizo el prestamo o no, y si es asi crea el prestamo. Tambien hace set
	 * a la nueva cantidad si se hace el prestamo y si no hay libros  pone su estado en no disponible
	 */
	public String crearPrestamo(int fechaPrestamo, String titulo, String codigo, String codigoPrestamo, int fechaDevolucion,int valorPrestamo, int subTotal, Estudiante estudiante, Bibliotecario bibliotecario) {
		
		String mensaje = "Prestamo no creado";
		int cantidad1;
		int cantidad2;
		int cantidad3;
		int cantidadPrestamosBibliotecario1;
		int cantidadPrestamosBibliotecario2;
		double costoPrestamo1;
		double costoPrestamo2;
		
		
			if(prestamo1 == null) {
				if(libro1!= null) {
					if(libro1.getCantidadDisponible()==0) {
						libro1.setEstado("No disponible");
						mensaje="No hay libros disponibles";
					}else
					if(libro1.getTitulo().equals(titulo) && libro1.getCodigo().equals(codigo)) {
						prestamo1 = new Prestamo(fechaPrestamo, titulo, codigo, codigoPrestamo, fechaDevolucion, valorPrestamo, subTotal, estudiante1,  bibliotecario1);
						   cantidad1 = libro1.getCantidadDisponible()-1;
						   cantidadPrestamosBibliotecario1=+1;
						   costoPrestamo1=prestamo1.obtenerPrecioPrestamo(fechaPrestamo,fechaDevolucion);
						   libro1.setCantidadDisponible(cantidad1);
						   mensaje = "Prestamo creado con exito, quedan " +cantidad1+ " libros disponibles.";
						   Aplicacion.imprimir("El costo del prestamo es: " +costoPrestamo1+ " Pesos.");
					}
				}
					if(libro2!=null) {
						if(libro2.getCantidadDisponible()==0) {
							libro2.setEstado("No disponible");
							mensaje="No hay libros disponibles";
						}else
						if(libro2.getTitulo().equals(titulo) && libro2.getCodigo().equals(codigo)) {
							prestamo1 = new Prestamo(fechaPrestamo, titulo, codigo, codigoPrestamo, fechaDevolucion, valorPrestamo, subTotal, estudiante1,  bibliotecario1);
							cantidad2 = libro2.getCantidadDisponible()-1;
							   cantidadPrestamosBibliotecario1=+1;
							   costoPrestamo1=prestamo1.obtenerPrecioPrestamo(fechaPrestamo,fechaDevolucion);
							libro2.setCantidadDisponible(cantidad2);
							mensaje = "Prestamo creado con exito, quedan " +cantidad2+ " libros disponibles";
							Aplicacion.imprimir("El costo del prestamo es: " + costoPrestamo1 + " Pesos.");
						}
					}
					if(libro3!=null) {
						if(libro3.getCantidadDisponible()==0) {
							libro3.setEstado("No disponible");
							mensaje="No hay libros disponibles";
						}else
						if(libro3.getTitulo().equals(titulo) && libro3.getCodigo().equals(codigo)) {
							prestamo1 = new Prestamo(fechaPrestamo, titulo, codigo, codigoPrestamo, fechaDevolucion,valorPrestamo, subTotal, estudiante1,  bibliotecario1);
							cantidad3 = libro3.getCantidadDisponible()-1;
							   cantidadPrestamosBibliotecario1=+1;
							   costoPrestamo1=prestamo1.obtenerPrecioPrestamo(fechaPrestamo,fechaDevolucion);
							libro3.setCantidadDisponible(cantidad3);
							mensaje = "Prestamo creado con exito, quedan " +cantidad3+ " libros disponibles";
							Aplicacion.imprimir("El costo del prestamo es: " +costoPrestamo1+ " Pesos.");
						}
					}
				}else {
		
				
			if(prestamo2 == null) {
				if(libro1!= null) {
					if(libro1.getCantidadDisponible()==0) {
						libro1.setEstado("No disponible");
						mensaje="No hay libros disponibles";
					}else
					if(libro1.getTitulo().equals(titulo) && libro1.getCodigo().equals(codigo)) {
						   prestamo2= new Prestamo(fechaPrestamo, titulo, codigo, codigoPrestamo, fechaDevolucion, valorPrestamo, estudiante2,  bibliotecario2);
						   cantidad1 = libro1.getCantidadDisponible()-1;
						   cantidadPrestamosBibliotecario2=+1;
						   costoPrestamo2=prestamo2.obtenerPrecioPrestamo(fechaPrestamo,fechaDevolucion);
						   libro1.setCantidadDisponible(cantidad1);
						   mensaje = "Prestamo creado con exito, quedan " +cantidad1+ " libros disponibles";
						   Aplicacion.imprimir("El costo del prestamo es: " + costoPrestamo2 + " Pesos.");
					}
				}
						if(libro2!= null) {
							if(libro2.getCantidadDisponible()==0) {
								libro2.setEstado("No disponible");
								mensaje="No hay libros disponibles";
							}else
						if(libro2.getTitulo().equals(titulo) && libro2.getCodigo().equals(codigo)) {
							prestamo2= new Prestamo(fechaPrestamo, titulo, codigo, codigoPrestamo, fechaDevolucion, valorPrestamo, subTotal, estudiante2,  bibliotecario2);
							cantidad2 = libro2.getCantidadDisponible()-1;
							   cantidadPrestamosBibliotecario2=+1;
							   costoPrestamo2=prestamo2.obtenerPrecioPrestamo(fechaPrestamo,fechaDevolucion);
							libro2.setCantidadDisponible(cantidad2);
							mensaje = "Prestamo creado con exito, quedan " +cantidad2+ " libros disponibles";
							Aplicacion.imprimir("El costo del prestamo es: " + costoPrestamo2 + " Pesos.");
						}
					}
					if(libro3!=null){
						if(libro3.getCantidadDisponible()==0) {
							libro3.setEstado("No disponible");
							mensaje="No hay libros disponibles";
						}else
						if(libro3.getTitulo().equals(titulo) && libro3.getCodigo().equals(codigo)) {
							prestamo2= new Prestamo(fechaPrestamo, titulo, codigo, codigoPrestamo, fechaDevolucion, valorPrestamo, subTotal, estudiante2,  bibliotecario2);
							cantidad3 = libro3.getCantidadDisponible()-1;
							   cantidadPrestamosBibliotecario2=+1;
							   costoPrestamo2=prestamo2.obtenerPrecioPrestamo(fechaPrestamo,fechaDevolucion);
							libro3.setCantidadDisponible(cantidad3);
							mensaje = "Prestamo creado con exito, quedan " +cantidad3+ " libros disponibles";
							Aplicacion.imprimir("El costo del prestamo es: " + costoPrestamo2 + " Pesos.");
						}
					}
				}
			}
	
		return mensaje;
	}
	
	/**
	 * Metodo para consultar los datos de un prestamo dado su codigo
	 * @param codigoPrestamo
	 * @return retorna los datos del prestamo consultado
	 */
	public Prestamo consultarDatosPrestamo(String codigoPrestamo) {
		
		Prestamo prestamoEncontrado = null;
		if(prestamo1 != null) {
			if(prestamo1.getCodigoPrestamo().equals(codigoPrestamo)) {
				prestamoEncontrado = prestamo1;
			}
		}
		if(prestamoEncontrado == null && prestamo2 != null ) {
			if(prestamo2.getCodigoPrestamo().equals(codigoPrestamo)) {
				prestamoEncontrado = prestamo2;
			}
		}
	
		return prestamoEncontrado;
		
	}
	
	
	/**
	 * Consulta en cuantos prestamos esta un libro
	 * @param codigo
	 * @return mensaje con explicito con la cantidad de prestamos en la que esta un libro
	 */
	public String consultarLibroEnPrestamos(String codigo) {
		
		String mensaje="No esta en ningun prestamo";
		
		if(prestamo1!=null) {
			if(codigo.equals(prestamo1.getCodigo())) {
			mensaje="El libro esta en un prestamo";
			}
		}
		
		if(prestamo2!=null) {
			if(codigo.equals(prestamo2.getCodigo())){
			mensaje="El libro esta en un prestamo";
			}
		} 
				if(codigo.equals(prestamo1.getCodigo()) && codigo.equals(prestamo2.getCodigo())){
					mensaje="El libro esta en dos prestamos";
				
		}
		
	
		return mensaje;

	}
	
	
	/**
	 * Actualiza un libro y dice que libro se actualizo
	 * @param codigo
	 * @param isbn
	 * @param titulo
	 * @param autor
	 * @param numeroPaginas
	 * @param editorial
	 * @param estado
	 * @param fechaPublicacion
	 * @param cantidadDisponible
	 * @return mensaje de si se actualizo o no, tambien dice que  libro se actualizo. Se actualiza un libro con nuevos valores
	 */
	public String actualizarLibro(String codigo, String isbn, String titulo, String autor, int numeroPaginas, String editorial,
			String estado, String fechaPublicacion, int cantidadDisponible) {
		
		String mensaje = "Libro no actualizado";
		Libro libroEncontrado = null;
        
		libroEncontrado = consultarLibro(codigo);
		if (codigo.equals(libro1.getCodigo())){
		if(libroEncontrado != null) {
			libroEncontrado.setAutor(autor);
			libroEncontrado.setEditorial(editorial);;
			libroEncontrado.setEstado(estado);
			libroEncontrado.setFechaPublicacion(fechaPublicacion);
			libroEncontrado.setIsbn(isbn);
			libroEncontrado.setNumeroPaginas(numeroPaginas);
			libroEncontrado.setTitulo(titulo);
			libroEncontrado.setCantidadDisponible(cantidadDisponible);
			mensaje = "Se actualizo el libro 1";
		}
		}
		else {
	    if (codigo.equals(libro2.getCodigo())){
				if(libroEncontrado != null) {
					libroEncontrado.setAutor(autor);
					libroEncontrado.setEditorial(editorial);;
					libroEncontrado.setEstado(estado);
					libroEncontrado.setFechaPublicacion(fechaPublicacion);
					libroEncontrado.setIsbn(isbn);
					libroEncontrado.setNumeroPaginas(numeroPaginas);
					libroEncontrado.setTitulo(titulo);
					libroEncontrado.setCantidadDisponible(cantidadDisponible);
					mensaje = "Se actualizo el libro 2";
				}
		    }else 
		    	if (codigo.equals(libro3.getCodigo())){
				if(libroEncontrado != null) {
					libroEncontrado.setAutor(autor);
					libroEncontrado.setEditorial(editorial);;
					libroEncontrado.setEstado(estado);
					libroEncontrado.setFechaPublicacion(fechaPublicacion);
					libroEncontrado.setIsbn(isbn);
					libroEncontrado.setNumeroPaginas(numeroPaginas);
					libroEncontrado.setTitulo(titulo);
					libroEncontrado.setCantidadDisponible(cantidadDisponible);
					mensaje = "Se actualizo el libro 3";
				}
		    	
		    }
		    	
		}
		return mensaje;
	}
	
	/**
	 * consulta los prestamos hechos por cada empleado segun la identificacion
	 * @param identificacionBibliotecario
	 * @return un entero con la cantidad de prestamos
	 */
	public int consultarCantidadPrestamosEmpleados(String identificacionBibliotecario) {
		
		int cantidadPrestamos = 0;
		
		if(prestamo1.getBibliotecario().getIdentificacion().equals(identificacionBibliotecario)) {
			cantidadPrestamos=+1;
		}else
		{
			if(prestamo2.getBibliotecario().getIdentificacion().equals(identificacionBibliotecario)) {
				cantidadPrestamos=+1;
			}
		}
		
		return cantidadPrestamos;
	}
	
	/**
	 * Metodo que permite consultar los prestamos realizados por un estudiante
	 * @param identificacionEstudiante
	 * @return retorna la cantidad de prestamos hechos por el estudiante a consultar
	 */
	public int consultarCantidadPrestamosEstudiante(String identificacionEstudiante) {
		
		int cantidadPrestamos = 0;
		
		if(prestamo1.getEstudiante().getIdentificacion().equals(identificacionEstudiante)) {
			cantidadPrestamos=+1;
		}else
		{
			if(prestamo2.getEstudiante().getIdentificacion().equals(identificacionEstudiante)) {
				cantidadPrestamos=+1;
			}
		}
		
		return cantidadPrestamos;
	}
	
	/**
	 * Metodo que permite ver el estudiante con mas prestamos
	 * @return el estudiante con mas prestamos con su cantidad o si hay igualados
	 */
	public String estudianteMasPrestamos() {
		
		int cantidadPrestamosEstudiante1=0;
		int cantidadPrestamosEstudiante2=0;
		String mensaje;
		
		if(estudiante1!=null) {
			cantidadPrestamosEstudiante1=consultarCantidadPrestamosEstudiante(estudiante1.getIdentificacion());
		}
		
		if(estudiante2!=null) {
			cantidadPrestamosEstudiante2=consultarCantidadPrestamosEstudiante(estudiante2.getIdentificacion());
		}
		
		if(cantidadPrestamosEstudiante1==cantidadPrestamosEstudiante2) {
			mensaje="El estudiante uno y dos tienen igual cantidad de prestamos. ";
		}else {
			
		if(cantidadPrestamosEstudiante1>cantidadPrestamosEstudiante2) {
			mensaje="El estudiante con mas prestamos es el estudiante numero 1 con: " +cantidadPrestamosEstudiante1+ " Prestamos ";
		}else
		{
			mensaje="El estudiante con mas prestamos es el estudiante numero 2 con: " +cantidadPrestamosEstudiante2+ "Prestamos";
		}
		}
		
		
		return mensaje;
		
		}
	
	/**
	 * Metodo que calcula la recaudacion total de la empresa
	 *  @return el total de recaudaciones en double
	 */
	public double recaudacionTotalEmpresa() {
		
		double totalRecaudacion;
		double costoPrestamo1 = 0;
		double costoPrestamo2 = 0;
		int fechaPrestamo1;
		int fechaPrestamo2;
		int fechaDevolucion1;
		int fechaDevolucion2;
		
		if(prestamo1!=null) {
			fechaPrestamo1=prestamo1.getFechaPrestamo();
			fechaDevolucion1=prestamo1.getFechaDevolucion();
			costoPrestamo1=prestamo1.obtenerPrecioPrestamo(fechaPrestamo1,fechaDevolucion1);
		}
		
		if(prestamo2!=null) {
			fechaPrestamo2=prestamo2.getFechaPrestamo();
			fechaDevolucion2=prestamo2.getFechaDevolucion();
			costoPrestamo2=prestamo1.obtenerPrecioPrestamo(fechaPrestamo2,fechaDevolucion2);
		}
		
		totalRecaudacion=costoPrestamo1+costoPrestamo2;
		
		return totalRecaudacion;
	}
	
	/**
	 * Permite calcular la paga a cada empleado con sus bonus si los tiene
	 * @param identificacion
	 * @param antiguedadAnios
	 * @return el total a pagar a cada bibliotecario mas sus bonus
	 */
	public double pagarEmpleados(String identificacion, int antiguedadAnios) {
		
		double totalPagarBibliotecario;
		double totalPagarBibliotecario2;
		double totalPagarBibliotecarioF1 = 0;
		double totalPagarBibliotecarioF2 = 0;
		double calcularBonificacion;
		int fechaPrestamo1;
		int fechaPrestamo2;
		int fechaDevolucion1;
		int fechaDevolucion2;
		
		if(bibliotecario1!=null) {
			if(bibliotecario1.getIdentificacion().equals(identificacion)) {
			fechaPrestamo1=prestamo1.getFechaPrestamo();
			fechaDevolucion1=prestamo1.getFechaDevolucion();
			totalPagarBibliotecario=prestamo1.obtenerPrecioPrestamo(fechaPrestamo1,fechaDevolucion1);
			totalPagarBibliotecarioF1=(20*totalPagarBibliotecario)/100;
				if(antiguedadAnios>0) {
					calcularBonificacion=((2*totalPagarBibliotecarioF1)/100)*antiguedadAnios;
					totalPagarBibliotecarioF2=calcularBonificacion+totalPagarBibliotecarioF1;
				}
			}
		}else
			if(bibliotecario2!=null){
				if(bibliotecario2.getIdentificacion().equals(identificacion)) {
					fechaPrestamo2=prestamo2.getFechaPrestamo();
					fechaDevolucion2=prestamo2.getFechaDevolucion();
					totalPagarBibliotecario2=prestamo2.obtenerPrecioPrestamo(fechaPrestamo2,fechaDevolucion2);
					totalPagarBibliotecarioF1=(20*totalPagarBibliotecario2)/100;
						if(antiguedadAnios>0) {
							calcularBonificacion=((2*totalPagarBibliotecarioF1)/100)*antiguedadAnios;
							totalPagarBibliotecarioF2=calcularBonificacion+totalPagarBibliotecarioF1;
					}
				}
			}
		
			return totalPagarBibliotecarioF2;
		}
		
	}
	
	

