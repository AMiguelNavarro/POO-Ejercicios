package Ejercicio3;

/*
 * Escribe una clase Complejo que modele el comportamiento de los números complejos.
Un número complejo, es una entidad matemática que viene dada por un par de números reales, el primero a se denomina la parte real y al segundo b la parte imaginaria.
Se representa escribiendo las dos partes del número entre paréntesis (a, b) o también de la forma a + bi.
La i se denomina unidad imaginaria, representa la raíz cuadrada de -1.
La clase Complejo tendrá dos datos privados de tipo double: parte real y parte imaginaria.
La clase Complejo contendrá un constructor por defecto que inicializará a 0 los atributos y un constructor con dos parámetros correspondientes a los valores de la parte 
real e imaginaria a asignar al nuevo objeto.
Contendrá, además de los setters y getters, los siguientes métodos:
sumar para sumar dos números complejos.
(a, b) + (c, d) = (a + c, b + d);
restar para restar dos números complejos.
(a, b) - (c, d) = (a - c, b - d);
multiplicar para multiplicar dos números complejos:
(a, b) * (c, d) = (a*c – b*d, a*d + b*c)
multiplicar para multiplicar un número complejo por un número double:
(a, b) * n = (a * n, b * n)
dividir para dividir dos números complejos:
(a, b) / (c, d) = ((a*c + b*d) / (c2 + d2) , (b*c – a*d) / (c2 + d2))
Todos los métodos anteriores devuelven el objeto número complejo resultado de la operación.
La clase contendrá además un método toString para mostrar el número complejo de la siguiente forma: (parte real, parte imaginaria) y un método equals que compruebe 
si dos números complejos son iguales o no.
Una vez creada la clase, escribe un programa para probar la clase.
 * */

public class Main {
	
	public static void main (String[] args) {
        // declaración de números complejos
        Complejo c1 = new Complejo(1.0, 1.0);
        Complejo c2 = new Complejo(2.0, 2.0);
        Complejo c3;
        Complejo c4 = new Complejo(2.0, 2.0);
        // operadores aritméticos
        c3 = c1.sumar(c2);
        System.out.println(c1 + " + " + c2 + " = " + c3);
        c3 = c1.restar(c2);
        System.out.println(c1 + " - " + c2 + " = " + c3);
        c3 = c1.dividir(c2);
        System.out.println(c1 + " / " + c2 + " = " + c3);
        c3 = c1.multiplicarComplejos(c2);
        System.out.println(c1 + " * " + c2 + " = " + c3);
        c3 = c1.multiplicarDouble(3.5);
        System.out.println(c1 + " * 3.5 = " + c3);
        if (c2.equals(c4)) {
            System.out.println(c2 + " igual que " + c4);
        } else {
            System.out.println(c2 + " distinto que " + c4);
        }
	}

}
