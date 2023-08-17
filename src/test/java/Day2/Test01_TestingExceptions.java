package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_TestingExceptions {

    // Didn't pass
    @Test
    void testException(){

        String str = "Hi there!";

        assertThrows(NullPointerException.class, ()-> {
            System.out.println("testException() is running.");
            str.length();
        });

    }

    // Passed!
    @Test
    void testException2(){
        int num1 = 5;
        int num2 = 0;

        assertThrows(ArithmeticException.class, ()-> {
            System.out.println(num1/num2);
        });
    }

    @Test
    void testException3(){

        int num1 = 5;
        int num2 = 0;

        assertThrows(ArithmeticException.class, ()-> {
            divide(num1, num2);
        });

    }

    private int divide(int a, int b){
        return a/b;
    }

}