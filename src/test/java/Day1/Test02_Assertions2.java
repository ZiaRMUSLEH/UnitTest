package Day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_Assertions2 {

    // Write a test method for Math.min()
    @Test
    void testFindMin(){

        //assertEquals(15, Math.min(15, 18));

        // assertTrue(), assertFalse()

        // If inside will return true, test will be passed. Expecting: True
        //assertTrue(12.5 == Math.min(12.5, 14.8));

        // If inside will return false, test will be passed. Expecting: False
        assertFalse(12.5 != Math.min(12.5, 14.8));

    }

    @Test
    public void testStringSplit() {
        String input = "ali,naci,ziya";
        String[] expectedValue = {"ali", "naci", "ziya"};

        String[] currentValue = input.split(",");

        assertArrayEquals(currentValue, expectedValue);
    }

}
