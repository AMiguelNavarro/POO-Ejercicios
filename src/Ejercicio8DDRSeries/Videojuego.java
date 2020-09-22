package Ejercicio8DDRSeries;

public class Videojuego implements Entregable{

	private String titulo, genero, compañia;
	private int horasEstimadas;
	private boolean entregado;
	
	private static final int HORAS_ESTIMADAS_DEF = 10;
	private static final boolean ENTREGADO_DEF = false;
	
	
	
	/*CONSTRUCTORES*/
	public Videojuego(String titulo, String genero, String compañia, int horasEstimadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.compañia = compañia;
		this.horasEstimadas = horasEstimadas;
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		entregado = ENTREGADO_DEF;
	}
	
	public Videojuego() {
		horasEstimadas = HORAS_ESTIMADAS_DEF;
		entregado = ENTREGADO_DEF;
	}
	
	
	
	/*GETTERS Y SETTERS*/
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", genero=" + genero + ", compañia=" + compañia + ", horasEstimadas="
				+ horasEstimadas + ", entregado=" + entregado + "]";
	}

	
	
	/*METODOS DE LA INTERFAZ ENTREGABLE*/
	@Override
	public void entregar() {
		entregado = true;		
	}

	@Override
	public void devolver() {
		entregado = false;
	}

	@Override
	public boolean isEntregado() {
		boolean estado;
		if(entregado) {
			estado = true;
		} else {
			estado = false;
		}
		
		return estado;
	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
