package Testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
    @BeforeTest
    @AfterTest
    @Test
    public void WebLoginHomeLoan()
    {
        System.out.println("I will execute before WebLoginHome");
        System.out.println("This is Home Loan Web");
        System.out.println("I will execute after WebLoginHome");

    }


@Test(groups={"smoke"})

    public void MobileLoginHomeLoan()
    {
        System.out.println("This is Home Loan Mobile");
    }

    @Test(dataProvider = "getData")
    public void MobileSignIn(String Username,String Password)
    {
        System.out.println("the user is:"+ Username+ "pw:"+ Password);

    }
    @Test(groups={"smoke"})
    public void MobileSignOut()
    {
        System.out.println("I will sign out from mobile app");
    }

    @Test
    public void APILoginHomeLoan()
    {
        System.out.println("This is Home Loan API");
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data= new Object[2][2];

        data[0][0]="first user";
        data[0][1]="password1";

        return data;



    }
}
