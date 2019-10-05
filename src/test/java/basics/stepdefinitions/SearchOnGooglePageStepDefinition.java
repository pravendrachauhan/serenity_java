package basics.stepdefinitions;


import static org.assertj.core.api.Assertions.assertThat;

import basics.navigation.NavigateTo;
import basics.search.DropdownPage;
import basics.search.HotelSearch;
import basics.search.SearchFor;
import basics.search.SearchResult;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Steps;

public class SearchOnGooglePageStepDefinition {
	
	@Steps
	NavigateTo navigateTo;
	
	@Steps
	SearchFor searchFor;
	
	@Steps
	HotelSearch hotelSearch;
	
	@Steps
	SearchResult searchResult;
	
	@Steps
	DropdownPage dropDownPage;
	
		
	@Given("User is on (.*) page")
	public void user_on_google_home_page(String website) {
		
//		if(website.equalsIgnoreCase("Google.com"))
//			navigateTo.googleHomePage();
//		else if(website.equalsIgnoreCase("Hotel.com")) {
//			navigateTo.hotelHomePage();
//		}
//		
		navigateTo.launchURL(website);
		
	}
	
	@When("he searches for \"(.*)\"")
	public void he_search_for_given_term(String term) {
		searchFor.term(term);
	}
	
	@When("he enters \"(.*)\" into (.*)")
	public void he_enters_for_given_keyword(String value, String keyword) {
		if(keyword.equalsIgnoreCase("location"))
			hotelSearch.term(value);
		else if(keyword.equalsIgnoreCase("checkin"))
			hotelSearch.enterCheckinDate(value);
		else if(keyword.equalsIgnoreCase("checkout"))
			hotelSearch.enterCheckOutDate(value);
	}
	@When("he selects \"(.*)\" from dropdown")
	public void he_selects_from_dropdown(String value) {
		dropDownPage.selectValue(value);
	}
	
	@Then("\"(.*)\" should be selected in dropdown")
	public void should_be_selected_in_dropdown(String value) {
		Assert.assertEquals(dropDownPage.shouldSelectedValue(), value);
	}
	
	@When("clicks on search button")
	public void he_click_on_search_button() {
		hotelSearch.clickOnSearch();
	}
	
	@Then("all the search result titles should contain the word \"(.*)\"")
	public void all_result_should_contain_that_word(String term) {
		Assert.assertTrue(searchResult.titles()
				.stream()
				.allMatch(title -> title.toLowerCase().contains(term)));
	}
	
	@Then("he should find given \"(.*)\" on result page")
	public void find_location_on_result_page(String location) {
		Assert.assertEquals(location, hotelSearch.getLocationFromResult());
	}
	
}
