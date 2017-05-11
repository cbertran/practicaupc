package Screens;

/**
 * Interface que implementan todas las clases Level.
 * Sólo tiene un único metode, encargado de ejecutar todas las acciones necesarias para pasar al siguiente nivel.
 * @author Carlos
 *
 */
public interface IScreen {

	/**
	 * Ejecuta las acciones necesarias para pasar de nivel.
	 */
	void execute();
}