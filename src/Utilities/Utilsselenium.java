package Utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Clase que implementa todas las utilidades que interactuan con Selenium
 * @author Carlos
 *
 */
public final class Utilsselenium {
	private static WebDriver driver;
	private static short timeWait;
	
	static {
		driver = null;
		timeWait = 30;
	}
	
	/**
	 * Abre el explorador Chrome y cargar una URL. *
	 * 
	 * @param URL
	 */
	public static void openurl (String URL)
	{
		ChromeOptions options = new ChromeOptions();
		ArrayList<String> optionList = new ArrayList<>();
		optionList.add("--start-maximized");
		optionList.add("--incognito");
		options.addArguments(optionList);
		driver = new ChromeDriver(options);
		driver.get(URL);
	}
	
	/**
	 * Busca un elemento por id y pulsa click.
	 * 
	 * @param id
	 */
	public static void findByIdAndClick (String id)
	{
		driver.findElement(By.id(id)).click();
	}
	
	/**
	 * Busca un elemento por id y escribe un texto en él.
	 * 
	 * @param id
	 * @param text
	 */
	public static void findByIdAndSendKeys (String id, String text)
	{
		driver.findElement(By.id(id)).sendKeys(text);
	}
	
	/**
	 * Busca un elemento de tipo link llamado name, sin id y pulsa click.
	 * 
	 * @param name
	 */
	public static void findLinkAndClick (String name)
	{
		driver.findElement(By.linkText(name)).click();
	}
	
	/**
	 * Busca un element por id y ejecuta un código Javascript que provoca un
	 * click. Utilizado con elementos ocultos.
	 * 
	 * @param id
	 */
	public static void findByIdAndClickJS (String id)
	{
		WebElement elem = driver.findElement(By.id(id));
		JavascriptExecutor executor;
		if (driver instanceof JavascriptExecutor) {
			executor = (JavascriptExecutor) driver;	
			executor.executeScript("arguments[0].click();", elem);	
		}
	}

	/**
	 * Acepta el alert (popup)
	 */
	public static void popupClick() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	/**
	 * Envía un texto a una ventana popup.
	 * 
	 * @param text
	 */
	public static void popupSendKeys(String text)
	{
		Alert alert = driver.switchTo().alert();
     	alert.sendKeys(text);
		alert.accept();
	}

	/**
	 * Espera a que el documento esté cargado por completo.
	 * 
	 * @param _driver
	 */
	public static void waitForLoad(WebDriver _driver) {
		new WebDriverWait(_driver, timeWait).until((ExpectedCondition<Boolean>) wd -> "complete".equals(((JavascriptExecutor) wd)
				.executeScript("return document.readyState")));
	}

	/**
	 * Obtiene un texto de una ventana popup.
	 * 
	 * @return
	 */
	public static String popupURLGetText()
	{
        String res;
        
        String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;

		waitForLoad(driver);

        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
		// pasamos el foco a la ventana hija, buscamos el elemento que contiene
		// el texto y lo guardamos.
        res = driver.switchTo().window(subWindowHandler).findElement(By.xpath("//*[@id=\"pass\"]")).getText();

		// volvemos a la ventana padre
		driver.switchTo().window(parentWindowHandler);
        
		return res;
	}
	
	/**
	 * Arrastra un elemento con id source a un elemento con id dest.
	 * 
	 * @param source
	 * @param dest
	 */
	public static void dragAndDrop(String source, String dest)
	{
		Actions builder = new Actions(driver);
		WebElement elemsource = driver.findElement(By.id(source));
		WebElement elemdest = driver.findElement(By.id(dest));
		
		Action dragAndDrop = builder.clickAndHold(elemsource)
		   .moveToElement(elemdest)
		   .release(elemdest)
		   .build();

		dragAndDrop.perform();
	}
	
	public static String getUrl() {
		return driver.getCurrentUrl();

	}

}
