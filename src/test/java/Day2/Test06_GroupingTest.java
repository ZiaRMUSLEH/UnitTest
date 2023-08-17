package Day2;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test06_GroupingTest {
    // to group the tests we are writing

    @Nested
    class MultiplyTest{
        @ParameterizedTest
        @CsvSource(value = {
                "-12, -4,3",
                "-12, 3,-4",
                "12,-4,-3"
        })
        void testMultiplyWithNonZero(int expectedResult, int x, int y){
            assertEquals(expectedResult, Math.multiplyExact(x,y));
        }
        @ParameterizedTest
        @CsvSource(value = {
                "0, 3,0",
                "0, 0,4",
                "0,12,0"
        })
        void testMultiplyWithZero(int expectedResult, int x, int y){
            assertEquals(expectedResult, Math.multiplyExact(x,y));
        }


    }

    @Nested
    class AddTest{

        @ParameterizedTest
        @CsvSource(value = {
                "-1, -4,3",
                "1, 4,-3",
                "-7,-4,-3"
        })
        void testAddWithNonZero(int expectedResult, int x, int y){
            assertEquals(expectedResult, Math.addExact(x,y));
        }

        @ParameterizedTest
        @CsvSource(value = {
                "3, 0,3",
                "4, 4,0",
                "12,0,12"
        })
        void testAddWithZero(int expectedResult, int x, int y){
            assertEquals(expectedResult, Math.addExact(x,y));
        }


    }
}
