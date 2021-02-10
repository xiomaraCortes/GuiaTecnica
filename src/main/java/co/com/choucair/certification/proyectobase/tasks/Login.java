package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strUser;
    private String strPassword;
    public Login(String strUser,String strPassword){
        this.strUser =strUser;
        this.strPassword = strPassword;
    }
    public static Login onThepage(String strUser, String strPassword) {
        return Tasks.instrumented(Login.class, strUser,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.Login_Button),
                Enter.theValue(strUser).into(ChoucairLoginPage.User_Input),
                Enter.theValue(strPassword).into(ChoucairLoginPage.pass_Input),
                Click.on(ChoucairLoginPage.Enter_Button)
        );
    }
}
