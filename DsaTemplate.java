import java.io.*;
import java.util.*;

public class DsaTemplate {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
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

    static FastReader sc = new FastReader();
    static PrintWriter out = new PrintWriter(System.out);
    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        int t = sc.ni();
        while (t-- > 0) solve();
        out.close();
    }

    static void solve() {
        int n = sc.ni();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.ni();
        // solution here
    }
}
