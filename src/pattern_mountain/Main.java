/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/571/problem
 */
package pattern_mountain;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void pattern_mountain(int n) {
		int start = 0, mid = n - 1, last = 2 * n - 1;
        for(int row = start; row <= mid; row++) {
        	for(int col = start; col < last; col++)
        		if(col <= mid && col <= row) System.out.print((col + 1) + "\t");
        		else if(col > mid && col >= -row + 2 * mid) System.out.print((2 * mid - col + 1) + "\t");
        		else System.out.print(" \t");
        	System.out.println();
        }
	}
    public static void main(String args[]) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine().trim());
        pattern_mountain(n);
        sc.close();
    }
}
