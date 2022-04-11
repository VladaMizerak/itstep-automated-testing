package Task_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args){
        String driverPath = "driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/");

        //a[contains(text(),"Request a demo")]
        WebElement RequestDemoButton = driver.findElement(By.xpath("//a[contains(text(),\"Request a demo\")]"));

        System.out.println(RequestDemoButton.getText());
        System.out.println(RequestDemoButton.getAccessibleName());
        System.out.println(RequestDemoButton.getRect());

        driver.close();
        driver.quit();

    }

}
