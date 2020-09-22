package Ejercicio7DDRElectrodomesticos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];
		
		listaElectrodomesticos[0] = new Electrodomestico(500, "verde", 'B', 15);
		listaElectrodomesticos[1] = new Lavadora(25);
		listaElectrodomesticos[2] = new Television(250, 10);
		listaElectrodomesticos[3] = new Lavadora();
		listaElectrodomesticos[4] = new Television(37, false);
		listaElectrodomesticos[5] = new Television(41, true);
		listaElectrodomesticos[6] = new Lavadora(65);
		listaElectrodomesticos[7] = new Lavadora(90);
		listaElectrodomesticos[8] = new Electrodomestico(650, 24);
		listaElectrodomesticos[9] = new Electrodomestico();
		
		/*
		Ahora, recorre este array y ejecuta el método precioFinal().
		Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, el de las lavadoras por otro y la suma de los Electrodomesticos 
		(puedes crear objetos Electrodomestico, pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
		*/
		
		double sumaElectrodomesticos = 0;
		double sumaTelevisores = 0;
		double sumaLavadoras = 0;
		
		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			if (listaElectrodomesticos[i] instanceof Electrodomestico) {
				sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
			}
			if (listaElectrodomesticos[i] instanceof Lavadora) {
				sumaLavadoras += listaElectrodomesticos[i].precioFinal();
			}
			if (listaElectrodomesticos[i] instanceof Television) {
				sumaTelevisores += listaElectrodomesticos[i].precioFinal();
			}
		}
		
		System.out.println("La suma del precio de electrodomesticos es: " +sumaElectrodomesticos);
		System.out.println("La suma del precio de lavadoras es: " +sumaLavadoras);
		System.out.println("La suma del precio de televisores es: " +sumaTelevisores);

	}

}
