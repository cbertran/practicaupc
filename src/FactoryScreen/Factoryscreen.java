package FactoryScreen;

import java.util.ArrayList;
import java.util.List;

import Screens.IScreen;

/**
 * Clase Factory Abstracta. Heredamos una clase factory para cada clase concreta
 * que querramos crear. En nuestro caso, tenemos 10 niveles, por tanto crearemos
 * 10 factorias.
 * 
 * En cada factoria concreta implementaremos el m�tode CreaScreen.
 * 
 * @author Carlos
 *
 */
public abstract class Factoryscreen {

	/**
	 * Lista que alojar� a los objetos creados. Se utilizar� para acceder a
	 * estos objetos desde el exterior.
	 */
	private static final List<IScreen> lista = new ArrayList<>();

	/**
	 * Constructor que nos crear� la lista que contendr� los objetos creados.
	 */
	protected Factoryscreen() {
	}

	/**
	 * Funci�n p�blica que retorna el objeto concreto creado. Esta funci�n
	 * utiliza la funci�n abstracta CreaScreen que es la que realmente crea el
	 * objeto concreto. El objeto creado se inserta en una lista p�blica. No
	 * necesitamos que nos retorne el objeto. Lo obtendremos de la lista.
	 */
	public void newScreen() {
		IScreen res = creaScreen();
		if (res != null) {
			getLista().add(res);
		}
	}

	/**
	 * Clase abstracta que se encargar� de crear el objeto
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
