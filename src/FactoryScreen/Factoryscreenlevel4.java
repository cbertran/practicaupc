package FactoryScreen;

import Screens.IScreen;
import Screens.Level4;

/**
 * Clase factoria encargada de crear objetos de la clase Leve4
 * @author Carlos
 *
 */
public class Factoryscreenlevel4 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level4();
	}
}
