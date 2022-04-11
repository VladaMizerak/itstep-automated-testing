package Task_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignUpPO {

    private WebDriver driver;
    public SignUpPO(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOpen() {
        return driver
                .findElement(By.xpath("//*[contains(text(),\"Join the Stack Overflow community\")]"))
                .isDisplayed();
    }

    public SignUpPO insertLogin(String userLogin){
        //TODO
        return this;
    }

    public void clickSignUp(){
        //TODO

    }
}
