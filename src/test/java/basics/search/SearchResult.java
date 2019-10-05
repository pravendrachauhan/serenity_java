package basics.search;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;

public class SearchResult extends UIInteractionSteps{
	
	public List<String> titles(){
		List<WebElementFacade> resultListElement  = findAll(SearchObj.Result_Link);
		List<String> list = new ArrayList<String>();
		for(WebElementFacade results: resultListElement) {
			System.out.println(results.getText().toLowerCase());
			list.add(results.getText().toLowerCase());
		}
		return list;
	}
}
