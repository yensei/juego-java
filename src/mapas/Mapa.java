package mapas;

import graficos.Pantalla;
import mapas.cuadros.Cuadro;

public abstract class Mapa {
	protected int ancho;
	protected int alto;
	
	protected int[] cuadros;//tiles

	public Mapa(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
		
		cuadros = new int[ancho * alto];
		generarMapa();
		
	}
	public Mapa(String ruta) {
		cargarMapa(ruta);
	}

	protected void generarMapa() {
		
	}
	
	private void cargarMapa(String ruta) {
		
	}
	
	private void actualizar() {
		
	}
	
	private void mostrar(int compensacionX, int compensacionY, Pantalla pantalla) {
		//boundaries 
		int oeste = compensacionX / 32;
		int este = (compensacionX + pantalla.getAncho()) / 32;
		int norte = compensacionY / 32;
		int sur = (compensacionY + pantalla.getAlto()) / 32;;
	}
	
	public Cuadro getCuadro(final int x, final int y) {
		switch (x + y * ancho) {
		case 1:
			return Cuadro.ASFALTO;
		default:
			return null;
		}		
	}
	

}
