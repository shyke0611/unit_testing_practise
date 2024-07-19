import static org.junit.jupiter.api.Assertions.*;

import com.example.PrimeNumbers;
import org.junit.jupiter.api.Test;

/** Equivalence test for the PrimeNumbers class. */
public class EquivalenceTest {

  /**
   * Test for prime numbers in a small valid range. This test covers the scenario where the range
   * includes a small number of prime numbers. It ensures that the method correctly identifies and
   * stores a small number of primes and that the rest of the array is filled with zeros.
   *
   * <p>Equivalence Class: Small Valid Range with a Limited Number of Primes
   *
   * <p>This equivalence class represents scenarios where the given range contains a few prime
   * numbers, and the total number of primes found is less than 100. The expected output should have
   * the identified prime numbers at the beginning of the array, followed by zeros for the remaining
   * positions.
   *
   * <p>This test is necessary to verify that the method correctly handles cases where the number of
   * prime numbers within the specified range is small. It ensures that the array is correctly
   * populated up to the number of primes found and that any additional elements in the array are
   * set to zero. This test helps to confirm that the function is not only working correctly for
   * large ranges but also for smaller valid ranges where the prime count is limited.
   */
  @Test
  public void testOrderedPrimesInRange_SmallRange() {
    // Test range from 10 to 20
    int[] result = PrimeNumbers.orderedPrimesInRange(10, 20);
    int[] expected = {
      11, 13, 17, 19, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0
    };

    assertArrayEquals(expected, result);
  }
}
