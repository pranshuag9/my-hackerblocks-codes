package nth_fibonacci_O_n;
import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/dcb/289
 */
public class Main {
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(takeInput(sc, 1));
		System.out.print(nthFibonacciOn(n));
		sc.close();
	}
	private static long nthFibonacciOn(int n) {
		if(n == 0 || n == 1) return n;
		long a = 0, b = 1, c = a + b;
		while(n-- - 2> 0) {
			a = b;
			b = c;
			c = a + b;
		}
		return c;
	}
}