package FactoryScreen;

import Screens.IScreen;
import Screens.Level7;

/**
 * Clase factoria encargada de crear objetos de la clase Level7
 * @author Carlos
 *
 */
public class Factoryscreenlevel7 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level7();
	}
}
