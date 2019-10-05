package basics.search;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class HotelSearch extends UIInteractionSteps{
	@Step("Type Location {0}")
	public void term(String keyword) {
		//$(SearchObj.close_popup).waitUntilVisible();
		try {Thread.sleep(5000);} catch (InterruptedException e) {}
		try {
			if($(SearchObj.close_popup).isDisplayed()) {
				$(SearchObj.close_popup).click();
			}
		}
		catch(NoSuchElementException e) {

		}
		$(SearchObj.Location_Field).sendKeys(keyword);
		try {Thread.sleep(5000);} catch (InterruptedException e) {}

		$$(SearchObj.SearchAssist_List).get(0).click();
	}

	@Step("Type Checkin Date {0}")
	public void enterCheckinDate(String date) {
		$(SearchObj.Checkin_Field).clear();
		$(SearchObj.Checkin_Field).sendKeys(date);
	}

	@Step("Type Checkout Date {0}")
	public void enterCheckOutDate(String date) {
		$(SearchObj.Checkout_Field).clear();
		$(SearchObj.Checkout_Field).sendKeys(date);
		$(SearchObj.Room_Field).click();
	}

	@Step("Click On Search")
	public void clickOnSearch() {
		$(SearchObj.SearchButton_Field).click();
		try {Thread.sleep(10000);} catch (InterruptedException e) {}
	}

	@Step("Get location from result")
	public String getLocationFromResult() {
		return $(SearchObj.ResultLocation_Field).getText();
	}


}
