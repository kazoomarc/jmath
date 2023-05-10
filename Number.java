import java.util.Arrays;

/**
 * Number Deals with sorts of operations on numbers
 *
 * @author Joel Mwala
 * @version 1.0
 *
 */

// todo: Optimise all methods for speed
// todo: stackoverflow work around
// todo: handle BigIntiger
// todo: variadic input

public class Number {

    /**
     *
     * @param n
     * @return true if n is Positive
     */
    public static boolean isPositive(int n) {
        return (n > 0) ? true : false;
    }

    /**
     *
     * @param n
     * @return true if n is Negative
     */
    public static boolean isNegative(int n) {
        return !(isPositive(n));
    }

    /**
     * checks if a given string is a valid digit
     *
     * @param str
     * @return true if str is a valid digit, false otherwise
     */
    public static boolean isDigit(String str) {
        // check if string is empty
        if (str == null || str.isEmpty()) {
            return false;
        }

        // todo: what if there's space at the begining
        // check if all chars are digits
        for (char c : str.toCharArray()) {
            if (!(Character.isDigit(c))) {
                return false;
            }
        }
        return true;
    }

    /**
     * checks if a given string represents a valid number
     *
     * @param str
     * @return true if str is a valid number, false otherwise
     */
    public static boolean isNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    /**
     *
     * @param s
     * @return integer converted from s
     */
    public static int toDigit(String s) {
        return Integer.parseInt(s);
    }

    /**
     *
     * @param n
     * @return absolute value of n
     */
    public static int abs(int n) {
        return (n < 0) ? n * -1 : n * 1;
    }

    /**
     * checks if divisor divides num
     *
     * @param num     an integer to check for divisibility
     * @param divisor the divisor to use for the check
     * @return true if divisor divides num, false otherwise
     * @throws IllegalArgumentException if divisor is zero
     */
    public static boolean isDivisible(int num, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor can not be zero");
        }

        return num % divisor == 0;
    }

    /**
     * Returns an array of integers containing all the divisors of a given integer
     *
     * @param n the integer to find the divisors of
     * @return an array of integers representing the divisors of n, including itself
     */
    public static int[] divisors(int n) {
        int[] divisors = new int[n / 2 + 1];
        int count = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors[count] = 1;
                count++;
            }
        }

        divisors[count] = n;

        return Arrays.copyOf(divisors, count + 1);
    }

    // boolean isPrime(int n);
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (isDivisible(n, i)) {
                return false;
            }
        }
        return true;
    }

    // int[] primes(int n);
    // int[] primes(int start, int end);
    // int[] primesInRange(int n)
    // int[] primesInRange(int start, int end);
    // int[] primeFactors(int n);

    // int factorial(int n)
    // boolean isFactorial(int n);

    // permutation
    // combination

    // boolean isFibb(int n)
    // int[] fibbInRange(int n)
    // int[] fibbInRange(int start, int end);

    // digitOfPI(int n);

    // int max(int[] nums);
    // int min(int[] nums);
    // int sum(int[] nums);
    // double average(int[] nums);
    // int mode(int[] nums);
    // int median(int[] nums);
    // int[] sort(int[] nums);
    // int[] rsort(int[] nums);
    // int[] shuffle(int[] nums);

    // boolean isPerfectSquare(int n);
    // boolean isPerfectNumber(int n);
    // boolean isPowerOfTwo(int n);
    // int[] powersOfTwo(int n);

    /**
     * gcd - using euclid algorithm
     *
     * @param num1 number to do gcd on
     * @param num2 number to do gcd on
     * @return the gcd
     */
    public static int gcd(int num1, int num2) {
        int numL = (num1 > num2) ? num1 : num2;
        int numS = (num1 > num2) ? num2 : num1;

        int r = 1;
        int check = 1;

        while (check != 0) {
            if (numL % numS != 0)
                r = numL % numS;
            else
                check = 0;
            numL = numS;
            numS = r;
        }

        return r;
    }

    /**
     * LCM(a,b) = (a*b) / GCD(a,b)
     *
     * @param a
     * @param b
     * @return lowest common multiple
     */
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    //
    // int[] uniquePrimeFactors(int n);
    // int numDivisors(int n);
    // int totient(int n);
    // int numDigits(int n);
    // int[] digits(int n);
    // int reverse(int n);
    // boolean isPalindrome(int n);

    // int summate(int start, int end, Expression e);
    // int summate(int end, Expression e); //start will be assumed to be 0;

    // int[] factorize(int n);
    // int[] uniqueFactors(int n);

    // int binomialCoeff(int n, int k);
    // int gcd(int a, int b);
    // int lcm(int a, int b);
    // int[] collatz(int n);
    // int digitalRoot(int n);
    // approximate(PI)

    // boolean isAbundantNumber(int n);
    // int[] abundantNumbers(int start, int end);
    // boolean isAbundant(int n);

    // int[] perfectNumbers(int start, int end);
    // boolean isPerfectPower(int n);
    // boolean isPerfectSquare(int n);
    // boolean isPerfectCube(int n);

    // boolean isAmicablePair(int a, int b);
    // int[] amicablePairs(int start, int end);

    // boolean isDeficient(int n);
    // boolean isHarshad(int n);

    // boolean isArmstrong(int n);
    // boolean isArmstrongNumber(int n);

    // more constnts
    // approximate(E)

    /** ALGEBRA */
    // Expression express(String e[]);
    // Expression factorize(Expression e);
    // Expression limit()
    // Expression differentiate (Expression e);
    // Expression differentiate (int order, Expression e );

    /* BOOLEAN ALGEBRA */

}
