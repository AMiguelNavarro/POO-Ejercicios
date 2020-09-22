package Ejercicio4;

import java.util.Scanner;

/*
 * Crear una Clase Fecha en Java. La clase tendr� tres atributos privados dia, mes y a�o de tipo int. La clase contendr� los siguientes m�todos:
Constructor por defecto.
Constructor con tres par�metros para crear objetos con valores iniciales.
M�todos set y get para asignar y obtener los valores de los atributos de la clase.
M�todo fechaCorrecta() que comprueba si la fecha es correcta. Devuelve un valor de tipo boolean indicando si la fecha es correcta o no. 
Este m�todo a su vez utilizar� un m�todo privado de la clase llamado esBisiesto que calcula si el a�o es o no bisiesto. El m�todo esBisiesto devuelve true 
si el a�o es bisiesto y false si no lo es.
M�todo diaSiguiente() que cambia la fecha actual por la del d�a siguiente. El objeto de la clase Fecha al que se le aplique este m�todo deber� quedar siempre en 
un estado consistente, es decir, la nueva fecha deber� ser correcta.
Modificar el m�todo toString() heredado de Object para mostrar las fechas de la forma dd-mm-aaaa. El d�a y el mes se deben mostrar con dos cifras. Si el dia o el mes 
tienen solo una cifra se escribir� un cero delante. Por ejemplo si la fecha es dia=1, mes=6, a�o= 2015 la fecha que se mostrar� ser�: 01-06-2015
Escribe un programa para probar la clase Fecha. El m�todo diaSiguiete() pru�balo dentro de un bucle que imprima la fecha durante cada iteraci�n del bucle.
 * */

public class Main {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
        int d, m, a;

        //Se pide por teclado el dia, mes y a�o
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("a�o: ");
        a = sc.nextInt();

        //Se crea un objeto Fecha utilizando el consructor con par�metros
        Fecha fecha = new Fecha(d,m,a);

        if (fecha.fechaCorrecta()) { //si la fecha es correcta

           //Se muestra utilizando el m�todo toString()
            System.out.println("Fecha introducida: " + fecha);

            //Se muestran los 10 d�as siguientes utilizando el m�todo diaSiguiente()                              
            System.out.println("Los 10 d�as siguientes son:");
            for (int i = 1; i <= 10; i++) {
                fecha.diaSiguiente();
                System.out.println(fecha);
            }

        } else { //Si la fecha no es correcta
            System.out.println("Fecha no valida");
        }
        
        sc.close();
    }
		
}

