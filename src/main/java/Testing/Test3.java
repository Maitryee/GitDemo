package Testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test3 {  // this module is for Car Loan and has 3 test cases
    @Test
    @BeforeMethod
    public void BeforeRun()
    {
        System.out.println("I will execute before the following method in this class- I'm specific to this class");
    }
    public void WebLoginCarLoan()
    {
        System.out.println("This is Car Loan Web");
    }
    @AfterMethod
    public void AfterRun()
    {
        System.out.println("I will execute after the above method in this class-I'm specific to this class");
    }
    @Test
    public void MobileLoginCarLoan()
    {
        System.out.println("This is Car Loan Mobile");
    }
    @Test
    public void APILoginCarLoan()
    {
        System.out.println("This is Car Loan API");
    }

}
