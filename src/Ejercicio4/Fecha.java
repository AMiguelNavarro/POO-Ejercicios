package Ejercicio4;

public class Fecha {
	
	private int dia;
	private int mes;
	private int anyo;
	
	public Fecha(int dia, int mes, int anyo) {
		this.dia = dia;
		this.mes = mes;
		this.anyo = anyo;
	}
	
	public Fecha() {
		
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	
	
	public boolean esBisiesto() {
		if((anyo % 4 == 0 && anyo % 100 !=0) || (anyo % 100 == 0 && anyo % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	/*Método fechaCorrecta() que comprueba si la fecha es correcta. Devuelve un valor de tipo boolean indicando si la fecha es correcta o no. 
Este método a su vez utilizará un método privado de la clase llamado esBisiesto que calcula si el año es o no bisiesto. El método esBisiesto devuelve true 
si el año es bisiesto y false si no lo es.*/
	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anyoCorrecto;
		
		anyoCorrecto = anyo > 0;
		mesCorrecto = mes >= 1 && mes <=12;
		
		switch(mes) {
		case 2:
			if(esBisiesto()) {
				diaCorrecto = dia >= 1 &&  dia <= 29;
			} else {
				diaCorrecto = dia >= 1 &&  dia <= 28;
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			diaCorrecto = dia >= 1 && dia <= 30;
			break;
		default: 
			diaCorrecto = dia >= 1 && dia <= 31;
		}
		
		return diaCorrecto && mesCorrecto && anyoCorrecto;
		
	}
	
	/*Método diaSiguiente() que cambia la fecha actual por la del día siguiente. El objeto de la clase Fecha al que se le aplique este método deberá quedar siempre en 
un estado consistente, es decir, la nueva fecha deberá ser correcta.*/
	public void diaSiguiente() {
		dia++;
		if(!fechaCorrecta()) {
			dia = 1;
			mes++;
			if(!fechaCorrecta()) {
				mes = 1;
				anyo++;
			}
		}
	}
	
	
	
	/*Modificar el método toString() heredado de Object para mostrar las fechas de la forma dd-mm-aaaa. El día y el mes se deben mostrar con dos cifras. Si el dia o el mes 
tienen solo una cifra se escribirá un cero delante. Por ejemplo si la fecha es dia=1, mes=6, año= 2015 la fecha que se mostrará será: 01-06-2015*/
	@Override
	public String toString() {
        StringBuilder sb = new StringBuilder();
        if (dia < 10) {
            sb.append("0");
        }
        sb.append(dia);
        sb.append("-");
        if (mes < 10) {
            sb.append("0");
        }
        sb.append(mes);
        sb.append("-");
        sb.append(anyo);
        return sb.toString();
	}
	

	

}
