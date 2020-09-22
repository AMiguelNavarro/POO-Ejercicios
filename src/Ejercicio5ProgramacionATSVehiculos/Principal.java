package Ejercicio5ProgramacionATSVehiculos;

import java.util.Scanner;

/*
 * Construir un programa que dada una serie de vehiculos caractrizados por su marca, modelo y precio, imprima las propiedades del vehículo más barato. Para ellos se deberán leer por teclado
 * las caracteristicas de cada vehiculo y crear una clase que represente a cada uno de ellos.
 * */

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String marca, modelo;
		double precio; 
		int numeroVehiculos, indiceCocheMasBarato;
		
		System.out.print("¿Cuantos vehículos vas a introducir?: ");
		numeroVehiculos = sc.nextInt();
		
		Vehiculo coches[] = new Vehiculo[numeroVehiculos];
		
		// AHora recorremos con un for para introducir los datos
		for (int i = 0; i < coches.length; i++) {
			sc.nextLine(); // Para evitar que se pegen los datos en la consola
			System.out.println("\nIntroduce las caracteristicas del coche" + (i+1) + ":");
			System.out.print("Marca: ");
			marca = sc.nextLine();
			System.out.print("Modelo: ");
			modelo = sc.nextLine();
			System.out.print("Precio: ");
			precio = sc.nextDouble();
			
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		
		indiceCocheMasBarato = indiceMBarato(coches);
		
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[indiceCocheMasBarato].mostrarDatos());
		
		
		sc.close();

	}
	
	
	
	public static int indiceMBarato(Vehiculo array[]) {
		double precio;
		int indice = 0;
		
		precio = array[0].getPrecio(); // Aqui almacenamos el precio del primer coche, para posteriormente recorrer el array y localizar el más barato
		for (int i = 1; i < array.length; i++) { // Empieza desde 1 porque el primer precio ya lo tenemos almacenado
			if (array[i].getPrecio() < precio) {
				precio = array[i].getPrecio();
				indice = i;
			}
		}
		return indice;
	}
	

}
