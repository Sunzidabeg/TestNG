import org.testng.annotations.Test;

public class HomeTest extends Home {
    //Home hh =new Home();
    //@Test(invocationCount =3 )
    @Test
    public void testrun3() {
        System.out.print("Test3");

    }

    @Test
    public void testrun1() {
        System.out.print("Test1");


    }

   @Test
    public void testrun2(){

       System.out.print("Test2");
    }
}