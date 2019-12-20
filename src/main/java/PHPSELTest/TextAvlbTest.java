package PHPSELTest;

import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextAvlbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/ubuntu/Jenkins/workspace/Deploy_Test_PHP/geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		WebDriver driver = new FirefoxDriver();
              
        driver.get("http://localhost:8001");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("About Us")).click();
        String bodyText = driver.findElement(By.id("PID-ab2-pg")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains("Lorem Ipsum Dipsum"));
        System.out.println("Text verification Test Succeeded");
        driver.quit();
	}

}
