package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormPage {
    private WebDriver driver;
    private By user = By.xpath("//input[@id='username']");
    private By pass = By.id("password");
    private By loginBotton = By.tagName("button");

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void completeUser(String username){
        driver.findElement(user).sendKeys(username);
    }

    public void completePass(String password){
        driver.findElement(pass).sendKeys(password);
    }

    public SecureAreaPage clickLogin(){
        driver.findElement(loginBotton).click();

        return new SecureAreaPage(driver);
    }

}
