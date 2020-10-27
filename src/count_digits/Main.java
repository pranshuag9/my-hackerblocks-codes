/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/64/problem
 */
package count_digits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int count_digits(int n, int digit) {
		int count = 0;
        while(n != 0){
            if((n % 10) == digit) ++count;
            n /= 10;
        }
        return count;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine().trim());
        int digit = Integer.parseInt(sc.readLine().trim());
        System.out.println(count_digits(n, digit));
        sc.close();
	}
}
