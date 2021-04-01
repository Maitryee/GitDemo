package Testing;

import org.testng.annotations.Test;

public class Test2 {
    @Test(groups={"smoke"})
    public void PersonalLoanDepartment()
    {
        System.out.println("This is Loan2 - personal");
    }

    @Test
    public void LoanDepartment()
    {
        System.out.println("This is Loan3 - personal");
    }



}
