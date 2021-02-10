package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Maria wants to learn from the resource automation course$")
        public void Mariawantstolearnfromtheresourceautomationcourse(List<AcademyChoucairData> academyChoucairData)throws Exception {
        OnStage.theActorCalled("Maria" ).wasAbleTo(OpenUp.thePage(),
                Login.onThepage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));
    }

    @When("^She after searching in the browser for the choucair academy look in the categories (.*)$")
        public void Sheaftersearchinginthebrowserforthechoucairacademylookinthecategoriesbancolombiaautomationresources(List<AcademyChoucairData> academyChoucairData)throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }

    @Then("^she verifies that the title of the page is (.*)$")
        public void sheverifiesthatthetitleofthepageisbancolombiaautomationresources(List<AcademyChoucairData> academyChoucairData)throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }


}
