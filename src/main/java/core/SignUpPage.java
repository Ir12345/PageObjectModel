package core;

public class SignUpPage extends BasePage {

 
       public static void main(String[] args) {
              getDriver("chrome", "index.php");
              verify_page_application_title(driver, "Sign Up", "id_f_title", "TC-01.01");
              driver.quit();
       }}