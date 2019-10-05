package basics.search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class SearchFor extends UIInteractionSteps{
	@Step("Search for term {0}")
	public void term(String term) {
		$(SearchObj.Search_Field).sendKeys(term);
		$(SearchObj.Search_Field).sendKeys(Keys.ENTER);
	}
}
