package Ejercicio3DDR;

public class Password {
	
	private String contraseña;
	private int longitud;
	
	private final static int LONGITUD_POR_DEFECTO = 8;

	public Password(int longitud) {
		this.longitud = longitud;
		contraseña = generarContraseña();
	}

	public Password() {
		longitud = LONGITUD_POR_DEFECTO;
	}
	
	
	
	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	
	
	
	private boolean esFuerte() {
		int contadorMayusculas = 0;
		int contadorMinusculas = 0;
		int contadorNumeros = 0;
		
		for (int i = 0; i < contraseña.length(); i++) {
			if(contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
				contadorMinusculas += 1;
			} else if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90) {
				contadorMayusculas += 1;
			} else {
				contadorNumeros += 1;
			}
		}
		
		if(contadorNumeros > 5 && contadorMayusculas > 2 && contadorMinusculas > 1) {
			return true;
		} else {
			return false;
		}
	}

	private String generarContraseña() {
		
	}
	
	

}
