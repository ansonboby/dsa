public class Basics {
    public static void main(String[] args) {
        // ---- Variables & Types ----
        int age = 18;
        double pi = 3.14;
        boolean isStudent = true;
        String name = "Anson";
        System.out.println(name + " is " + age + " years old");

        // ---- Arrays ----
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Length: " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // enhanced for loop
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();

        // ---- Conditionals ----
        int score = 85;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        // ---- Loops ----
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        int i = 0;
        while (i < 5) {
            System.out.println("while: " + i);
            i++;
        }

        // ---- Methods ----
        int result = add(10, 20);
        System.out.println("add result: " + result);
        greet("Anson");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

/*
--- EXERCISES ---
1. Write a method `isEven(int n)` that returns true if n is even
2. Print the multiplication table of 7 using a for loop
3. Write a loop that sums all numbers from 1 to 100 and print the result
*/
