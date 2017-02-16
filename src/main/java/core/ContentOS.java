package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContentOS extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_content(driver, "macOS 10.12 & Chrome 56", "TC-01.12");   
           driver.quit();
    }
    public static void verify_content(WebDriver wd, String expected_OS, String text_case_id) {
		driver = wd;
		String current_OS = driver.findElement(By.id("os_browser")).getText();
		if (expected_OS.equals(current_OS)) {
			System.out.println("Test Case ID: \t\t\t" + text_case_id);
			System.out.println("Your OS & Browser Expected is: \t " + current_OS);
			System.out.println("Your OS & Browser Actual is: \t " + current_OS);
			System.out.println("Test Case Result: \t\t" + "PASSED");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t\t" + text_case_id);
			System.out.println("Your OS & Browser Expected is: \t " + current_OS);
			System.out.println("Your OS & Browser Actual is: \t " + current_OS);
			System.out.println("Test Case Result: \t\t" + "FAILED");
			System.out.println("=======================================");}}}

