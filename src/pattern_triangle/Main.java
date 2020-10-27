/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/189/problem
 */
package pattern_triangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void pattern_triangle(int n) {
		int start = 0, mid = n - 1, end = 2 * n - 1;
        for(int row = start; row <= mid; row++) {
        	int result = row + 1;
        	for(int col = start; col < end; col++)
        		if((col <= mid && col >= -row + mid) || (col > mid && col <= row + mid)) {
        			System.out.print(result + "\t");
        			if(col < mid) result++;
        			else result--;
        		}else System.out.print(" \t");
        	System.out.println();
        }
	}
    public static void main(String[] args) throws Exception {
    	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(sc.readLine().trim());
        pattern_triangle(n);
        sc.close();
    }
}
