import java.io.*;
import java.util.*;

public class IoDemo {
    public static void main(String[] args) {
        // ---- Scanner (simple) ----
        // Uncomment to try:
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // String s = sc.next();
        // System.out.println("You entered: " + n + ", " + s);
        // sc.close();

        // ---- FastReader template (use for competitive coding) ----
        // This reads faster than Scanner, important for large inputs
        FastReader fr = new FastReader();
        System.out.println("Enter your name: ");
        String name = fr.ns();
        System.out.println("Enter your age: ");
        int age = fr.ni();
        System.out.println("Hello " + name + " (age " + age + ")");

        // ---- Reading arrays ----
        System.out.println("Enter 3 numbers separated by spaces: ");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = fr.ni();
        }
        System.out.println("Array: " + Arrays.toString(arr));

        // ---- PrintWriter (faster output) ----
        PrintWriter out = new PrintWriter(System.out);
        out.println("This is faster output using PrintWriter");
        out.flush(); // remember to flush!
        // out.close(); // uncomment if this is the last output
    }
}

// FastReader — copy this into every competitive problem
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreTokens()) {
            try { st = new StringTokenizer(br.readLine()); }
            catch (IOException e) { e.printStackTrace(); }
        }
        return st.nextToken();
    }

    int ni() { return Integer.parseInt(next()); }
    long nl() { return Long.parseLong(next()); }
    double nd() { return Double.parseDouble(next()); }
    String ns() { try { return br.readLine(); } catch (IOException e) { return ""; } }
}

/*
--- EXERCISES ---
1. Write a program that reads N (from input), then reads N integers, finds their sum
2. Write a program that reads lines until "exit" is typed, prints line count
3. Write a program that reads a CSV line "name,age,mark" and parses it
*/
