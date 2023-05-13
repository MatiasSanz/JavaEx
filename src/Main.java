//Exercise 1
//Matias Sanz

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        ArrayList<Integer> primes = new ArrayList<Integer>();

        // Parse command-line arguments
        for (String arg : args) {
            numbers.add(Integer.parseInt(arg));
        }

        // Check each number
        for (int num : numbers) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        // Print prime numbers
        System.out.println("Prime numbers:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
        System.out.println();
    }

    // Check if is prime
    public static boolean isPrime(int n) {
        if (n <= 1) { //0 or 1 and negative numbers
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { //module
                return false;
            }
        }
        return true;
    }
}