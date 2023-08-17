package Day2;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class Test05_PerformanceTest {

    @Test
    void testPrintPerformance(){

        // Expected time limit, runnable stuff
        assertTimeout(Duration.ofSeconds(1), ()->{
            IntStream.rangeClosed(1, 500000) // Creating 50000 items
                    .forEach(System.out::println); // Printing those items
        });

    }

    // Testing the process of adding elements
    @Test
    void testPerformance(){

        assertTimeout(Duration.ofSeconds(2), ()-> IntStream.rangeClosed(1, 50000).reduce((x,y)->Math.addExact(x,y)));

    }

}