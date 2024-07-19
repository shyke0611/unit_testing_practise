package com.example;

public class PrimeNumbers {

    /**
     * This method identifies prime numbers in the given range of numbers, stores them into an array,
     * and returns the array elements in ascending order (inherent from the iteration). The rest 
     * (unfilled out of size 100) of the array elements should be left as 0s.
     *
     * @param start The starting number of the range.
     * @param end The ending number of the range.
     * @return an array of prime numbers. The rest (unfilled out of size 100) of the array (all trailing)
     *     elements should be left as 0s.
     * @throws IllegalArgumentException if the range is invalid or out of 1-10000 range
     */
    public static int[] orderedPrimesInRange(int start, int end) {
        if (start < 1 || end > 10000 || start > end) {
            throw new IllegalArgumentException("Invalid range: " + start + " to " + end);
        }

        int[] primeNumbers = new int[100];
        int index = 0;

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                primeNumbers[index] = num;
                index++;
                if (index >= 100) break;
            }
        }

        return primeNumbers;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
