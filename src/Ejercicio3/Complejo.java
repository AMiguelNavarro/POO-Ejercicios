package Ejercicio3;

public class Complejo {
	
	private double real;
	private double imaginaria;
	
	
	
	
	public Complejo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	public Complejo() {
		real = 0;
		imaginaria = 0;
	}
	
	
	
	
	

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	
	
	
	
	
	public Complejo sumar(Complejo c) {
		Complejo aux = new Complejo();
		
		aux.real = real+c.imaginaria;
		aux.imaginaria = imaginaria + c.imaginaria;
		
		return aux;
	}
	
	
	public Complejo restar(Complejo c) {
		Complejo aux = new Complejo();
		
		aux.real = real - c.real;
		aux.imaginaria = imaginaria - c.imaginaria;
		
		return aux;
	}
	
	public Complejo multiplicarComplejos (Complejo c) {
		Complejo aux = new Complejo();
		
		aux.real = ((real * c.real) - (imaginaria * c.imaginaria));
		aux.imaginaria = ((real * c.imaginaria) + (imaginaria * c.real));
		
		return aux;
	}
	
	public Complejo multiplicarDouble (double n) {
		Complejo aux = new Complejo();
		
		aux.real = real * n;
		aux.imaginaria = imaginaria * n;
		
		return aux;
	}
	
	public Complejo dividir(Complejo c) {
		Complejo aux = new Complejo();
		
		aux.real = (real * c.real + imaginaria * c.imaginaria)/(c.real*c.real + c.imaginaria*c.imaginaria);
		aux.imaginaria = (imaginaria*c.real - real*c.imaginaria)/(c.real*c.real + c.imaginaria*c.imaginaria);
		
		return aux;
	}

	@Override
	public String toString() {
		return "Complejo [real=" + real + ", imaginaria=" + imaginaria + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imaginaria) != Double.doubleToLongBits(other.imaginaria))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}
	
	
	
	

}
