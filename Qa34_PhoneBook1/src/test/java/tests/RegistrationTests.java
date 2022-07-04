package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{



        @Test
        public void registrationSuccess(){

            int i = (int) System.currentTimeMillis() /1000;
            app.getHelperUser().openLoginRegistrationForm();
            app.getHelperUser().fillLoginRegistrationForm("noaa+i+@gmail.com", "Noa51234$");
            app.getHelperUser().submitRegistration();

        }

    }
