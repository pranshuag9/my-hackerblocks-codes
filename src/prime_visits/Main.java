/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/1039/problem
 */
package prime_visits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static boolean[] primes;
	static final int MAX_SIZE = 1000005;
	static void sieveOfEratosthenes() {
		primes = new boolean[MAX_SIZE+1];
		primes[2] = true;
		for(int i = 3; i < primes.length; i += 2) primes[i] = true;
		for(int i = 3; i * i < primes.length; i += 2) if(primes[i]) for(int j = i * i; j < primes.length; j += i) primes[j] = false;
	}
	static int prime_visits(int a, int b) {
		int result = 0;
        for(int i = a; i <= b; i++) if(primes[i]) result++;
        return result;
	}
	public static void main(String[] args) throws Exception {
		sieveOfEratosthenes();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(sc.readLine().trim());
        while(testcases > 0){
        	String[] input = sc.readLine().trim().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            System.out.println(prime_visits(a, b));
            testcases--;
        }
        sc.close();
    }
}
