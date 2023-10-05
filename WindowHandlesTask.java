package Class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlesTask {
    /*
goto gmail.com
click on help
click on privacy
click on terms
switch the focus on terms page and get the title and print on screen
then switch the focus back to the gmail page
and print the title of the main page on screen

     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.Gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement HelpBTN= driver.findElement(By.xpath("//a[text()='Help']"));
        WebElement PrivacyBTN=driver.findElement(By.xpath("//a[text()='Privacy']"));
        WebElement TermBTN=driver.findElement(By.xpath("//a[text()='Terms']"));
        HelpBTN.click();
        PrivacyBTN.click();
        TermBTN.click();

        String GetAllHandel= driver.getWindowHandle();
        System.out.println(GetAllHandel);

        Set<String>GetHandle=driver.getWindowHandles();
        for (String GetAllHandle:GetHandle){

        driver.switchTo().window(GetAllHandel);
        String Title= driver.getTitle();
        if (Title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
            break;
        }
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
        }
    }
}
