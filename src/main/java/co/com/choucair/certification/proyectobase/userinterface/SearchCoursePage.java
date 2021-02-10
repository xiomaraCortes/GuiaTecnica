package co.com.choucair.certification.proyectobase.userinterface;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {

    public static final Target Button_selec = Target.the("Debe seleccionar Academia Choucair")
            .located(By.xpath("//div[@id = 'universidad']//strong"));
    public static final Target Input_curso = Target.the("Buscar el curso de automatizacion")
            .located(By.xpath("coursesearchbox"));
    public static final Target Button_buscar = Target.the("Enter para buscar el curso")
            .located(By.xpath("//button[@class= 'btn btn-secondary']"));
    public static final Target Select = Target.the("Enter para buscar el curso")
            .located(By.xpath("//h4[constains(text(),'Recursos automatización Bancolombia')]"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//h1[constains(text(),'Recursos Automatizacion Bancolombia')]"));
}
