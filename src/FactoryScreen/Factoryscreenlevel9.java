package FactoryScreen;

import Screens.IScreen;
import Screens.Level9;

/**
 * Clase factoria encargada de crear objetos de la clase Level9
 * @author Carlos
 *
 */
public class Factoryscreenlevel9 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level9();
	}
}
