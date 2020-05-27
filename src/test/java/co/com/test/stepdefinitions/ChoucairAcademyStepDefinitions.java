package co.com.test.stepdefinitions;

import co.com.test.questions.Answer;
import co.com.test.tasks.Login;
import co.com.test.tasks.OpenUp;
import co.com.test.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {
	
	@Before
	public void setStage() { OnStage.setTheStage(new OnlineCast()); }
	
	@Given("^That Brandon wants to learn automation at the academy Choucair$")
	public void that_Brandon_wants_to_learn_automation_at_the_academy_Choucair() {
	   OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
	}

	@When("^he searchs for the course (.*)$")
	public void he_searchs_for_the_course_Seguridad_y_Salud_en_el_trabajo_I(String course) {
	    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));;
	}

	@Then("^he finds the course called (.*)$")
	public void he_finds_the_course_called_Seguridad_y_Salud_en_el_trabajo_I(String question) {
	    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
	}
}
