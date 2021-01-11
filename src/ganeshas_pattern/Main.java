/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/6/1055/problem
 */
package ganeshas_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void printGanesha(int n) {
		if (n % 2 == 1) {
			int start = 1, mid = (n + 1) / 2, end = n;
			for (int row = 1; row <= n; row++)
				for (int col = 1; col <= n; col++) {
					if (row == mid || (row < mid && ((col == start) || (col > mid && row == start))) || (row > mid && ((col < mid && row == end) || (col > mid && col == end))))
						System.out.print("*");
					else if ((row > mid || row < mid) && col == mid) System.out.print("*");
					else System.out.print(" ");
				System.out.println();
			}
		}else printGanesha(n + 1);
	}
	public static void main(String[] args) throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		printGanesha(n);
		sc.close();
	}
}