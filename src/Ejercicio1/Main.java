package Ejercicio1;

/*
 * Crea una clase llamada Contador que contenga un �nico atributo entero llamado cont.
La clase tendr� los siguientes constructores:
Constructor por defecto
Constructor con par�metros para inicializar el contador con un valor no negativo. Si el valor inicial que se recibe es negativo el contador tomar� el valor cero como valor inicial.
Constructor copia.
Adem�s de los m�todos getter y setter, la clase contendr� los m�todos:
incrementar: incrementa el contador en una unidad.
decrementar: decrementa el contador en una unidad. El contador nunca podr� tener un valor negativo. Si al decrementar se alcanza un valor negativo el contador toma el valor cero.
Una vez creada la clase, escribe un m�todo main para probar la clase. 
 * */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contador cont1 = new Contador(0);
		System.out.println(cont1.getCont());
		
		cont1.incrementarContador();
		System.out.println(cont1.getCont());
		
		cont1.decrementarContador();
		System.out.println(cont1.getCont());
		
		cont1.decrementarContador();
		System.out.println(cont1.getCont());

	}

}
