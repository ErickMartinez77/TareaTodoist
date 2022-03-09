package testClean;

import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.TopFirstPage;

public class LoginTestTodoist extends BaseTodoist{
    TopFirstPage topFirstPage = new TopFirstPage();
    LoginPage loginPage = new LoginPage();
    String email = "erickmartinezcrypto123@gmail.com";
    String pass = "Erickmartinezcrypto123#";

    @Test
    public void login(){
        topFirstPage.buttonLogin.click();

        loginPage.textBoxEmail.setText(email);
        loginPage.textBoxPass.setText(pass);
        loginPage.buttonLogin.click();
    }
}
