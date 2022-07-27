package Test;

import Base.BaseTest;
import Base.ExcelCicleResult;
import pages.FormPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Collections;

public class FormPageTest extends BaseTest {

    @Test
    public void testSuccessLogin() throws IOException {
        FormPage login = homePage.clickFormAuthentication();
        login.completeUser("tomsmith");
        login.completePass("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = login.clickLogin();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"), "Fallo mensaje recibido");

        ExcelCicleResult writeExcel = new ExcelCicleResult();
        String[] data = {"User: Tomsmith", "20-01-2022", "You logged into a secure area!", "SUCCESS", "CICLO 3"};
        writeExcel.writeData("C:\\Users\\sigri\\Documents\\pruebaExcel.xlsx", "pruebaHoja", 1, 4, data);
    }
}
