package basics.search;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class DropdownPage extends UIInteractionSteps{
	@Step("Selects Value from dropdown {0}")
	public void selectValue(String value) {
		Select select=new Select($(By.id("dropdown")));
		select.selectByVisibleText(value);
	}
	
	@Step("Should be in dropdown {0}")
	public String shouldSelectedValue() {
		Select select=new Select($(By.id("dropdown")));
		return select.getFirstSelectedOption().getText();
	}
	
}
