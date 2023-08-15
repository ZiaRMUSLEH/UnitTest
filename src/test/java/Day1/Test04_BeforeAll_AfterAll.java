package Day1;

import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test04_BeforeAll_AfterAll {

    static String str;


    @BeforeAll
    static void beforeAll(){
        str = "Hello Hi";
        System.out.println("******** BeforeAll() is working ********");
    }

    @AfterAll
    static void afterAll(){
        str = null;
        System.out.println("******** AfterAll() is working ********");
    }

    @Test
    void testSplit(TestInfo info){
        String[] currentValue = str.split(" ");
        String[] expectedValue = {"Hello", "Hi"};
        //System.out.println("******** testSplit() is working ********");
        System.out.println(info.getDisplayName()+" is working");
        assertTrue(Arrays.equals(expectedValue, currentValue));
    }


    @Test
     void testLength(){
        int currentValue = str.length();
        int expectedValue = 8;
        System.out.println("******** testLength() is working ********");
        assertEquals(expectedValue, currentValue);
    }

}
