package pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseTest {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public FormPage clickFormAuthentication(){
        clicOn("Form Authentication");

        return new FormPage(driver);
    }

    public DropDownPage clickDropDownPage(){
        clicOn("Dropdown");
        return new DropDownPage(driver);
    }

    public HoversPage clickHovers(){
        clicOn("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPress(){
        clicOn("Key Presses");
        return new KeyPressesPage(driver);
    }
    public PopUpsPage clickAlerts(){
        clicOn("Key Presses");
        return new PopUpsPage(driver);
    }

    public void clicOn(String linkTest){
        driver.findElement(By.linkText(linkTest)).click();
    }

}
