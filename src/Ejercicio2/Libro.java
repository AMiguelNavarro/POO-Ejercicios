package Ejercicio2;

public class Libro {
	
	private String titulo;
	private String autor;
	private int totalEjemplares;
	private int ejemplaresPrestados;
	
	public Libro(String titulo, String autor, int totalEjemplares, int ejemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.totalEjemplares = totalEjemplares;
		this.ejemplaresPrestados = ejemplaresPrestados;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotalEjemplares() {
		return totalEjemplares;
	}

	public void setTotalEjemplares(int totalEjemplares) {
		this.totalEjemplares = totalEjemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public void setEjemplaresPrestados(int ejemplaresPrestados) {
		this.ejemplaresPrestados = ejemplaresPrestados;
	}
	
	public boolean prestamo() {
		boolean prestado = true;
		
		if(totalEjemplares > ejemplaresPrestados) {
			ejemplaresPrestados++;
		} else {
			prestado = false;
		}
		return prestado;
	}
	
	public boolean devolucion() {
		boolean devuelto = true;
		
		if (ejemplaresPrestados == 0) {
			devuelto = false;
		} else {
			ejemplaresPrestados--;
		}
		return devuelto;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", totalEjemplares=" + totalEjemplares
				+ ", ejemplaresPrestados=" + ejemplaresPrestados + "]";
	}
	
	

}
