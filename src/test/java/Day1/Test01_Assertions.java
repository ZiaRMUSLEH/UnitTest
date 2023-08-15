package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test(){

        // testThis(), testThat()

        // With JUnit 5, we don't necessarily need to write public at the beginning of the methods.

    }

    @Test
    public void testLength(){ // String.length()

        String sentence = "Hey there!"; // 10 characters
        int currentValue = sentence.length(); // The length of our sentence (10)
        int expectedValue = 10; // If the length() is working properly, we need to get 10.

        assertEquals(expectedValue, currentValue);

    }

    // Write a test method for toUpperCase method. (String.toUpperCase)
    @Test
    void testUpperCase(){   // String.toUpperCase()
        String currentValue = "Hey!".toUpperCase();
        String exceptedValue = "HEY!";

        assertEquals(exceptedValue, currentValue, "Uppercase did not work properly.");
    }

    @Test
    void testSum(){ // Math.addExact(1, 2) = 3

        int num1 = 15;
        int num2 = 5;
        int currentValue = Math.addExact(num1, num2); // 20
        int expectedValue = 20;

        assertEquals(expectedValue, currentValue);

    }

    @Test
    public void testContains(){ // String.contains();

        assertEquals(false, "Jace".contains("x"));

    }


}