/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/206/problem
 */
package simple_input;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int cumulative_sum_till_negative() throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		while(sum>=0) {
			int n = Integer.parseInt(sc.readLine());
			sum += n;
			if(sum<0) break;
			else System.out.println(n);
		}
		sc.close();
		return sum;
	}
	public static void main(String[] args) throws Exception {
		cumulative_sum_till_negative();
	}
}
