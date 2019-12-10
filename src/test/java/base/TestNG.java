package base;

import org.testng.annotations.Test;

public class TestNG {

    //@Test(invocationCount =3 )
    //@Test(priority = 1)
   // @Test(priority = 1,groups = "Reg",dependsOnMethods ="Login" )

    @Test(groups = "nipa")
    public void Login() {
        System.out.print("Login");


    }


    @Test(groups = "nipa" )
    public void testrun1() {
        System.out.print("Test1");


    }


    @Test(dependsOnGroups = "papia")
    public void testrun2(){

        System.out.print("Test2");
    }

    @Test(groups = "papia")
    public void testrun3() {
        System.out.print("Test3");

    }





    @Test(groups = "papia")
    public void testrun4(){

        System.out.print("Test4");
    }
    @Test
    public void p(){
        System.out.print("ppp");


    }
    @Test
    public void q(){
        System.out.print("ppp");


    }

    @Test(dependsOnGroups ="nipa" )
    public void m(){
        System.out.print("mmm");


    }





}
