package FactoryScreen;

import java.util.ArrayList;
import java.util.List;

import Screens.IScreen;

/**
 * Clase Factory Abstracta. Heredamos una clase factory para cada clase concreta
 * que querramos crear. En nuestro caso, tenemos 10 niveles, por tanto crearemos
 * 10 factorias.
 * 
 * En cada factoria concreta implementaremos el métode CreaScreen.
 * 
 * @author Carlos
 *
 */
public abstract class Factoryscreen {

	/**
	 * Lista que alojará a los objetos creados. Se utilizará para acceder a
	 * estos objetos desde el exterior.
	 */
	private static final List<IScreen> lista = new ArrayList<>();

	/**
	 * Constructor que nos creará la lista que contendrá los objetos creados.
	 */
	protected Factoryscreen() {
	}

	/**
	 * Función pública que retorna el objeto concreto creado. Esta función
	 * utiliza la función abstracta CreaScreen que es la que realmente crea el
	 * objeto concreto. El objeto creado se inserta en una lista pública. No
	 * necesitamos que nos retorne el objeto. Lo obtendremos de la lista.
	 */
	public void newScreen() {
		IScreen res = creaScreen();
		if (res != null) {
			getLista().add(res);
		}
	}

	/**
	 * Clase abstracta que se encargará de crear el objeto
	 * 
	 * @return devuelve el objeto creado. Este objeto implementa la interface
	 *         IScreen
	 */
	protected abstract IScreen creaScreen();

	/**
	 * @return the lista
	 */
	public static List<IScreen> getLista() {
		return lista;
	}
}
