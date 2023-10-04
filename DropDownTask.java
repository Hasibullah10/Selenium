package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownTask {
    /* Select your dream destination from this calendar.*/
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement DropDown= driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
        DropDown.click();

        WebElement Destination= driver.findElement(By.linkText("Australia"));
        Destination.click();
    }
}
