/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/6/1040/problem
 */
package gcd;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static BigInteger gcd(BigInteger n1, BigInteger n2) {
		return n1.gcd(n2);
	}
	static long gcdI(long n1, long n2) {
		while(n1%n2!=0) {
			long rem = n1%n2;
			n1 = n2;
			n2 = rem;
		}
		return n2;
	}
	static long gcdR(long n1, long n2) {
		if(n1 == 0) return n2;
		return gcdR(n2%n1, n1);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// BigInteger
		BigInteger n1 = sc.nextBigInteger();
		BigInteger n2 = sc.nextBigInteger();
		BigInteger gcd = gcd(n1, n2);
		System.out.println(gcd);
//		// Long
//		long l1 = sc.nextLong();
//		long l2 = sc.nextLong();
//		long l3 = gcdI(l1, l2);
//		long l4 = gcdR(l1,l2);
		sc.close();
	}
}