package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContentTemperature extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_content(driver, "64 ℉", "TC-01.09");   
           driver.quit();
    }
    public static void verify_content(WebDriver wd, String expected_temperature, String text_case_id) {
		driver = wd;
		String current_temperature = driver.findElement(By.id("id_temperature")).getText();
		if (expected_temperature.equals(current_temperature)) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Your Expected Temperature is:\t" + current_temperature);
			System.out.println("Your Actual Temperature is:\t" + current_temperature);
			System.out.println("Test Case Result: \t" + "PASSED");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Your Expected Temperature is:\t" + current_temperature);
			System.out.println("Your Actual Temperature is:\t" + current_temperature);
			System.out.println("Test Case Result: \t" + "FAILED");
			System.out.println("=======================================");}}}

