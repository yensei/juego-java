package mapas.cuadros;

import graficos.Pantalla;
import graficos.Sprite;

public class CuadroVacio extends Cuadro {

	public CuadroVacio(Sprite sprite) {
		super(sprite);
	}

	@Override
	public void mostrar(int x, int y, Pantalla pantalla) {
		pantalla.mostrarCuadro(x, y, this);
	}
	
}
