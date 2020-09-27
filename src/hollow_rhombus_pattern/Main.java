/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/231/problem
 */
package hollow_rhombus_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		for (int row = 1, start = n, end = 2 * n - 1; row <= n; row++, start--, end--) {
			for (int col = 1; col <= end; col++) if (col >= start && ((row == 1 || row == n) || (col == start || col == end))) System.out.print("*"); else System.out.print(" ");
			System.out.println();
		}
		sc.close();
	}
}
