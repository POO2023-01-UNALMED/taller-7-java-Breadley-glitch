package comunicacion;

public class Fabula extends Escrito {
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza=ensenanza;
		this.interpretacion= interpretacion;
			
	}
	
	public void setEnsenanza(String enseñanza) {
		this.ensenanza=enseñanza;
	}
	
	public String getEnsenanza() {
		return ensenanza;
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
		return getOrigen()+"\n"+
	getTitulo()+"\n"+
				getAutor()+"\n"+
	getPaginas()+"\n"+
				getEnsenanza();
		
	}
	
}
