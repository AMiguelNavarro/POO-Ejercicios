package Ejercicio4;

import java.util.Scanner;

/*
 * Crear una Clase Fecha en Java. La clase tendrá tres atributos privados dia, mes y año de tipo int. La clase contendrá los siguientes métodos:
Constructor por defecto.
Constructor con tres parámetros para crear objetos con valores iniciales.
Métodos set y get para asignar y obtener los valores de los atributos de la clase.
Método fechaCorrecta() que comprueba si la fecha es correcta. Devuelve un valor de tipo boolean indicando si la fecha es correcta o no. 
Este método a su vez utilizará un método privado de la clase llamado esBisiesto que calcula si el año es o no bisiesto. El método esBisiesto devuelve true 
si el año es bisiesto y false si no lo es.
Método diaSiguiente() que cambia la fecha actual por la del día siguiente. El objeto de la clase Fecha al que se le aplique este método deberá quedar siempre en 
un estado consistente, es decir, la nueva fecha deberá ser correcta.
Modificar el método toString() heredado de Object para mostrar las fechas de la forma dd-mm-aaaa. El día y el mes se deben mostrar con dos cifras. Si el dia o el mes 
tienen solo una cifra se escribirá un cero delante. Por ejemplo si la fecha es dia=1, mes=6, año= 2015 la fecha que se mostrará será: 01-06-2015
Escribe un programa para probar la clase Fecha. El método diaSiguiete() pruébalo dentro de un bucle que imprima la fecha durante cada iteración del bucle.
 * */

public class Main {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
        int d, m, a;

        //Se pide por teclado el dia, mes y año
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("año: ");
        a = sc.nextInt();

        //Se crea un objeto Fecha utilizando el consructor con parámetros
        Fecha fecha = new Fecha(d,m,a);

        if (fecha.fechaCorrecta()) { //si la fecha es correcta

           //Se muestra utilizando el método toString()
            System.out.println("Fecha introducida: " + fecha);

            //Se muestran los 10 días siguientes utilizando el método diaSiguiente()                              
            System.out.println("Los 10 días siguientes son:");
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

