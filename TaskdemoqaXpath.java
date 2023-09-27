package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskdemoqaXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Hasib");

        WebElement Email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.sendKeys("Hasib123@gmail.com");

        WebElement CurrentAddress= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        CurrentAddress.sendKeys("Gainesville,VA");

        WebElement PermanentAddress= driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        PermanentAddress.sendKeys("VA,USA");

        WebElement Submit= driver.findElement(By.xpath("//button[contains(text),'Submit')]"));
        Submit.click();







    }
}
