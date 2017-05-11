package FactoryScreen;

import Screens.IScreen;
import Screens.Level3;

/**
 * Clase factoria encargada de crear objetos de la clase Level3
 * @author Carlos
 *
 */
public class Factoryscreenlevel3 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level3();
	}
}
