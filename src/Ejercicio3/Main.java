package Ejercicio3;

/*
 * Escribe una clase Complejo que modele el comportamiento de los n�meros complejos.
Un n�mero complejo, es una entidad matem�tica que viene dada por un par de n�meros reales, el primero a se denomina la parte real y al segundo b la parte imaginaria.
Se representa escribiendo las dos partes del n�mero entre par�ntesis (a, b) o tambi�n de la forma a + bi.
La i se denomina unidad imaginaria, representa la ra�z cuadrada de -1.
La clase Complejo tendr� dos datos privados de tipo double: parte real y parte imaginaria.
La clase Complejo contendr� un constructor por defecto que inicializar� a 0 los atributos y un constructor con dos par�metros correspondientes a los valores de la parte 
real e imaginaria a asignar al nuevo objeto.
Contendr�, adem�s de los setters y getters, los siguientes m�todos:
sumar para sumar dos n�meros complejos.
(a, b) + (c, d) = (a + c, b + d);
restar para restar dos n�meros complejos.
(a, b) - (c, d) = (a - c, b - d);
multiplicar para multiplicar dos n�meros complejos:
(a, b) * (c, d) = (a*c � b*d, a*d + b*c)
multiplicar para multiplicar un n�mero complejo por un n�mero double:
(a, b) * n = (a * n, b * n)
dividir para dividir dos n�meros complejos:
(a, b) / (c, d) = ((a*c + b*d) / (c2 + d2) , (b*c � a*d) / (c2 + d2))
Todos los m�todos anteriores devuelven el objeto n�mero complejo resultado de la operaci�n.
La clase contendr� adem�s un m�todo toString para mostrar el n�mero complejo de la siguiente forma: (parte real, parte imaginaria) y un m�todo equals que compruebe 
si dos n�meros complejos son iguales o no.
Una vez creada la clase, escribe un programa para probar la clase.
 * */

public class Main {
	
	public static void main (String[] args) {
        // declaraci�n de n�meros complejos
        Complejo c1 = new Complejo(1.0, 1.0);
        Complejo c2 = new Complejo(2.0, 2.0);
        Complejo c3;
        Complejo c4 = new Complejo(2.0, 2.0);
        // operadores aritm�ticos
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
