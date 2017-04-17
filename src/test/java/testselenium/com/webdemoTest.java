import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.lang.*;

public class webdemoTest {
 WebDriver driver;

 @BeforeTest
 public void StartBrowser_NavURL() {
  String currentDir = System.getProperty("user.dir");
  System.out.println(currentDir);
  String geckoDriverLocation = currentDir + "/src/tools/geckodriver-v0.11.1-linux64/geckodriver";
  String Xport = System.getProperty("lmportal.xvfb.id", ":1");

  System.setProperty("webdriver.gecko.driver",geckoDriverLocation);
  FirefoxBinary firefoxBinary = new FirefoxBinary();
  firefoxBinary.setEnvironmentProperty("DISPLAY", Xport);
  //FirefoxProfile firefoxProfile = new FirefoxProfile();
  driver = new FirefoxDriver(firefoxBinary, null);
  //driver = new FirefoxDriver();
  driver.manage().window().maximize();
 }

 @AfterTest
 public void CloseBrowser() {
  driver.quit();
 }

 @Test
 public void testToCompareDoubles() {
  driver.get("http://localhost");
  try
   {
    Thread.sleep(5000);
   }
  catch(InterruptedException e)
   {
     // this part is executed when an exception (in this example InterruptedException) occurs
   }

 }
}
