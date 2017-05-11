package FactoryScreen;

import Screens.IScreen;
import Screens.Level5;

/**
 * Clase factoria encargada de crear objetos de la clase Level5
 * @author Carlos
 *
 */
public class Factoryscreenlevel5 extends Factoryscreen {

	/**
	 * Metode que crea el objeto del nivel deseado
	 */
	@Override
	public IScreen creaScreen() {
		return new Level5();
	}
}
