package gcd;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	static BigInteger gcd(BigInteger n1, BigInteger n2) {
		return n1.gcd(n2);
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger n1 = sc.nextBigInteger();
		BigInteger n2 = sc.nextBigInteger();

		BigInteger gcd = gcd(n1, n2);
		
		System.out.println(gcd);
		sc.close();
	}
}