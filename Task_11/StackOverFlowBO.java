package Task_11;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class StackOverFlowBO {

    private static WebDriver driver;

    private HomePO homePO;

    public static void main(String[] args){
    }SignUpPO signUpPO;

    public StackOverFlowBO(WebDriver driver){
        this.driver=driver;
    }

    public void goToHome() {
        homePO = new HomePO(driver);
        homePO.goToHome();
    }

    public void signUp() {
        signUpPO = homePO.clickSignUp();
    }

    public void verifySignUpPageIsOpen() {
        Assert.assertTrue(signUpPO.isOpen());
    }

    public void putLogin(String userLogin) {
        signUpPO
                .insertLogin(userLogin)
                .clickSignUp();
    }
}
