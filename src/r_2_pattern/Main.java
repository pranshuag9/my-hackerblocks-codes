/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/54/problem
 */
package r_2_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void r2_pattern_recursive(int n) {
		if(n<1) return;
		if(n % 2 != 0) System.out.println(n);
		r2_pattern_recursive(n-1);
		if(n % 2 == 0 && n != 0) System.out.println(n);
	}
	static void r2_pattern_iterative(int n) {
		for(int i = n; i > 0; i--) if(i % 2 != 0) System.out.println(i);
		for(int i = 2; i <= n; i++) if(i % 2 == 0) System.out.println(i);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine().trim());
		r2_pattern_iterative(n);
//		r2_pattern_recursive(n);
	}

}
