import static org.junit.jupiter.api.Assertions.*;

import com.example.PrimeNumbers;
import org.junit.jupiter.api.Test;

public class DataFlowTest {

  /**
   * Dataflow test case for PrimeNumbers.java to verify the data flow related to the 'index'
   * variable.
   *
   * <p>This test focuses on the variable 'index', which is crucial for storing prime numbers in the
   * array within the orderedPrimesInRange method. The 'index' variable is defined within the method
   * and used to track where the next prime number will be stored in the result array. This test
   * ensures that 'index' behaves correctly and that prime numbers are correctly placed into the
   * array.
   *
   * <p>- Variable: 'index'
   *
   * <p>- Definition: The variable 'index' is declared and initialized to 0 at the beginning of the
   * orderedPrimesInRange method. This initialization sets the starting position for storing prime
   * numbers in the array.
   *
   * <p>- Use: Tracks the position in the result array where the next prime number should be placed.
   *
   * <p>- Path: The 'index' variable is defined and used within a loop that iterates through the
   * specified range. For each prime number identified, 'index' is incremented, and the prime number
   * is stored at the current position in the result array. This path includes: 1. Initialization of
   * 'index'. 2. Storing the prime number at the position indicated by 'index'. 3. Incrementing
   * 'index' whenever a prime number is found. 4. Ensuring that 'index' does not exceed 100.
   *
   * <p>Justification: This test enhances the quality of the test suite by focusing on the data flow
   * through the 'index' variable. While other tests cover different aspects of the method, this
   * test specifically targets the management and updating of 'index', ensuring that prime numbers
   * are correctly accumulated in the result array. It verifies that the array indexing logic works
   * as intended and that the method handles the data flow correctly, thus improving the overall
   * test suite's reliability and completeness.
   */
  @Test
  public void testOrderedPrimesInRange_DataFlow() {
    // Test range from 20 to 30
    int[] result = PrimeNumbers.orderedPrimesInRange(20, 30);

    // Expected result with primes in the range 20 to 30
    int[] expected = {
      23, 29, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0
    };

    assertArrayEquals(expected, result);
  }
}
