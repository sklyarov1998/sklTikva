import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GroupModification extends BaseTest {
    @Test
    public void testGroupModification() {
        clickOnGroupTab();
        driver.findElement(By.name("selected[]")).click();
        driver.findElement(By.name("edit"));
        enterNameOfGroup("Tikva2");
        enterHeaderOfGroup("Tikva-2.1");
        footerOfGroup("2.1-Tikva");
        driver.findElement(By.name("udate")).click();
        returnToGroupPage();

    }

}