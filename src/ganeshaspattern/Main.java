/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/6/1055/problem
 */
package ganeshaspattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if (n % 2 == 1) {
			int start = 1, mid = (n + 1) / 2, end = n;
			for (int row = 1; row <= n; row++) {
				for (int col = 1; col <= n; col++) {
					if (row == mid) {
						System.out.print("*");
						continue;
					}
					if ((row < mid && ((col == start) || (col > mid && row == start))) || (row > mid && ((col < mid && row == end) || (col > mid && col == end))))
						System.out.print("*");
					else if ((row > mid || row < mid) && col == mid) System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}