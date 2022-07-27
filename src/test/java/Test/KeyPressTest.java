package Test;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class KeyPressTest extends BaseTest {

    @Test
    public void textBackSpace(){
        var KeyPage = homePage.clickKeyPress();
        KeyPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(KeyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void textPICaracter(){
        var KeyPage = homePage.clickKeyPress();
        KeyPage.enterPi();
    }

}
