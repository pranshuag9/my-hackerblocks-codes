/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/853/problem
 */
package odd_and_even_back_in_delhi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static boolean odd_and_Even_back_in_delhi(int n) {
		int even = 0, odd = 0;
        while(n != 0){
            int rem = n % 10;
            if(rem % 2 == 0) even += rem;
            else odd += rem;
            n /= 10;
        }
		return (even % 4 == 0 || odd % 3 == 0);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int testcases = Integer.parseInt(sc.readLine().trim());
        for(int testcase = 0;testcase < testcases; testcase++) System.out.println(odd_and_Even_back_in_delhi(Integer.parseInt(sc.readLine().trim()))?"Yes":"No");
        sc.close();
	}
}
