package Test;

import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dropDownTests extends BaseTest {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDownPage();

        dropDownPage.selectDropDownOption("Option 1");
        var selectOptions = dropDownPage.getSelectedOptions();

        assertEquals(selectOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectOptions.contains("Option 1"));
    }
}
