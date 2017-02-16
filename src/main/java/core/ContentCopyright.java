package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContentCopyright extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_content(driver, "© 2017 alex.academy", "TC-01.11");   
           driver.quit();
    }
    public static void verify_content(WebDriver wd, String expected_copyright, String text_case_id) {
		driver = wd;
		String current_copyright = driver.findElement(By.id("copyright")).getText();
		if (expected_copyright.equals(current_copyright)) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Copyright Expected:\t" + current_copyright);
			System.out.println("Copyright Actual:\t" + current_copyright);
			System.out.println("Test Case Result: \t" + "PASSED");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Copyright Expected:\t" + current_copyright);
			System.out.println("Copyright Actual:\t" + current_copyright);
			System.out.println("Test Case Result: \t" + "FAILED");
			System.out.println("=======================================");}}}
