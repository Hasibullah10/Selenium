package Class7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Tables {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/table-search-filter-demo.php");
        driver.manage().window().maximize();

//        get the column status
        List<WebElement> statuses = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[4]"));

        for(int i=0 ;i<statuses.size();i++){

            String currentStatus = statuses.get(i).getText();

            if(currentStatus.equals("in progress")){

                System.out.println("the row number which has in progress is"+i);
                WebElement row = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[" +( i+1) + "]"));
                System.out.println(row.getText());
            }
        }
    }
}


    }
}
