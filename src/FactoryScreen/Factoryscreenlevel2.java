package FactoryScreen;

import Screens.IScreen;
import Screens.Level2;

/**
 * Clase factoria encargada de crear objetos de la clase Level2
 * @author Carlos
 *
 */
public class Factoryscreenlevel2 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level2();
	}
}
