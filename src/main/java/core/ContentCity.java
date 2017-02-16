package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContentCity extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_content(driver, "San Francisco, CA", "TC-01.08");   
           driver.quit();
    }
    public static void verify_content(WebDriver wd, String expected_location, String text_case_id) {
		driver = wd;
		String current_location = driver.findElement(By.id("id_current_location")).getText();
		if (expected_location.equals(current_location)) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Your  Expected Location is: " + current_location);
			System.out.println("Your Actual Location is:    " + current_location);
			System.out.println("Test Case Result: \t" + "PASSED");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Your  Expected Location is: " + current_location);
			System.out.println("Your Actual Location is:    " + current_location);
			System.out.println("Test Case Result: \t" + "FAILED");
			System.out.println("=======================================");}}}
