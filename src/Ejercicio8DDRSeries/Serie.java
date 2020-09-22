package Ejercicio8DDRSeries;

public class Serie implements Entregable{

	private String titulo;
	private String genero;
	private String creador;
	private int numeroTemporadas;
	private boolean entregado;
	
	public final static int NUM_TEMPORADAS_DEF = 3;
	public final static boolean ENTREGADO_DEF = false;
	
	
	/*CONSTRUCTORES*/
	
	public Serie(String titulo, String genero, String creador, int numeroTemporadas) {
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numeroTemporadas = numeroTemporadas;
	}
	
	public Serie() {
		numeroTemporadas = NUM_TEMPORADAS_DEF;
		entregado = ENTREGADO_DEF;
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		numeroTemporadas = NUM_TEMPORADAS_DEF;
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

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}
	
	
	

	@Override
	public String toString() {
		return "\nSERIE: \nTitulo= " + titulo + "\nGenero= " + genero + "\nCreador= " + creador + "\nNumeroTemporadas= "
				+ numeroTemporadas + "\nEntregado= " + entregado;
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
