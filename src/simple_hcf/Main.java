package simple_hcf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/738/problem
 */
public class Main {
	static int gcdI(int n1, int n2) {
		while(n1 % n2 != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		return n2;
	}
	static long gcdR(long n1, long n2) {
		return n1 == 0 ? n2 : gcdR(n1, n2 % n1);
	}
	static int gcd(String[] arr) {
		int result = Integer.parseInt(arr[0]);
		for(int i = 1; i < arr.length; i++) result = gcdI(result, Integer.parseInt(arr[i]));
		return result;
	}
	static BigInteger gcdB(String[] arr) {
		BigInteger result = new BigInteger(arr[0]);
		for(int i = 1; i < arr.length; i++) result = result.gcd(new BigInteger(arr[i]));
		return result;
	}
	// Taking irregular testcases as input
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		String[] arr = takeInput(sc, n).trim().split("\\s+");
		System.out.println(arr.length!=0?gcd(arr):"");
	}
}