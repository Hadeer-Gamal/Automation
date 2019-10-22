package tests;

import pages.SearchProductPage;

public class SearchProductTest extends TestBase{
	 
	String productName="mac";
	SearchProductPage searchPageObject;
	
	public void SearchProductTest()
	{
		searchPageObject=new SearchProductPage(driver);
		searchPageObject.BasicSearch(productName);
	}
	
	

}
