package tests;

import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{



    @Test
    public void registrationSuccess(){
        openLoginRegistrationForm();
        fillLoginRegistrationForm("noa013@gmail.com","Nnoa12345$");
        submitRegistration();

    }


}