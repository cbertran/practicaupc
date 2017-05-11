package FactoryScreen;

import Screens.IScreen;
import Screens.Level10;

/**
 * Clase factoria encargada de crear objetos de la clase Level10
 * @author Carlos
 *
 */
public class Factoryscreenlevel10 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level10();
	}
}
