package base;

import org.testng.annotations.*;

public class TestNGAnotation {

    @BeforeClass
    public void beforeclass() {
        System.out.print("beforeclass");


    }
    @AfterClass
    public void Afterclass() {
        System.out.print("Afterclass");


    }



@BeforeMethod
    public void OpenBrowser() {
        System.out.print("OpenBrowser");


    }

    @Test
    public void Test() {
        System.out.print("Test");


    }
@Test
    public void Test2() {
        System.out.print("Test");


    }
    @Test
    public void Test3() {
        System.out.print("Test");


    }
   @Test
    public void Test7() {
        System.out.print("Test");


    }

    @AfterMethod
    public void CloseBrowser() {
        System.out.print("CloseBrowser");

}
}