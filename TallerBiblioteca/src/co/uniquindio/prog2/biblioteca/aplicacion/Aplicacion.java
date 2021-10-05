package co.uniquindio.prog2.biblioteca.aplicacion;

import javax.swing.JOptionPane;

import co.uniquindio.prog2.biblioteca.model.Biblioteca;
import co.uniquindio.prog2.biblioteca.model.Bibliotecario;
import co.uniquindio.prog2.biblioteca.model.Estudiante;
import co.uniquindio.prog2.biblioteca.model.Libro;
import co.uniquindio.prog2.biblioteca.model.Prestamo;

public class Aplicacion {

	public static void main(String[] args) {

		int opcion = 0;
		int opcion1 = 0;

		// biblioteca
		String nombreBiblioteca = "";
		String direccionBiblioteca = "";
		Biblioteca biblioteca = null;

		// variables libros
		String codigo;
		String isbn;
		String titulo;
		String autor;
		int numeroPaginas;
		String editorial;
		String estado;
		String fechaPublicacion;
		int cantidadDisponible;

		// variables estudiante
		String nombreEstudiante;
		String identificacionEstudiante;
		String direccionEstudiante;
		String telefonoEstudiante;

		Estudiante estudiante = null;

		// variables bibliotecario
		Bibliotecario bibliotecario = null;
		String nombreBibliotecario;
		String identificacionBibliotecario;
		String direccionBibliotecario;
		String telefonoBibliotecario;
		int    añosDeServicioBibliotecario;

		// variables prestamo
		int fechaPrestamo;
		int fechaDevolucion;
		String codigoPrestamo;

		String mensaje = "";
		boolean resultado = false;

		imprimir("Bienvenidos a la aplicacion Biblioteca");

		nombreBiblioteca = leerStringVentana("Ingrese el nombre de la biblioteca");
		direccionBiblioteca = leerStringVentana("Ingrese la direccion de la biblioteca");
		biblioteca = new Biblioteca(nombreBiblioteca, direccionBiblioteca);

		do {
			opcion = mostrarMenu();

			switch (opcion) {

			case 1:
				// crear estudiante
				nombreEstudiante = leerStringVentana("Ingrese el nombre del estudiante");
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante\"");
				direccionEstudiante = leerStringVentana("\"Ingrese la direccion del estudiante\"");
				telefonoEstudiante = leerStringVentana("\"Ingrese el telefono del estudiante\"");

				resultado = validarInformacionEstudianteYBibliotecario(nombreEstudiante, identificacionEstudiante,
						direccionEstudiante, telefonoEstudiante);
				if (resultado) {
					mensaje = biblioteca.crearEstudiante(nombreEstudiante, identificacionEstudiante,
							direccionEstudiante, telefonoEstudiante);
					imprimir(mensaje);
				} else {
					imprimirError(mensaje);
				}
				break;

			case 2:
				// crear bibliotecario
				nombreBibliotecario = leerStringVentana("Ingrese el nombre del bibliotecario");
				identificacionBibliotecario = leerStringVentana("\"Ingrese la identificacion del bibliotecario\"");
				direccionBibliotecario = leerStringVentana("\"Ingrese la direccion del bibliotecario\"");
				telefonoBibliotecario = leerStringVentana("\"Ingrese el telefono del bibliotecario\"");
				añosDeServicioBibliotecario = leerEnteroVentana("\"Ingrese los años de servicio del bibliotecario\"");

				resultado = validarInformacionEstudianteYBibliotecario(nombreBibliotecario, identificacionBibliotecario,
						direccionBibliotecario, telefonoBibliotecario);
				if (resultado) {
					mensaje = biblioteca.crearBibliotecario(nombreBibliotecario, identificacionBibliotecario,
							direccionBibliotecario, telefonoBibliotecario);
					imprimir(mensaje);
				} else {
					imprimirError(mensaje);
				}
				break;

			case 3:
				// identificacion estudiante
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante\"");
				if (resultado) {
					estudiante = biblioteca.consultarEstudiante(identificacionEstudiante);
					imprimir(estudiante.toString());
				} else {
					imprimirError(mensaje);
				}

				break;

			case 4:
				// Eliminar estudiante
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante\"");
				if (resultado) {
					mensaje = biblioteca.eliminarEstudiante(identificacionEstudiante);
					imprimir(mensaje);
				} else {
					imprimirError(mensaje);
				}
				break;

			case 5:
				// Actualizar estudiante
				identificacionEstudiante = leerStringVentana("\"Ingrese la identificacion del estudiante\"");

				if (resultado) {
					nombreEstudiante = leerStringVentana("Ingrese el nuevo nombre del estudiante en caso de cambio");
					direccionEstudiante = leerStringVentana(
							"\"Ingrese la nueva direccion del estudiante en caso de cambio\"");
					telefonoEstudiante = leerStringVentana("\"Ingrese el telefono del estudiante en caso de cambio\"");
					mensaje = biblioteca.actualizarEstudiante(nombreEstudiante, identificacionEstudiante,
							direccionEstudiante, telefonoEstudiante);
					imprimir(mensaje);
				} else {
					imprimirError(mensaje);
				}
				break;

			case 6:
				// Prestamos realizados por cada empleado
				identificacionBibliotecario = leerStringVentana("\"Ingrese la identificacion del bibliotecario\"");
				int cantidad;
				if (resultado) {
					cantidad = biblioteca.consultarCantidadPrestamosEmpleados(identificacionBibliotecario);
					imprimir("La cantidad de prestamos realizados por este empleado es " + cantidad);
				} else {
					imprimirError(mensaje);
				}
				break;

			case 7:
				// Estudiante con mas prestamos
				String cantidadPrestamos;
				if (resultado) {
					cantidadPrestamos = biblioteca.estudianteMasPrestamos();
					imprimir(cantidadPrestamos);
				}

				break;

			case 8:
				// Ganancias totales de la empresa
				double gananciasTotales;
				if (resultado) {
					gananciasTotales = biblioteca.recaudacionTotalEmpresa();
					imprimir("Las ganancias totales son " + gananciasTotales + " pesos.");
				}

				break;

			case 9:
				// libros (HACER CRUD)
				do {
					opcion1 = mostrarMenuLibros();
					switch (opcion1) {

					case 1:
						// crear libro

						codigo = leerStringVentana("Ingrese el codigo del libro");
						isbn = leerStringVentana("\"Ingrese la identificacion del libro\"");
						titulo = leerStringVentana("\"Ingrese el titulo del libro\"");
						autor = leerStringVentana("\"Ingrese el autor del libro\"");
						numeroPaginas = leerEnteroVentana("\"Ingrese el numero de paginas del libro\"");
						editorial = leerStringVentana("\"Ingrese la editorial del libro\"");
						estado = leerStringVentana("\"Ingrese el estado del libro\"");
						fechaPublicacion = leerStringVentana("\"Ingrese la fecha de publicacion del libro dd/mm/aa\"");
						cantidadDisponible = leerEnteroVentana("\"Ingrese la cantidad de libros disponibles\"");

						resultado = validarInformacionLibro(codigo, isbn, titulo, autor, cantidadDisponible);
						if (resultado) {
							mensaje = biblioteca.crearLibro(codigo, isbn, titulo, autor, numeroPaginas, editorial,
									estado, fechaPublicacion, cantidadDisponible);
							imprimir(mensaje);
						} else {
							imprimirError(mensaje);
						}
						break;

					case 2:
						// consultar libro
						codigo = leerStringVentana("\"Ingrese el codigo del libro\"");
						if (resultado) {
							Libro libro = biblioteca.consultarLibro(codigo);
							imprimir(libro.toString());
						} else {
							imprimirError(mensaje);
						}

						break;

					case 3:
						// actualizar libro
						codigo = leerStringVentana("\"Ingrese el codigo del libro\"");

						if (resultado) {
							isbn = leerStringVentana("\"Ingrese el nuevo isbn del libro\"");
							titulo = leerStringVentana("\"Ingrese el nuevo titulo del libro en caso de cambio\"");
							autor = leerStringVentana("\"Ingrese el nuevo autor del libro en caso de cambio\"");
							numeroPaginas = leerEnteroVentana(
									"\"Ingrese el nuevo numero de paginas del libro en caso de cambio\"");
							editorial = leerStringVentana("\"Ingrese la nueva editorial del libro en caso de cambio\"");
							estado = leerStringVentana("\"Ingrese el nuevo estado del libro en caso de cambio\"");
							fechaPublicacion = leerStringVentana(
									"\"Ingrese la nueva fecha de publicacion del libro en caso de cambio\"");
							cantidadDisponible = leerEnteroVentana(
									"\"Ingrese la nueva cantidad del libro en caso de cambio\"");

							mensaje = biblioteca.actualizarLibro(codigo, isbn, titulo, autor, numeroPaginas, editorial,
									estado, fechaPublicacion, cantidadDisponible);
							imprimir(mensaje);
						} else {
							imprimirError(mensaje);
						}

						break;

					case 4:
						// Hacer prestamo
						imprimir("Advertencia: Solo puede hacer un prestamo de maximo un mes");
						fechaPrestamo = leerEnteroVentana("\"Ingrese el dia del prestamo dd\"");
						titulo = leerStringVentana("\"Ingrese el titulo del libro\"");
						codigo = leerStringVentana("\"Ingrese el codigo del libro\"");
						codigoPrestamo = leerStringVentana("\"Ingrese el codigo del Prestamo\"");
						fechaDevolucion = leerEnteroVentana("\"Ingrese la fecha de devolucion dd\"");

						resultado = validarInformacionPrestamo(titulo, codigo, codigoPrestamo);
						if (resultado) {
							mensaje = biblioteca.crearPrestamo(fechaPrestamo, titulo, codigo, codigoPrestamo,
									fechaDevolucion, estudiante, bibliotecario);
							imprimir(mensaje);
						} else {
							imprimirError(mensaje);
						}

						break;

					case 5:
						// consultarLibroEnPrestamos
						codigo = leerStringVentana("\"Ingrese el codigo del Libro\"");

						resultado = validarInformacionConsultarPresta(codigo);
						if (resultado) {
							mensaje = biblioteca.consultarLibroEnPrestamos(codigo);
							imprimir(mensaje);
						} else {
							imprimirError(mensaje);
						}

					case 6:
						// consultarDatosPrestamo
						codigo = leerStringVentana("\"Ingrese el codigo del Prestamo\"");

						if (resultado) {
							Prestamo prestamo = biblioteca.consultarDatosPrestamo(codigo);
							imprimir(prestamo.toString());
						} else {
							imprimirError(mensaje);

						}

					default:
						break;
					}
				} while (opcion1 != 7);

				break;

			}
		} while (opcion != 10);

	}

	/**
	 * Permite imprimir un mensaje
	 * 
	 * @param mensaje El mensaje a imprimir
	 */
	public static void imprimir(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje);
	}

	public static String leerStringVentana(String mensaje) {
		String respuesta = "";
		respuesta = JOptionPane.showInputDialog(mensaje);
		return respuesta;

	}
	
	 //metodo para validar la informacion del estudiante y el bibliotecario
	private static boolean validarInformacionEstudianteYBibliotecario(String nombre, String identificacion,
			String direccion, String telefono) {

		boolean valido = true;
		if (nombre.equalsIgnoreCase("") || identificacion.equalsIgnoreCase("") || direccion.equalsIgnoreCase("")
				|| telefono.equalsIgnoreCase("")) {
			valido = false;
		}

		if (!isNumeric(telefono)) {
			valido = false;
		}
		return valido;
	}
	//metodo para validar la informacion del libro

	private static boolean validarInformacionLibro(String codigo, String isbn, String titulo, String autor,
			int cantidadDisponible) {

		boolean valido = true;
		if (codigo.equalsIgnoreCase("") || isbn.equalsIgnoreCase("") || titulo.equalsIgnoreCase("")
				|| autor.equalsIgnoreCase("")) {
			valido = false;
		}

		if (!isNumeric2(codigo, isbn)) {
			valido = false;
		}

		return valido;
	}
	//metodo para validar la informacion del prestamo

	private static boolean validarInformacionPrestamo(String titulo, String codigo, String codigoPrestamo) {

		boolean valido = true;
		if (titulo.equalsIgnoreCase("") || codigo.equalsIgnoreCase("") || codigoPrestamo.equalsIgnoreCase("")) {
			valido = false;
		}

		if (!isNumeric2(codigo, codigoPrestamo)) {
			valido = false;
		}

		return valido;
	}
	//permite validar la informacion de consulta

	private static boolean validarInformacionConsultarPresta(String codigo) {

		boolean valido = true;
		if (codigo.equalsIgnoreCase("")) {
			valido = false;
		}

		if (!isNumeric(codigo)) {
			valido = false;
		}

		return valido;
	}

	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	private static boolean isNumeric2(String cadena, String cadena2) {
		try {
			Integer.parseInt(cadena);
			Integer.parseInt(cadena2);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	//imprime error si los datos no son los correctos

	private static void imprimirError(String mensaje) {
		JOptionPane.showInputDialog(null, "Por favor ingresar datos validos", "Error!", JOptionPane.ERROR_MESSAGE);

	}
	//muestra el menu

	private static int mostrarMenu() {
		int opcion = 0;
		String menu = "Seleccione la opcion que desea realizar :\n" + " Opciones Estudiantes y Bibliotecario\n"
				+ "1 Crear un Estudiante\n" + "2 Crear un Bibliotecario\n" + "3 Consultar un Estudiante\n"
				+ "4 Eliminar un Estudiante\n" + "5 Actualizar un Estudiante\n"
				+ "6 Consultar prestamos de los bibliotecarios\n" + "7 Consultar estudiante con mas prestamos\n"
				+ "8 Consultar ganancia total de la empresa\n" + "9 Opciones Libros y Prestamos\n\n" + "10 Salir\n";

		opcion = leerEnteroVentana(menu);
		return opcion;
	}

	private static int mostrarMenuLibros() {
		int opcion = 0;
		String menu = "Seleccione la opcion que desea realizar :\n" + " Opciones Libros y Prestamos\n"
				+ "1 Crear libro\n" + "2 Consultar un libro por codigo\n" + "3 Actualizar libro\n"
				+ "4 Hacer un prestamo\n" + "5 Consultar libros en prestamos\n" + "6 Consultar Datos Prestamo\n\n"
				+ "7 Salir\n";

		opcion = leerEnteroVentana(menu);
		return opcion;
	}

	/**
	 * Permite leer un numero entero mediante una caja de dialogo
	 * 
	 * @param mensaje El mensaje que verï¿½ el usuario
	 * @return el numero ingresado por el usuario
	 */
	public static int leerEnteroVentana(String mensaje) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return dato;
	}

}
