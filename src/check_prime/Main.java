/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/919/problem
 */
package check_prime;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static boolean check_prime(int n) {
		if(n<2) return false;
		boolean[] primes = new boolean[n+1];
		primes[2] = true;
		for(int i=3; i<primes.length;i+=2) primes[i] = true;
		for(int i=3; i<primes.length;i+=2)
			if(primes[i])
				for(int j=i*i; j<primes.length; j+=i)
					primes[j] = false;
		return primes[n];
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		sc.close();
		System.out.println(check_prime(n)?"Prime":"Not Prime");
	}
}
