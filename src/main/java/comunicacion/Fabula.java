package comunicacion;

public class Fabula extends Escrito {
	private String enseñanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanza=enseñanza;
		this.interpretacion= interpretacion;
			
	}
	
	public void setEnseñanza(String enseñanza) {
		this.enseñanza=enseñanza;
	}
	
	public String getEnseñanza() {
		return enseñanza;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public int palabrasTotales(int paginasTotales) {
		final int K =1;
		return getPaginas()*K*paginasTotales;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	public String toString() {
		return getOrigen()+"\n"+ getTitulo()+"\n"+ getAutor()+"\n"+ getPaginas()+"\n"+ getEnseñanza();
		
	}
	
}
