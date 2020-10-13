/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/104/problem
 */
package count_set_bits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static int decimalToBinaryOnesCount(int n){
        int count = 0;
        while(n != 0){
            int rem = n % 2;
            n = n / 2;
            if(rem == 1) count++;
        }
        return count;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(sc.readLine().trim());
        for(int testcase = 0;testcase < testcases; testcase++){
            int n = Integer.parseInt(sc.readLine().trim());
            System.out.println(decimalToBinaryOnesCount(n));
        }
        sc.close();
    }
}
