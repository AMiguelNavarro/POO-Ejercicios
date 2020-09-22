package Ejercicio7DDRElectrodomesticos;

public class Television extends Electrodomestico {

		private double resolucion;
		private boolean sintonizadorTDT;
		
		private static final double RESOLUCION_POR_DEFECTO = 20;
		private final static boolean SINTONIZADOR_POR_DEFECTO = false;
		
		/*CONSTRUCTORES*/
		
		// Constructor por defecto
		public Television() {
			super();
			resolucion = RESOLUCION_POR_DEFECTO;
			sintonizadorTDT = SINTONIZADOR_POR_DEFECTO;
		}
		
		//Constructor con el precio y el peso. Resto por defecto
		public Television(double precioBase, double peso) {
			super(precioBase, peso);
			resolucion = RESOLUCION_POR_DEFECTO;
			sintonizadorTDT = SINTONIZADOR_POR_DEFECTO;
	    	consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
	    	color = COLOR_POR_DEFECTO;
			
		}
		
		// Constructor con la resolucion, sintonizador tdt y el resto de atrib heredados
		public Television(double resolucion, boolean sintonizadorTDT) {
			super();
			this.sintonizadorTDT = sintonizadorTDT;
			this.resolucion = resolucion;
		}
		
		
		
		/*METODOS GETTERS Y SETTERS*/
		public double getResolucion() {
			return resolucion;
		}

		public void setResolucion(double resolucion) {
			this.resolucion = resolucion;
		}

		public boolean isSintonizadorTDT() {
			return sintonizadorTDT;
		}

		public void setSintonizadorTDT(boolean sintonizadorTDT) {
			this.sintonizadorTDT = sintonizadorTDT;
		}
		
		/*METODO PROPIO*/
		
		public double precioFinal() {
			double plus = super.precioFinal();
			
			if (resolucion > 40) {
				plus = plus * 1.3;
			}
			if(sintonizadorTDT) {
				plus += 50;
			}
			return plus;
		}
	
}
