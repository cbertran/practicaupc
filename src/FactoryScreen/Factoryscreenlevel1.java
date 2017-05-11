package FactoryScreen;

import Screens.IScreen;
import Screens.Level1;

/**
 * Clase factoria encargada de crear objetos de la clase Level1
 * @author Carlos
 *
 */
public class Factoryscreenlevel1 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level1();
	}
}
