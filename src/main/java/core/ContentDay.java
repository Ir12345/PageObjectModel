package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContentDay extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_content(driver, "February 16, 2017 ", "TC-01.10");   
           driver.quit();
    }
    public static void verify_content(WebDriver wd, String expected_todays_day, String text_case_id) {
		driver = wd;
		String todays_day = driver.findElement(By.id("timestamp")).getText();
		if (expected_todays_day.equals(todays_day)) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Todays day Expected: \t" + todays_day);
			System.out.println("Todays day Actual:\t" + todays_day);
			System.out.println("Test Case Result: \t" + "PASSED");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Todays day Expected: \t" + todays_day);
			System.out.println("Todays day Actual:\t" + todays_day);
			System.out.println("Test Case Result: \t" + "FAILED");
			System.out.println("=======================================");}}}
