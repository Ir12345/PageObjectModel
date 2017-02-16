package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorHandlingFirstName extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_error_handling(driver, "Please enter First Name", "TC-01.99");   
           driver.quit();
    }
    public static void verify_error_handling(WebDriver wd, String error_fname_empty_expected, String text_case_id) {
		driver = wd;
			
			driver.findElement(By.id("id_submit_button")).click();
    		String error_fname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

    		if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
    			System.out.println("Test Case ID: \t\t" + text_case_id);
    			System.out.println("Error Expected: \t\t" + error_fname_empty_actual);
    			System.out.println("Error Actual: \t\t" + error_fname_empty_actual);
    			System.out.println("Test Case Result: \t" + "PASSED");
    			System.out.println("=======================================");
    		} else {
    			System.out.println("Test Case ID: \t\t" + text_case_id);
    			System.out.println("Error Expected: \t\t" + error_fname_empty_actual);
    			System.out.println("Error Actual: \t\t" + error_fname_empty_actual);
    			System.out.println("Test Case Result: \t" + "FAILED");
    			System.out.println("=======================================");
    		}}}
