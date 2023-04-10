package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras = null;
	private String interpretacion;
	
	public Alfabeto(String origen, String interpretacion, String[] letras) {
		super(origen);
		this.interpretacion = interpretacion;
		this.letras = letras;
		
	}
	
	public String[] getLetras(){
		return letras;
	}
	
	public void setLetras(String[] letras) {
		this.letras=letras;
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		int cantidadLetras =getLetras().length; 
		return cantidadLetras;
	}
	
	public String interpretacion() {
		return interpretacion;
		
	}
	
	public String toString() {
		String cadaLetra= "";
		for (int i =0; i<letras.length;i++) {
			cadaLetra += letras[i];
			if (i<letras.length-1) {
				cadaLetra +=", ";
			}
		}
		return cadaLetra;
	}
	
}
