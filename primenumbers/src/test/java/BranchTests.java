import static org.junit.jupiter.api.Assertions.*;

import com.example.PrimeNumbers;
import org.junit.jupiter.api.Test;

/** Unit tests for the PrimeNumbers class. */
public class BranchTests {

  /** Test for prime numbers in a valid range. This test covers the typical case. */
  @Test
  public void testOrderedPrimesInRange_ValidRange() {
    int[] result = PrimeNumbers.orderedPrimesInRange(1, 100);
    int[] expected = {
      2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
      97, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
    };

    assertArrayEquals(expected, result);
  }

  /**
   * Edge case: Test when the range includes the lower boundary (1). This test verifies that the
   * method correctly handles the smallest valid range.
   */
  @Test
  public void testOrderedPrimesInRange_IncludingLowerBoundary() {
    int[] result = PrimeNumbers.orderedPrimesInRange(1, 10);
    int[] expected = {
      2, 3, 5, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0
    };

    assertArrayEquals(expected, result);
  }

  /**
   * Edge case: Test when the range includes the upper boundary (10000). This test verifies that the
   * method correctly handles the largest valid range.
   */
  @Test
  public void testOrderedPrimesInRange_IncludingUpperBoundary() {
    int[] result = PrimeNumbers.orderedPrimesInRange(9990, 10000);
    int[] expected = {
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
      0, 0, 0, 0, 0, 0, 0
    };

    assertArrayEquals(expected, result);
  }


  /**
   * Test for prime numbers in a large valid range. This test covers the case with a large range.
   */
  @Test
  public void testOrderedPrimesInRange_LargeRange() {
    int[] result = PrimeNumbers.orderedPrimesInRange(1, 10000);
    assertEquals(100, result.length);
    assertTrue(result[99] != 0);
  }

  /**
   * Test for the scenario where there are no prime numbers in the specified range. This test
   * verifies that the result is an array of zeros.
   */
  @Test
  public void testOrderedPrimesInRange_NoPrimes() {
    int[] result = PrimeNumbers.orderedPrimesInRange(1, 1);
    int[] expected = new int[100];

    assertArrayEquals(expected, result);
  }

  /**
   * Test for an invalid year range where the start year is less than 1. This test verifies that an
   * IllegalArgumentException is thrown.
   */
  @Test
  public void testOrderedPrimesInRange_InvalidRange_StartLessThan1() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          PrimeNumbers.orderedPrimesInRange(-1, 50);
        });
  }

  /**
   * Test for an invalid range where the end year is greater than the upper limit. This test
   * verifies that an IllegalArgumentException is thrown.
   */
  @Test
  public void testOrderedPrimesInRange_InvalidRange_EndGreaterThan10000() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          PrimeNumbers.orderedPrimesInRange(50, 10001);
        });
  }

  /**
   * Test for an invalid range where the start is greater than the end. This test verifies that an
   * IllegalArgumentException is thrown.
   */
  @Test
  public void testOrderedPrimesInRange_InvalidRange_StartGreaterThanEnd() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          PrimeNumbers.orderedPrimesInRange(100, 50);
        });
  }

  /**
   * Test for invalid range where start is equal to end but out of valid range. This test ensures
   * that invalid single-year ranges are covered.
   */
  @Test
  public void testOrderedPrimesInRange_InvalidSingleYearRange() {
    assertThrows(
        IllegalArgumentException.class,
        () -> {
          PrimeNumbers.orderedPrimesInRange(10001, 10001);
        });
  }

  /**
   * Edge case: Test the isPrime method with various numbers. This test verifies that the method
   * correctly identifies prime and non-prime numbers.
   */
  @Test
  public void testIsPrime() {
    assertTrue(PrimeNumbers.isPrime(2));
    assertTrue(PrimeNumbers.isPrime(3));
    assertFalse(PrimeNumbers.isPrime(4));
    assertTrue(PrimeNumbers.isPrime(5));
    assertFalse(PrimeNumbers.isPrime(9));
    assertTrue(PrimeNumbers.isPrime(11));
    assertFalse(PrimeNumbers.isPrime(20));
    assertFalse(PrimeNumbers.isPrime(9991));
    assertFalse(PrimeNumbers.isPrime(9997));
  }
}
