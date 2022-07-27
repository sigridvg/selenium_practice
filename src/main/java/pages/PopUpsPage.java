package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpsPage {

    private WebDriver driver;
    private By triggerAlert = By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By results = By.id("result");
    private By triggerConfirm = By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By triggerPromp = By.xpath("//button[contains(text(),'Click for JS Prompt')]");

    public PopUpsPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerAlert(){
        driver.findElement(triggerAlert).click();
    }

    public void triggerConfirm(){
        driver.findElement(triggerConfirm).click();
    }

    public void clickCancelAlert(){
        driver.switchTo().alert().dismiss();
    }

    public String alertGetText(){
        return driver.switchTo().alert().getText();
    }

    public void clickAcceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getResult(){
        return driver.findElement(results).getText();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromp).click();
    }

    public void alertSendKeys(String txt){
        driver.switchTo().alert().sendKeys(txt);
    }

}
