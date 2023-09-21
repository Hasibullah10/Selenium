package Class0;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOrangeHRM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys(Keys.CONTROL+"abc");
        username.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        username.sendKeys("Admin");

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement LoginButton=driver.findElement(By.tagName("Button"));
        LoginButton.click();




    }
}
