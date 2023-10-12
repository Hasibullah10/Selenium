package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WaitsTask1 {

    //click on click me button and get the text and print it on screen.
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/synchronization-waits.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//Implicit Wait

        WebElement ClickBTN = driver.findElement(By.xpath("//button[@id='show_text_synchronize']"));
        ClickBTN.click();

        WebElement GetText= driver.findElement(By.xpath("//p[text()='Hello, this message appeared after you clicked the button']"));
        String Text=GetText.getText();
        System.out.println(Text);

    }
}