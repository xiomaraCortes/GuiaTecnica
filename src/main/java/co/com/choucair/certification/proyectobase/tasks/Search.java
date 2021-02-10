package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    public Search(String course) {
        this.course = course;
    }

    private String course;

    public static Search the(String course) {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.Button_selec),
                Enter.theValue(course).into(SearchCoursePage.Input_curso),
                Click.on(SearchCoursePage.Button_buscar),
                Click.on(SearchCoursePage.Select)
        );
    }
}
