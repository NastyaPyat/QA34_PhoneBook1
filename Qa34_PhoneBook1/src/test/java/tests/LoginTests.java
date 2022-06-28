package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests extends TestBase{

    @BeforeMethod
    public void preCondition(){
     if(app.getHelperUser().isLogged()){
         app.getHelperUser().logout();
     }

    }
    @Test
    public void LoginASuccess() {

        // 3.open form
       app.getHelperUser().openLoginRegistrationForm();
        // 4.fill form + valid data
        app.getHelperUser().fillLoginRegistrationForm("noaa5@gmail.com","Noa51234$");
        // 5.submit login
        app.getHelperUser().submitLogin();
        // 6.Assert ( is login success?)   logout present?PRESENT

    }
    @Test
    public void loginNegativeTestsWrongEmail() {

        // 3.open form
        app.getHelperUser().openLoginRegistrationForm();
        // 4.fill form + invalid data
        app.getHelperUser().fillLoginRegistrationForm("noagmail.com","Nnoa12345$");
        // 5.submit login
        app.getHelperUser().submitLogin();
        // 6.Assert ( is login unsuccessful?)   logout present? NOT

    }



}
