package Ejercicio5ProgramacionATSVehiculos;

/*
 * Construir un programa que dada una serie de vehiculos caracterizados por su marca, modelo y precio, imprima las propiedades del vehículo más barato. Para ellos se deberán leer por teclado
 * las caracteristicas de cada vehiculo y crear una clase que represente a cada uno de ellos.
 * */

public class Vehiculo {

	
	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}
	
	public String mostrarDatos() {
		return "Marca: " +marca+ "\n" + "Modelo: " + modelo + "\n" + "Precio: " + precio;
	}

	
}
