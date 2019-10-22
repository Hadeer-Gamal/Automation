package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends PageBase{
	
	public SearchProductPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(id="small-searchterms")
	WebElement SearchTxt;
	
	@FindBy(css="imput.button-1.search-box-button")
	WebElement SearchBtn;
	
	@FindBy(id="ui-id-1")
	WebElement productSuggest;
	
	public void BasicSearch(String query)
	{
		InputSendKey(SearchTxt, query);
		clickbtn(SearchBtn); 
		
	}
	
	

}
