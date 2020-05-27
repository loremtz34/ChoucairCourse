package co.com.test.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject{
	
	public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair")
			.located(By.xpath("//div[@id='universidad']//strong"));
	
	public static final Target INPUT_COURSE = Target.the("Buscar el curso")
			.located(By.id("coursesearchchbox"));
	
	public static final Target BUTTON_GO = Target.the("Da clicl para buscar el curso")
			.located(By.id("//button[@class='btn btn-secondary']"));
	
	public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
			.located(By.xpath("//h4[contains(text(),'Seguridad y Salud en el trabajo - I')]"));

	public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
			.located(By.xpath("//h1[contains(text(),'Seguridad y Salud en el trabajo - I')]"));
}
