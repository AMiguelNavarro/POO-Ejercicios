package Ejercicio1;

public class Contador {

	private int cont;

	public Contador(int cont) {
		if (cont<0) {
			this.cont=0;
		} else {
			this.cont=cont;
		}
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public void incrementarContador() {
		cont++;
	}
	
	public void decrementarContador() {
		cont--;
		if (cont<0) {
			cont=0;
		}
	}
		
}
