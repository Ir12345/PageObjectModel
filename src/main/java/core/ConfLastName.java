package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfLastName extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_confirmation(driver, "Petrova", "TC-01.15");   
           driver.quit();
    }
    
    public static void verify_confirmation(WebDriver wd, String lname_conf_form_expected, String text_case_id) {
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
    		//driver.findElement(By.id("id_state"))
    		driver.findElement(By.id("id_checkbox")).click();	
    		driver.findElement(By.id("id_submit_button")).click();
    		
    		driver.findElement(By.id("id_fname_conf")).getText();
    		
    		 String lname_conf_form_actual = driver.findElement(By.id("id_lname_conf")).getText();

    			if (lname_conf_form_expected.equals(lname_conf_form_actual)) { 
    			System.out.println("Test Case ID: \t\t" + text_case_id);
    			System.out.println("Last Name Conf Expected:" + lname_conf_form_actual);
    			System.out.println("Last Name Conf Actual: \t" + lname_conf_form_actual);
    			System.out.println("Test Case Result: \t" + "PASSED");
    			System.out.println("=======================================");
    		} else {
    			System.out.println("Test Case ID: \t\t" + text_case_id);
    			System.out.println("Last Name Conf Expected:" + lname_conf_form_actual);
    			System.out.println("Last Name Conf Actual: \t" + lname_conf_form_actual);
    			System.out.println("Test Case Result: \t" + "FAILED");
    			System.out.println("=======================================");}
    		
    		driver.findElement(By.id("id_back_button")).click();   		
    }}


