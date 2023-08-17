package Day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParameterizedTest {

    @Test
    void testLength(){

        assertTrue("Jace".length()>0);
        assertTrue("John".length()>0);
        assertTrue("Mark".length()>0);

    }

    // What if we wanted to check them at once?
    @ParameterizedTest
    @ValueSource(strings = {"Jace", "John", "Mark"})
    void testLength2(String str){

        assertTrue(str.length()>0);

    }

    // Another Example
    @Test
    void testUpperCase(){
        String str1 = "Hello";
        String str2 = "Hey";
        String str3 = "Test";

        assertEquals("HELLO", str1.toUpperCase());
        assertEquals("HEY", str2.toUpperCase());
        assertEquals("TEST", str3.toUpperCase());
    }


    // str1: Expected, str2: Current
    @ParameterizedTest
    @CsvSource(value = {
            "HELLO, Hello",
            "HEY, Hey",
            "TEST, Test"
    })
    void testUpperCase2(String str1, String str2){

        assertEquals(str1, str2.toUpperCase());

    }

    // Another Example
    // java --> if it contains a, junit --> if it contains u, hello --> if it contains a
    @ParameterizedTest
    @CsvSource(value = {
            "true, java, a",
            "true, junit, u",
            "false, hello, a"
    })
    void testContaints(boolean expectedBoolean, String word, String character){

        assertEquals(expectedBoolean, word.contains(character));

    }


}