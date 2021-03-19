package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;

public class Post extends Base {
            private Base base;

            public Post(Base base) {
                this.base = base;
            }

            @Given("^that access to Wikipedia in Portuguese$")
            public void thatAccessToWikipediaInPortuguese() {
                base.driver.get(base.url);
                //Abre o navegador no site alvo (extendendo da base)
            }

            @When("^search for \"([^\"]*)\"$")
            public void searchFor(String produto) {
                base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

            }

            @Then("^Displays the expression \"([^\"]*)\" in the title of the guide$")
            public void displaysTheExpressioninTheTitleOfTheGuide(String produto) {
                assertTrue(base.driver.getTitle().contains(produto));

            }
        }


