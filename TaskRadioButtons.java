package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskRadioButtons {
    public static void main(String[] args) {
        WebDriver diver=new ChromeDriver();
        diver.get(" http://35.175.58.98/basic-radiobutton-demo.php");
        diver.manage().window().maximize();
        WebElement ClickFemaleBTN= diver.findElement(By.xpath("//input[@value='Female']"));
        ClickFemaleBTN.click();
        boolean checkStatus=ClickFemaleBTN.isDisplayed();
        if(checkStatus){
            System.out.println("The Female Button Was Displayed");
        }
        else{
            System.out.println("The Female Button Was Not Displayed");
        }
    }
}
