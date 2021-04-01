package Testing;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test1 {
    @BeforeSuite
    public void RunBefore()
    {
        System.out.println("I will execute at Suite level before any test case-I'm used for environment setup");
    }
    @Test(groups={"smoke"})
        public void Demo()
        {
            System.out.println("Hello - this is Personal Loan");
        }




    }

