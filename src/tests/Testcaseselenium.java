package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FactoryScreen.Factoryscreen;
import FactoryScreen.Factoryscreenlevel1;
import FactoryScreen.Factoryscreenlevel10;
import FactoryScreen.Factoryscreenlevel2;
import FactoryScreen.Factoryscreenlevel3;
import FactoryScreen.Factoryscreenlevel4;
import FactoryScreen.Factoryscreenlevel5;
import FactoryScreen.Factoryscreenlevel6;
import FactoryScreen.Factoryscreenlevel7;
import FactoryScreen.Factoryscreenlevel8;
import FactoryScreen.Factoryscreenlevel9;
import Screens.IScreen;
import Utilities.Utilsselenium;

/**
 * Clase que engloba todos los tests a realizar
 * @author Carlos
 *
 */
public class Testcaseselenium {
	//static final String URL = "http://192.168.56.101/";
	private static final String templateURL = "http://%d.%d.%d.%d/";
	private static final String URL = String.format(templateURL,192,168,56,102);
	
	/**
	 * Método que inicializa el entorno
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Testexception {
		// Todas las clases Level implementan la interface IScreen.
		// FactoryScreen se encargará de crear las clases y guardarlas en una
		// lista genérica.
		Factoryscreenlevel1 factoryScreenLevel1 = new Factoryscreenlevel1();
		Factoryscreenlevel2 factoryScreenLevel2 = new Factoryscreenlevel2();
		Factoryscreenlevel3 factoryScreenLevel3 = new Factoryscreenlevel3();
		Factoryscreenlevel4 factoryScreenLevel4 = new Factoryscreenlevel4();
		Factoryscreenlevel5 factoryScreenLevel5 = new Factoryscreenlevel5();
		Factoryscreenlevel6 factoryScreenLevel6 = new Factoryscreenlevel6();
		Factoryscreenlevel7 factoryScreenLevel7 = new Factoryscreenlevel7();
		Factoryscreenlevel8 factoryScreenLevel8 = new Factoryscreenlevel8();
		Factoryscreenlevel9 factoryScreenLevel9 = new Factoryscreenlevel9();
		Factoryscreenlevel10 factoryScreenLevel10 = new Factoryscreenlevel10();
		
		factoryScreenLevel1.newScreen();
		factoryScreenLevel2.newScreen();
		factoryScreenLevel3.newScreen();
		factoryScreenLevel4.newScreen();
		factoryScreenLevel5.newScreen();
		factoryScreenLevel6.newScreen();
		factoryScreenLevel7.newScreen();
		factoryScreenLevel8.newScreen();
		factoryScreenLevel9.newScreen();
		factoryScreenLevel10.newScreen();

		Utilsselenium.openurl(URL);
	}

	/**
	 * Método que se llamará al final de test.
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Testexception {
	}

	/**
	 * Método que realiza el test
	 */
	@Test
	public void test() {
		// Recorremos la lista de clases y ejecutamos su método execute.
		for (IScreen sc: Factoryscreen.getLista())
			sc.execute();
		String url = Utilsselenium.getUrl();
		boolean checkedurl = (URL+"end.html").equals(url);
		assert (checkedurl);
	}
}

