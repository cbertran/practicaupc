package FactoryScreen;

import Screens.IScreen;
import Screens.Level8;

/**
 * Clase factoria encargada de crear objetos de la clase Level8
 * @author Carlos
 *
 */
public class Factoryscreenlevel8 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level8();
	}
}
