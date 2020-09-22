package Ejercicio3DDR;

public class Password {
	
	private String contrase�a;
	private int longitud;
	
	private final static int LONGITUD_POR_DEFECTO = 8;

	public Password(int longitud) {
		this.longitud = longitud;
		contrase�a = generarContrase�a();
	}

	public Password() {
		longitud = LONGITUD_POR_DEFECTO;
	}
	
	
	
	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
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
		
		for (int i = 0; i < contrase�a.length(); i++) {
			if(contrase�a.charAt(i) >= 97 && contrase�a.charAt(i) <= 122) {
				contadorMinusculas += 1;
			} else if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90) {
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

	private String generarContrase�a() {
		
	}
	
	

}
