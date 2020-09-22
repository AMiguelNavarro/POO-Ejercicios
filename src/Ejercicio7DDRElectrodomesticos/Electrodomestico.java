package Ejercicio7DDRElectrodomesticos;

public class Electrodomestico {
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	protected static final char CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
	protected static final int PRECIO_BASE_POR_DEFECTO = 100;
	protected static final String COLOR_POR_DEFECTO = "Blanco";
	protected static final int PESO_POR_DEFECTO = 5;
	
	String colores[] = new String[5];
	
	
	
	
	
	/* CONSTRUCTORES*/
	
	//Constructor por defecto
	public Electrodomestico(){
		precioBase = PRECIO_BASE_POR_DEFECTO;
		color = COLOR_POR_DEFECTO;
		consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
		peso = PESO_POR_DEFECTO;
	}
	
	//Constructor con el precio y el peso como parametros y el resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
		color = COLOR_POR_DEFECTO;
		
	}
	
	//Constructor con todos los atributos
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		comprobarColor(color);
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;

	}

	
	
	
	
	
	
	
	/*METODOS GETTERS Y SETTERS*/
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	
	/*METODOS PROPIOS DE CLASE*/
    /**
     * Comprueba el consumo energetico
     * Solo mayusculas, si es una 'a' no lo detecta como una 'A'
     * @param consumoEnergetico
     */
    public void comprobarConsumoEnergetico(char consumoEnergetico){
          
        if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=CONSUMO_ENERGETICO_POR_DEFECTO;
        }
          
    }
	
    /**
     * Comprueba el color
     * Debe ser uno del array de colores
     * @param color
     */
	public void comprobarColor(String color) {
		String colores[] = {"blanco","negro","rojo","azul","gris"};
		boolean encontrado = false;
		
		for (int i = 0; i < colores.length && encontrado == false; i++) {
			if (colores[i].equals(color)) {
				encontrado = true;
			}
		}
		
		if (encontrado) {
			this.color = color;
		} else {
			this.color = COLOR_POR_DEFECTO;
		}
		
	}
	
    /**
     * Precio final del electrodomestico
     * @return precio final del electrodomestico
     */
	public double precioFinal() {
		
		double plus = 0;
		double precioFinal;
		
		switch (consumoEnergetico) {
		case 'A':
			plus += 100;
			break;
		case 'B':
			plus += 80;
			break;
		case 'C':
			plus += 60;
			break;
		case 'D':
			plus += 50;
			break;
		case 'E':
			plus += 30;
			break;
		case 'F':
			plus += 10;
			break;
		}
		
		if (peso >= 0 && peso <= 19) {
			plus += 10;
		} else if (peso >= 20 && peso <= 49) {
			plus += 50;
		} else if (peso >= 50 && peso <= 79) {
			plus += 80;
		} else if (peso >= 80) {
			plus += 100;
		}
		
		precioFinal = precioBase + plus;
		
		return precioFinal;
		
	}
	
}
