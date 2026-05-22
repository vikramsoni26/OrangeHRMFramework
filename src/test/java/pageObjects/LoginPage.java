package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

         WebDriver driver;

         // Constructor
         public LoginPage(WebDriver driver)
         {
             this.driver=driver;
         }

         // Locators
         private By txtUsername = By.name("username");

         private By txtPassword = By.name("password");

         private By btnLogin = By.xpath("//button[@type='submit']");

         // Action Methods
         public void setUsername(String uname)
         {
             driver.findElement(txtUsername).sendKeys(uname);
         }

         public void setPassword(String pwd)
         {
             driver.findElement(txtPassword).sendKeys(pwd);
         }

         public void clickLogin()
         {
            driver.findElement(btnLogin).click();
         }
}
