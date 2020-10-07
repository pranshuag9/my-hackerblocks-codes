/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/3/100/problem
 */
package print_reverse;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void print_reverse(char[] num) {
		for(int i = 0, j = num.length - 1; i < num.length/2; i++, j--) swap(num,i,j);
		for(char c: num) System.out.print(c);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		char[] num = sc.readLine().trim().toCharArray();
		print_reverse(num);
		sc.close();
	}
}
