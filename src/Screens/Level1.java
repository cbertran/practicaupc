package Screens;

import Utilities.Utilsselenium;

/**
 * Clase que implementa el nivel 1.
 * Implementa el metode execute que se encarga de ejecutar todas las acciones necesarias para pasar al siguiente nivel
 * @author Carlos
 *
 */
public final class Level1 implements IScreen {

	/**
	 * Metode que implementa las acciones espec�ficas del nivel para pasar al siguiente
	 */
	@Override
	public void execute()
	{
		Utilsselenium.findByIdAndClick("start_button");
	}
}
