package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.*;

public class BasePage {
	static WebDriver driver;
	static final String baseUrl = "http://alex.academy/exercises/signup/v1/";


	public static void getDriver(String browser, String url) {
		              if (browser.equalsIgnoreCase("chrome")) {
		                     Logger logger = Logger.getLogger("");
		                     logger.setLevel(Level.OFF);
		                     System.setProperty("webdriver.chrome.driver", "./src/main/resources/browsers/chromedriver");
		                     System.setProperty("webdriver.chrome.silentOutput", "true");
		                     ChromeOptions option = new ChromeOptions();
		                     option.addArguments("-start-fullscreen");
		                     driver = new ChromeDriver(option);
		                     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		              } else {driver = new HtmlUnitDriver();
		                     ((HtmlUnitDriver) driver).setJavascriptEnabled(true);}
		              driver.get(baseUrl + url);}
		 
		public static void verify_page_application_title(WebDriver wd, String app_title_expected, String app_title_id, String text_case_id) {
		              driver = wd;
		              String app_title_actual = driver.findElement(By.id(app_title_id)).getText();
		              if (app_title_expected.equals(app_title_actual)) {
		                     System.out.println("Test Case ID: \t\t" + text_case_id);
		                     System.out.println("Title Expected: \t" + app_title_actual);
		                     System.out.println("Title Actual: \t\t" + app_title_actual);
		                     System.out.println("Test Case Result: \t" + "PASSED");
		              } else {
		                     System.out.println("Test Case ID: \t\t" + text_case_id);
		                     System.out.println("Title Expected: \t" + app_title_actual);
		                     System.out.println("Title Actual: \t\t" + app_title_actual);
		                     System.out.println("Test Case Result: \t" + "FAILED");}}}
		                     
		