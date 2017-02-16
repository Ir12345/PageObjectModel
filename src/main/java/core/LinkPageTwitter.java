package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkPageTwitter extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_link(driver, "Twitter. It's what's happening.", "id_link_twitter", "TC-01.04");   
           driver.quit();
    }



public static void verify_link(WebDriver wd, String title_twitter_expected, String id_link_twitter, String text_case_id) {
	 driver = wd;
	driver.findElement(By.id("id_link_twitter")).click();
	driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
	String title_twitter_actual = driver.getTitle();
	if (title_twitter_expected.equals(title_twitter_actual)) {
		System.out.println("Test Case ID: \t\t" + text_case_id);
		System.out.println("Title Expected: \t\t\t" + title_twitter_actual);
		System.out.println("Title Actual: \t\t\t" + title_twitter_actual);
		System.out.println("Test Case Result: \t" + "PASSED");
		System.out.println("=======================================");
	} else {
		System.out.println("Test Case ID: \t\t" + text_case_id);
		System.out.println("Title Expected: \t\t\t" + title_twitter_actual);
		System.out.println("Title Actual: \t\t\t" + title_twitter_actual);
		System.out.println("Test Case Result: \t" + "FAILED");
		System.out.println("=======================================");}

	driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
	
}} 


