package Ejercicio7DDRElectrodomesticos;

public class Lavadora extends Electrodomestico {
	
	private double carga;
	
	private static final int CARGA_POR_DEFECTO = 5;
	
	/*CONSTRUCTORES*/
	
	// Constructor por defecto
    public Lavadora(){
        super();
        carga = CARGA_POR_DEFECTO;
    }
	
	// Constructor con el precio y el peso, el resto por defecto
    public Lavadora(double precioBase, double peso) {
    	super(precioBase, peso);
    	carga = CARGA_POR_DEFECTO;
    	consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
    	color = COLOR_POR_DEFECTO;
    }
	
	// Constructor con la carga y el resto de atributos heredados
    public Lavadora(int carga){
        super();
        this.carga=carga;
    }
	
	/*GETTERS Y SETTER*/
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	
	/*METODOS PROPIOS*/
    /**
     * Precio final de la lavadora
     * @return precio final de la lavadora
     */
	public double precioFinal() {
		double plus = super.precioFinal();
		
		if(carga > 30) {
			plus += 50;
		}
		
		return plus;
	}

}
