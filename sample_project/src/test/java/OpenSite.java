
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OpenSite {
    ChromeDriver driver;
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
    }
    @Test
    public void enterURL(){

        openSite("https://www.google.com/");
        clickOnSearchField("lst-ib");
        typeQuery("lst-ib", "testNG");


    }

    private void typeQuery(String id, String text) {
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(text, Keys.ENTER);
    }

    private void clickOnSearchField(String id) {
        driver.findElement(By.id(id)).click();
    }

    public void openSite(String url) {
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
