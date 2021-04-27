package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma{
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String inter ) {
		super(origen);
		this.letras = letras;
		this.interpretacion = inter;
	}
	
	public void setLetras(String [] letras ) {
		this.letras = letras;
	}
	
	public String[] getLetras(){
		return this.letras;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	
	
	
	
	
	public int cantidadLetras() {
		return this.letras.length;
	}
	

	public String toString() {
		String concatenar = null;
		
		for(String letter: this.letras) {
			concatenar += letter + ", ";
		}
		
		return concatenar;
	}







}
