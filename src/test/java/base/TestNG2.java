package base;

import org.testng.annotations.*;

public class TestNG2 {
    //@Test(invocationCount =3 )
    //@Test(priority = 1)
    // @Test(priority = 1,groups = "Reg",dependsOnMethods ="Login" )
//@BeforeSuite
//@BeforeClass
//@BeforeMethod

//@Test()

//@AfterClass
//@AfterSuite
//@AfterMethod


    @Test()
    public void Login2() {
        System.out.print("Login2");


    }

    @Test(priority = 1, groups = "Reg", dependsOnMethods = "Login2")
    public void test1() {
        System.out.print("Test1");


    }

    //@Test(priority = 2,groups = "Smoke",dependsOnGroups = "Reg")
    @Test(dependsOnGroups = "Reg")
    public void test2() {

        System.out.print("Test2");
    }

    @Test(priority = 0, groups = "Reg")
    public void test3() {
        System.out.print("Test3");

    }


    @Test(priority = 3, groups = "Smoke")
    public void test4() {

        System.out.print("Test4");
    }
}
