package core;

public class ConfirmationPage extends BasePage {
 
       public static void main(String[] args) {
              getDriver("chrome", "confirmation.php");
              verify_page_application_title(driver, "Confirmation", "id_f_title", "TC-01.02");
              driver.quit();
       }
}