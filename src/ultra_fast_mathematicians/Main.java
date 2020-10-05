/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/170/problem
 */
package ultra_fast_mathematicians;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder ultra_fast_mathematician(String[] arr) {
		StringBuilder sb1 = new StringBuilder(arr[0]);
        StringBuilder sb2 = new StringBuilder(arr[1]);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < arr[0].length(); i++) result.append(sb1.charAt(i) ^ sb2.charAt(i));
        return result;
	}
	public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(sc.readLine().trim());
        for (int testcase = 0; testcase < testcases; testcase++) System.out.println(ultra_fast_mathematician(sc.readLine().trim().split(" ")));
        sc.close();
    }
}
