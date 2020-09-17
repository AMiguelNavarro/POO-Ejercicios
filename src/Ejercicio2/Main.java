package Ejercicio2;

/*
 * Crea una clase llamada Libro que guarde la informaci�n de cada uno de los libros de una biblioteca. La clase debe guardar el t�tulo del libro, autor, 
 * n�mero de ejemplares del libro y n�mero de ejemplares prestados. La clase contendr� los siguientes m�todos:
		Constructor por defecto.
		Constructor con par�metros.
		M�todos Setters/getters
		M�todo pr�stamo que incremente el atributo correspondiente cada vez que se realice un pr�stamo del libro. 
			No se podr�n prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar 
			la operaci�n y false en caso contrario.
		M�todo devoluci�n que decremente el atributo correspondiente cuando se produzca la devoluci�n de un libro. 
			No se podr�n devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operaci�n y false en caso contrario.
		M�todo toString para mostrar los datos de los libros. Este m�todo se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
	Escribe un programa para probar el funcionamiento de la clase Libro.
*/
public class Main {
	
	public static void main(String[] args) {
		
		Libro libro1 = new Libro("La Red P�rpura", "Carmen Mola", 5, 0);
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
