/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/41/problem
 */
package hollow_diamond_pattern6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void hollow_diamond_pattern(int n) {
		int mid = n / 2;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++)
				if (((col <= mid && (col <= -row + mid || col <= row - mid)
						|| (col > mid && (col >= row + mid || col >= -row + 3 * mid)))))
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine().trim());
		hollow_diamond_pattern(n);
		sc.close();
	}
}