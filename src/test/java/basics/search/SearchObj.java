package basics.search;

import org.openqa.selenium.By;

public class SearchObj {
	static By Search_Field = By.name("q");
	static By Result_Link = By.className("ellip");
	static By close_popup = By.cssSelector(".cta.widget-overlay-close");

	static By Location_Field = By.id("qf-0q-destination");
	static By Checkin_Field = By.id("qf-0q-localised-check-in");
	static By Checkout_Field = By.id("qf-0q-localised-check-out");
	static By Room_Field = By.id("qf-0q-compact-occupancy");
	static By SearchButton_Field = By.xpath("//button[@type='submit']");
	static By ResultLocation_Field = By.cssSelector(".summary h1");
	static By SearchAssist_List = By.cssSelector(".autosuggest-category-result");

}
