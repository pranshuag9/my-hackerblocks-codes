/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/67/problem
 */
package prateeklovescandy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	/**
	 * (2^32)/2 = 2147483648
	 */
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static final int MAX_SIZE = 1000005;
	static void sieveOfEratosthenes() {
		boolean[] primes = new boolean[MAX_SIZE];
		list.add(0);
		list.add(2);
		for(int i=3;i<primes.length;i=i+2) primes[i] = true;
		for(int i=3;i*i<primes.length; i=i+2) 
			if(primes[i])
				for(int j=i*i;j<primes.length;j+=i) 
					primes[j] = false;
		for(int i=3;i<primes.length;i+=2) if(primes[i]) list.add(i);
	}
	public static void main(String[] args) throws Exception {
		sieveOfEratosthenes();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(sc.readLine());
		for(int i=0;i<testcases;i++) {
			int n = Integer.parseInt(sc.readLine());
			System.out.println(list.get(n));
		}
		sc.close();
	}
}