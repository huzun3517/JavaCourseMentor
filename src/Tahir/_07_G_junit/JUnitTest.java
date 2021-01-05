package Tahir._07_G_junit;

import org.junit.Assert;
import org.junit.Test;

public class JUnitTest {

    // Assert.assertEquals

    @Test
    public void testLastChar() {

        myMethod myMethod = new myMethod();
        char sonuc =  myMethod.lastCharacter("Junit");

      Assert.assertEquals('t',sonuc);
     //   Assert.assertEquals('t',"Junit");

    }
    @Test
    public void testMaxNumber(){

        myMethod myMethod = new myMethod();

        int[] arr = {1,2,3,4,5,6};

        int sonuc = myMethod.maxNumberArray(arr);

        Assert.assertEquals(6,sonuc);


    }

    @Test
    public void testFaktoriyel(){
        myMethod myMethod = new myMethod();
        int num = 5;
        int sonuc = myMethod.factorial(num);
        Assert.assertEquals("Metodun hatali", 120,sonuc);

    }

    //----------------------------------------------------------------------//

    @Test
    public void testDeneme(){

        String s1 = "Java";
        String s2 = "Java";
        boolean b = s1.equals(s2);

        Assert.assertTrue(b);
    }

    @Test
    public void testDeneme2(){  // Assert.assertTrue  kullanıyorsak içerisi True olmalı. yani sonuç

        boolean b1 = true || false; // True olduğu için testten geçti

        Assert.assertTrue(b1);
    }

    @Test
    public void testDeneme3(){ // Assert.assertFalse  kullanıyorsak içerisi False olmalı.yani sonuc

        boolean b1 = true && false; // false olduğu için test geçti

        Assert.assertFalse(b1);
    }


}
