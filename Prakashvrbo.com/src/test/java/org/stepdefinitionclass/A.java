package org.stepdefinitionclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojoClasses.PlaceSearch;
import org.pojoClasses.TopDestination;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;

public class A extends BaseClass {

		@Given("aahan")
		public void aahan() throws Throwable {
			
			
			implicitwaits();
			for (int i = 0; i <30; i++) {
				down();
			}
			Thread.sleep(5000);
			for (int i = 0; i <40; i++) {
				down();
			}
			Thread.sleep(2000);
			TopDestination t = new TopDestination();
			javascriptscrolltop(t.getScrooltop());
			
			List<WebElement> li = driver.findElements(By.xpath("//ul[@class='CollapsibleLinkpile__category-list list-inline']//following::li"));
			
			
			for (int i = 0; i <li.size(); i++) {
				
				WebElement x = li.get(i);
				String text = x.getText();
				System.out.println(text);
				
				
				
				
			}
			
			
			
		}


		
	}

	
	

