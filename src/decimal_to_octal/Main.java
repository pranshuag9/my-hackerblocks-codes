/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/217/problem
 */
package decimal_to_octal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int myPow(int exp, int pow) {
		int result = 1;
		for(int i = 0; i < pow; i++) result *= exp;
		return result;
	}
	static void decimal_to_octal(int n) {
		int i = 0, BASE = 8, sum = 0;
        while(n > 0) {
        	int rem = n % BASE;
        	sum += rem * myPow(10, i);
        	n /= BASE;
        	i++;
        }
        System.out.println(sum);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine().trim());
        decimal_to_octal(n);
	}
}
