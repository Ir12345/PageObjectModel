package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContentQuote extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_content(driver, "id_quotes", "TC-01.07");   
           driver.quit();
    }

    public static void verify_content(WebDriver wd, String qoute, String text_case_id) {
		driver = wd;
		String quote = driver.findElement(By.id("id_quotes")).getText();
		if (quote != null && quote.length() < 103 && quote.length() > 36) {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Quote length:\t\t" + quote.length());
			System.out.println("Test Case Result: \t" + "PASSED");
			System.out.println("=======================================");
		} else {
			System.out.println("Test Case ID: \t\t" + text_case_id);
			System.out.println("Quote length:\t\t" + quote.length());
			System.out.println("Test Case Result: \t" + "FAILED");
			System.out.println("=======================================");}}}

