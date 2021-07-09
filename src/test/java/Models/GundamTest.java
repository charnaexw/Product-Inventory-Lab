package Models;

import org.junit.Test;

public class GundamTest {

    @Test
    public void setName(){
        //given (1)
        String expected = "Wing Zero";

        //when (2)
        testGundam = new Gundam();
        testGundam.setName(expected);

        //then
        Assertions.assertEquals(expected, testGundam.getname());
    }
}
