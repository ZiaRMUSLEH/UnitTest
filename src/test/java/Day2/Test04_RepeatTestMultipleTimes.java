package Day2;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatTestMultipleTimes {

    // Repeating the test
    @RepeatedTest(5)
    void testSubstring(){

        assertEquals("Java", "Java is an OOP language".substring(0, 4));
        System.out.println("testSubstring()");

    }

    @RepeatedTest(3)
    void testRepeated(){

        assertEquals(2, Math.addExact(2,1));
        System.out.println("testRepeated()");

    }

    Random random = new Random();

    @RepeatedTest(5)
    void testMathExact(){

        int num1 = random.nextInt(10);
        int num2 = random.nextInt(10);

        assertEquals(num1+num2, Math.addExact(num1, num2));
        System.out.println("Num1: "+num1+" Num2: "+num2);

    }

}