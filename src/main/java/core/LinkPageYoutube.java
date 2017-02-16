package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkPageYoutube extends BasePage {
	 
    public static void main(String[] args) {
           getDriver("chrome", "index.php");
           verify_link(driver, "YouTube", "id_link_youtube", "TC-01.06");   
           driver.quit();
    }



public static void verify_link(WebDriver wd, String title_youtube_expected, String id_link_youtube, String text_case_id) {
	 driver = wd;
	driver.findElement(By.id("id_link_youtube")).click();
	driver.switchTo().window((String) driver.getWindowHandles().toArray()[1]);
	String title_youtube_actual = driver.getTitle();
	if (title_youtube_expected.equals(title_youtube_actual)) {
		System.out.println("Test Case ID: \t\t" + text_case_id);
		System.out.println("Title Expected: \t" + title_youtube_actual);
		System.out.println("Title Actual: \t\t" + title_youtube_actual);
		System.out.println("Test Case Result: \t" + "PASSED");
		System.out.println("=======================================");
	} else {
		System.out.println("Test Case ID: \t\t" + text_case_id);
		System.out.println("Title Expected: \t" + title_youtube_actual);
		System.out.println("Title Actual: \t\t" + title_youtube_actual);
		System.out.println("Test Case Result: \t" + "FAILED");
		System.out.println("=======================================");}

	driver.switchTo().window((String) driver.getWindowHandles().toArray()[0]);
	
}} 


