package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubmitForm extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_submit_form(driver, "http://alex.academy/exercises/signup/v1/confirmation.php", "TC-01.13");   
           driver.quit();
    }
    
    public static void verify_submit_form(WebDriver wd, String submit_form_url_expected, String text_case_id) {
		driver = wd;
        
			String fname = "Irina";
			String lname = "Petrova";
			String email = "irinasun@gmail.com";
			String phone = "4295671212";

			driver.findElement(By.id("id_fname")).sendKeys(fname);
    		driver.findElement(By.id("id_lname")).sendKeys(lname);
    		driver.findElement(By.id("id_email")).sendKeys(email);
    		driver.findElement(By.id("id_phone")).sendKeys(phone);
    		driver.findElement(By.id("id_g_radio_02")).click();
    		driver.findElement(By.id("id_checkbox")).click();	
    		driver.findElement(By.id("id_submit_button")).click();
    		
    		 String submit_form_url_actual = driver.getCurrentUrl();

    			if (submit_form_url_expected.equals(submit_form_url_actual)) { 
    			System.out.println("Test Case ID: \t\t" + text_case_id);
    			System.out.println("Submit Form URL Expected: " + submit_form_url_actual);
    			System.out.println("Submit Form URL Actual: " + submit_form_url_actual);
    			System.out.println("Test Case Result: \t" + "PASSED");
    			System.out.println("=======================================");
    		} else {
    			System.out.println("Test Case ID: \t\t" + text_case_id);
    			System.out.println("Submit Form URL Expected: " + submit_form_url_actual);
    			System.out.println("Submit Form URL Actual: " + submit_form_url_actual);
    			System.out.println("Test Case Result: \t" + "FAILED");
    			System.out.println("=======================================");}
    		
    		driver.findElement(By.id("id_back_button")).click();   		
    }}
    
