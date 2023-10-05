package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iFrameTask {
    /*
goto  http://35.175.58.98/handle-iframe.php
click the checkbox
then select the  babyCat
then enter topic name
all of this must be done in the same order
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/handle-iframe.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.switchTo().frame(0);
        WebElement Topic= driver.findElement(By.xpath("//input[@name='Topic']"));
        Topic.sendKeys("Hasib");
        driver.switchTo().frame(0);
        WebElement ClickBTN= driver.findElement(By.xpath("//input[@type='checkbox']"));
        ClickBTN.click();

        driver.switchTo().defaultContent();
        WebElement Frame= driver.findElement(By.xpath("//iframe[@name='dropdown-iframe']"));
        driver.switchTo().frame(Frame);

        WebElement Animal=driver.findElement(By.xpath("//select[@id='animals']"));
        Select Sel=new Select(Animal);
        Sel.selectByVisibleText("Baby Cat");
    }
}
