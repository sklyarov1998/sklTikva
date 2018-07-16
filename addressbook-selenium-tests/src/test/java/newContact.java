import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class newContact extends BaseTest  {
    @Test
    public void testContactCreation(){
        initContactCreation();
        fillContactInfo("Daniel","Sklyarov","Torat Haim 32","1234567890","sklyarov1998ne@gmail.com");
        confirmContactCreation();
    }

    public void confirmContactCreation() {
        driver.findElement(By.name("submit")).click();
    }

    public void fillContactInfo(String firstName, String lastName, String address,String phone,String email) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterAddress( address);
        enterHomePhone(phone);
        enterEmail(email);
    }

    public void enterFirstName(String firstName) {
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstName);
    }
    public void enterLastName(String lasttname) {
        driver.findElement(By.name("lasttname")).click();
        driver.findElement(By.name("lasttname")).clear();
        driver.findElement(By.name("lasttname")).sendKeys(lasttname);
    }
    public void enterAddress(String address) {
        driver.findElement(By.name("address")).click();
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(address);
    }
    public void enterHomePhone(String phone) {
        driver.findElement(By.name("home")).click();
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(phone);
    }
    public void enterEmail(String email) {
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
    }

    //
    public void initContactCreation() {
        driver.findElement(By.linkText("add new")).click();
    }
}
