package Task_11;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePO {

    private WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public void goToHome() {
        driver.get("https://stackoverflow.com/");
    }

    public SignUpPO clickSignUp() {
        driver.findElement(By.xpath("//a[contains(text(),\"Sign up\") and @rel]")).click();
        return new SignUpPO(driver);

    }
}
