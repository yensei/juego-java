package mapas.cuadros;
/**
 * Tile
 * @author julio
 *
 */

import graficos.Pantalla;
import graficos.Sprite;

public abstract class Cuadro {
	public int x;
	public int y;
	
	public Sprite sprite;
	//Coleccion de cuadros
	public static final Cuadro VACIO = new CuadroVacio(Sprite.VACIO);
	public static final Cuadro ASFALTO = new CuadroAsfalto(Sprite.ASFALTO);
	//fin colecciones de cuadros
	

	public Cuadro(Sprite sprite) {
		this.sprite = sprite;
	}
	
	
	public void mostrar(int x, int y, Pantalla pantalla) {
		
	}
	
	public boolean solido() {
		return false;
	}

}
