package Screens;

import Utilities.Utilsselenium;

/**
 * Clase que implementa el nivel 9.
 * Implementa el metode execute que se encarga de ejecutar todas las acciones necesarias para pasar al siguiente nivel
 * @author Carlos
 *
 */
public final class Level9 implements IScreen {

	/**
	 * Metode que implementa las acciones específicas del nivel para pasar al siguiente
	 */
	@Override
	public void execute() {
        String text = Utilsselenium.popupURLGetText();
        Utilsselenium.findByIdAndSendKeys("input", text);
		Utilsselenium.findLinkAndClick("Continuar");
	}
}
