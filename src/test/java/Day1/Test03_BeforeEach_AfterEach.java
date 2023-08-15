package Day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    String str;


    @BeforeEach
    void beforeEach(){
        str = "Hello Hi";
        System.out.println("******** BeforeEach() is working ********");
    }

    @AfterEach
    void afterEach(){
        str = null;
        System.out.println("******** AfterEach() is working ********");
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