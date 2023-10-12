package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitTask1 {
    public static void main(String[] args) {
        //Instance Commands
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/synchronization-explicit-wait.php");
        driver.manage().window().maximize();

        //click to open alert and handle it.
        WebElement AlertBTN = driver.findElement(By.xpath("//button[@id='show_alert']"));
        AlertBTN.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        //click to change text and get the changed text.
        WebElement TextBTN= driver.findElement(By.xpath("//button[@id='changetext_button']"));
        TextBTN.click();
        String GetText=TextBTN.getText();
        System.out.println(GetText);

        //click to get hidden button click on it
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='display_button']")));
        WebElement btn= driver.findElement(By.xpath("//button[@id='display_button']"));
        btn.click();

        // click to get the checkbox selected and print if it is selected or not
        WebElement checkBoxBTN= driver.findElement(By.xpath("//button[@id='checkbox_button']"));
        checkBoxBTN.click();

        WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkbox']"));

        boolean status=checkbox.isSelected();
        if (status){
            System.out.println(checkbox.isSelected());
        }
    }
}



