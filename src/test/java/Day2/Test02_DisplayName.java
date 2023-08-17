package Day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test02_DisplayName {

    // If I want to show a detailed sentence, rather than just the method name in the output, we can use @DisplayName
    @Test
    @DisplayName("Testing for parseInt() to check whether if it throws an error for a non-digit value")
    void testException(){

        String str = "1";
        assertThrows(NumberFormatException.class, ()->{
            Integer.parseInt(str);
        });

    }

}