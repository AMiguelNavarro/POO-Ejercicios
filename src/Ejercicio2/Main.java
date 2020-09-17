package Ejercicio2;

/*
 * Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, 
 * número de ejemplares del libro y número de ejemplares prestados. La clase contendrá los siguientes métodos:
		Constructor por defecto.
		Constructor con parámetros.
		Métodos Setters/getters
		Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. 
			No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar 
			la operación y false en caso contrario.
		Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. 
			No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
		Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
	Escribe un programa para probar el funcionamiento de la clase Libro.
*/
public class Main {
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("La Red Púrpura", "Carmen Mola", 5, 0);
		Libro libro2 = new Libro("La Nena", "Carmen Mola", 1, 0);
		
		libro1.prestamo();
		System.out.println(libro1);
		
		libro2.prestamo();
		System.out.println(libro2);
		
		if (libro2.prestamo()==true) {
			System.out.println("Se ha prestado el libro " +libro2.getTitulo());
		} else {
			System.out.println("No quedan ejemplares, por lo que no se puede prestar el libro " +libro2.getTitulo());
		}
		
	}

}
