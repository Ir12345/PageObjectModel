package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkPageFB extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_link(driver, "Facebook - Log In or Sign Up", "id_link_facebook", "TC-01.03");   
           driver.quit();
    }

public static void verify_link(WebDriver wd, String title_facebook_expected, String id_link_facebook, String text_case_id) {
	 driver = wd;
	driver.findElement(By.id("id_link_facebook")).click();
	driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
	String title_facebook_actual = driver.getTitle();
	if (title_facebook_expected.equals(title_facebook_actual)) {
		System.out.println("Test Case ID: \t\t" + text_case_id);
		System.out.println("Title Expected: \t\t" + title_facebook_actual);
		System.out.println("Title Actual: \t\t\t" + title_facebook_actual);
		System.out.println("Test Case Result: \t" + "PASSED");
		System.out.println("=======================================");
	} else {
		System.out.println("Test Case ID: \t\t" + text_case_id);
		System.out.println("Title Expected: \t\t" + title_facebook_actual);
		System.out.println("Title Actual: \t\t\t" + title_facebook_actual);
		System.out.println("Test Case Result: \t" + "FAILED");
		System.out.println("=======================================");}
	
	driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
}}



