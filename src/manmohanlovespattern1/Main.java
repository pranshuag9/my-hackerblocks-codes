/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/929/problem
 */
package manmohanlovespattern1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void manmohanLovesPattern1(int n) {
		for(int row = 1; row < n + 1; row++) {
			if(row>1) {
				System.out.print(1);
				for(int col = 0; col < row - 2; col++) if(row%2!=0) System.out.print(1); else System.out.print(0);
				System.out.print(1);
			}else System.out.print(1);
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine().trim());
		manmohanLovesPattern1(n);
		sc.close();
	}
}