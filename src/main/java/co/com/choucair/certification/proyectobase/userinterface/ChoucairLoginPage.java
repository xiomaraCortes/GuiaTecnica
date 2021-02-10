package co.com.choucair.certification.proyectobase.userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {
    public static final Target Login_Button = Target.the("es el boton para ingresar a la pgina").
            located(By.xpath("//div[@class= 'd-none d-lg-block']//strong[]contains(text(),'Ingresar')"));
    public static final Target User_Input = Target.the("Campo para escribir el usuario").
            located(By.xpath("Username"));
    public static final Target pass_Input = Target.the("Campo para escribir la contraseña").
            located(By.xpath("password"));
    public static final Target Enter_Button = Target.the("Confirmacion de ingreso").
            located(By.xpath("//button[contains(@class,''btn btn-primary)]"));
}
