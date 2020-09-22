package Ejercicio2DDR;

public class Persona {
	
	private String nombre, dni;
	private int edad;
	private char sexo;
	private double peso, altura;
	
	private static final char SEXO_POR_DEFECTO = 'H';
	public static final int SOBREPESO = 1;
	public static final int PESO_IDEAL = 0;
	public static final int INFRAPESO = -1;

	
	
	
	
	public Persona() {
		nombre = "";
		dni = "";
		edad = 0;
		sexo = SEXO_POR_DEFECTO;
		peso = 0;
		altura = 0;
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		dni = "";
		peso = 0;
		altura = 0;
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.dni = "";
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
	
	
	
	
	
	

	public int calcularIMC() {
		double resultado;
		resultado = peso / (Math.pow(altura, 2));
		
		if(resultado < 20) {
			return INFRAPESO;
		} else if (resultado >= 20 && resultado <= 25) {
			return PESO_IDEAL;
		} else {
			return SOBREPESO;
		}
	}
	
	
	public boolean esMayorDeEdad() {		
		if(edad < 18) {
			return false;
		} else {
			return true;
		}
	}
	
	public void comprobarSexo() {
		if(sexo != 'H' && sexo != 'M') {
			sexo = 'H';
		}
	}
	
    private void generarDni() {
        final int divisor = 23;
 
        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
 
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
 
        //Pasamos el DNI a String
        dni = Integer.toString(numDNI) + letraDNI;
    }
 
    private char generaLetraDNI(int res) {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }
	
    
    
    
    
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
	
	

}
