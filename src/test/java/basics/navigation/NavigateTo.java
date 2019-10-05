package basics.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {
	
	GoogleHomePage googleHome;
//	HotelHomePage hotelHome;
	
//	@Step("Open the Google home page")
//	public void googleHomePage() {
//		googleHome.open();
//	}
//
//	@Step("Open the Hotel.com home page")
//	public void hotelHomePage() {
//		hotelHome.open();
//	}
	
	@Step("Launch a custom URL")
	public void launchURL(String website) {
		googleHome.openUrl("http://"+website);
	}

}
