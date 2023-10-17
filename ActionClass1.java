package Class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/simple_context_menu.php");
        driver.manage().window().maximize();
        //Perform Right Click Action
        WebElement RightClick= driver.findElement(By.xpath("//button[text()='Right Click!']"));
        Actions actions=new Actions(driver);
        actions.contextClick(RightClick).perform();
      

    }
}
