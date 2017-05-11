package Screens;

import Utilities.Utilsselenium;

/**
 * Clase que implementa el nivel 4.
 * Implementa el metode execute que se encarga de ejecutar todas las acciones necesarias para pasar al siguiente nivel
 * @author Carlos
 *
 */
public final class Level4 implements IScreen {

	/**
	 * Metode que implementa las acciones específicas del nivel para pasar al siguiente
	 */
	@Override
	public void execute() {
		// Pulsamos los 4 botones
		for (int i = 1; i < 5; i++) {
			Utilsselenium.findLinkAndClick("Botón " + i);
		}
	}
}
