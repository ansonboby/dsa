public class StringsDemo {
    public static void main(String[] args) {
        // ---- String basics ----
        String s = "hello world";
        System.out.println("Length: " + s.length());
        System.out.println("Char at 1: " + s.charAt(1));
        System.out.println("Substring (0-5): " + s.substring(0, 5));

        // ---- Comparisons ----
        String a = "apple";
        String b = "banana";
        System.out.println(a.equals(b));          // false
        System.out.println(a.compareTo(b));       // negative: a < b
        System.out.println(a.equalsIgnoreCase("APPLE")); // true

        // ---- Searching ----
        System.out.println(s.indexOf("world"));   // 6
        System.out.println(s.contains("hello"));  // true
        System.out.println(s.startsWith("hel"));  // true
        System.out.println(s.endsWith("ld"));     // true

        // ---- Manipulation ----
        System.out.println("  spaced  ".trim());
        System.out.println(s.replace('l', 'z'));
        System.out.println(s.toUpperCase());

        // ---- char[] conversion ----
        char[] chars = s.toCharArray();
        chars[0] = 'H';
        System.out.println(new String(chars));

        // ---- StringBuilder (for building strings efficiently) ----
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());

        // ---- Splitting ----
        String csv = "a,b,c,d";
        String[] parts = csv.split(",");
        for (String p : parts) {
            System.out.println("  part: " + p);
        }

        // ---- Palindrome check ----
        String test = "racecar";
        boolean isPal = true;
        for (int i = 0; i < test.length() / 2; i++) {
            if (test.charAt(i) != test.charAt(test.length() - 1 - i)) {
                isPal = false;
                break;
            }
        }
        System.out.println(test + " is palindrome: " + isPal);
    }
}

/*
--- EXERCISES ---
1. Write a method `countVowels(String s)` that returns count of a/e/i/o/u
2. Write a method `reverseWords(String s)` that reverses each word in a sentence
3. Write a method that checks if two strings are anagrams (same letters, different order)
*/
