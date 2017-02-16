package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorHandlingEmail extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_error_handling(driver, "Please enter Email Address", "TC-01.101");   
           driver.quit();
    }
    public static void verify_error_handling(WebDriver wd, String error_email_empty_expected, String text_case_id) {
		driver = wd;
			
			String fname = "Irina";
			String lname = "Petrova";
			
			driver.findElement(By.id("id_fname")).sendKeys(fname);
    		driver.findElement(By.id("id_lname")).sendKeys(lname);
    		driver.findElement(By.id("id_submit_button")).click();
    		String error_email_empty_actual = driver.findElement(By.id("ErrorLine")).getText();


    		if (error_email_empty_expected.equals(error_email_empty_actual)) {
    			System.out.println("Test Case ID: \t\t" + text_case_id);
    			System.out.println("Error Expected: \t\t" + error_email_empty_actual);
    			System.out.println("Error Actual: \t\t" + error_email_empty_actual);
    			System.out.println("Test Case Result: \t" + "PASSED");
    			System.out.println("=======================================");
    		} else {
    			System.out.println("Test Case ID: \t\t" + text_case_id);
    			System.out.println("Error Expected: \t\t" + error_email_empty_actual);
    			System.out.println("Error Actual: \t\t" + error_email_empty_actual);
    			System.out.println("Test Case Result: \t" + "FAILED");
    			System.out.println("=======================================");
    		}}}
