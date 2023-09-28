package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskCheckBoxes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement ClickCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        ClickCheckBox.click();
        boolean CheckStatus = ClickCheckBox.isEnabled();
        if (CheckStatus) {
            System.out.println("The Button Was Enabled");
        } else {
            System.out.println("The Button Was Not Enabled");
        }
        if (ClickCheckBox.isSelected()) {
            System.out.println("The Button Was Clicked");
        } else {
            System.out.println("The Button Was Not Clicked");
        }
    }
}

