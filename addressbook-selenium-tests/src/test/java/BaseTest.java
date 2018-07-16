import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;
    int size = 10;//amountOfItterations


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterClass(alwaysRun = true)

    public void tearDown() {
        logOut();
        driver.quit();
    }

    public void logOut() {
        driver.findElement(By.linkText("Logout")).click();
    }


    public void createNewGroup() {
        clickOnGroupTab();
        clickNew();
    }

    public void enterGroupInformation(String nameOfGroup, String header, String footer) {
        enterNameOfGroup(nameOfGroup);
        enterHeaderOfGroup(header);
        footerOfGroup(footer);
    }

    public void returnToGroupPage() {
        driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void logIn() {
        openSite();
        enterNameOfUser("user", "admin");
        enterPassoword("secret");
        clickEnter();
    }

    public void clickNew() {
        driver.findElement(By.name("new")).click();
    }

    public void clickOnGroupTab() {
        driver.findElement(By.linkText("groups")).click();
    }

    public void clickEnter() {
        driver.findElement(By.xpath("//input[@value='Login']")).click();
    }

    public void footerOfGroup(String footer) {
        driver.findElement(By.name("group_footer")).click();
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(footer);
    }

    public void enterHeaderOfGroup(String header) {
        driver.findElement(By.name("group_header")).click();
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(header);
    }

    public void enterPassoword(String password) {
        driver.findElement(By.name("pass")).click();
        driver.findElement(By.name("pass")).clear();
        driver.findElement(By.name("pass")).sendKeys(password);
    }

    public void enterNameOfUser(String user, String name) {
        driver.findElement(By.name(user)).click();
        driver.findElement(By.name(user)).clear();
        driver.findElement(By.name(user)).sendKeys(name);
    }

    public void openSite() {
        driver.get("http://localhost/addressbook/");
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void enterNameOfGroup(String group_name) {
        driver.findElement(By.name("group_name")).click();
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(group_name);

    }
}

