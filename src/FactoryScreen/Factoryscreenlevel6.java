package FactoryScreen;

import Screens.IScreen;
import Screens.Level6;

/**
 * Clase factoria encargada de crear objetos de la clase Level6
 * @author Carlos
 *
 */
public class Factoryscreenlevel6 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level6();
	}
}
