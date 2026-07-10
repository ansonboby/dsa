public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));
        System.out.println("fib(7) = " + fib(7));
        System.out.println("sum(10) = " + sum(10));
        System.out.println("power(2, 10) = " + power(2, 10));
        printN(5);
        System.out.println();
        System.out.println("palindrome('racecar') = " + isPalindrome("racecar"));
        System.out.println("palindrome('hello') = " + isPalindrome("hello"));
    }

    static int factorial(int n) {
        if (n <= 1) return 1;          // base case
        return n * factorial(n - 1);    // recursive case
    }

    static int fib(int n) {
        if (n <= 1) return n;           // fib(0)=0, fib(1)=1
        return fib(n - 1) + fib(n - 2);
    }

    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    static int power(int base, int exp) {
        if (exp == 0) return 1;
        return base * power(base, exp - 1);
    }

    static void printN(int n) {
        if (n == 0) return;
        printN(n - 1);
        System.out.print(n + " ");
    }

    static boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return isPalindrome(s.substring(1, s.length() - 1));
    }
}

/*
--- EXERCISES ---
1. Write a recursive method `gcd(a, b)` using Euclid's algorithm
2. Write a recursive method `reverseString(String s)` that returns reversed string
3. Write a recursive method to compute the sum of all elements in an array
*/
