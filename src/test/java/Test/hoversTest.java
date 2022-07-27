package Test;

import Base.BaseTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class hoversTest extends BaseTest {
    @Test
    public void testHoverUser1(){
        var hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplay(), "Caption not displayed");
        assertEquals(caption.getTittle(), "name: user1", "Caption tittle incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link incorrect");
        assertTrue(caption.getLink().endsWith("/user/1"), "Link incorrect");
    }
}
