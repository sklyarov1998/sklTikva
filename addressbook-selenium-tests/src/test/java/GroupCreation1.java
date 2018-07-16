
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupCreation1 extends BaseTest {

  @Test
  public void createAdecvateGroup() {

    for (int i = 0; i < size; i++) {
      createNewGroup();
      enterGroupInformation("Tikva", "tikva1", "qa");
      submitGroupCreation();
      returnToGroupPage();
    }
  }

  @Test
  public void createEmptyProject(){

    createNewGroup();
    enterGroupInformation("","","");
    submitGroupCreation();
    returnToGroupPage();
  }


}
