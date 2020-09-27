/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/132/problem
 */
package chewbacca_and_number;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {
	static long chewbaccaAndNumbers(long n) {
        long num = n, sum = 0;
        double i = 0;
        while(n > 9){
            long rem = n % 10;
            if(rem > 9 - rem) rem = 9 - rem;
            long powerToI = (long) Math.pow(10.0000, i);
            sum += rem * powerToI;
            i++;
            n /= 10;
        }
        long first_digit = num / (long) Math.pow(10.0000, i);
        if(first_digit != 9 && first_digit > 9 - first_digit) first_digit = 9 - first_digit;
        long powerToI = (long) Math.pow(10.0000, i);
        sum += first_digit * powerToI;
        return sum;
	}
    public static void main(String[] args) throws Exception {
    	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    	long n = Long.parseLong(sc.readLine().trim()); 
    	long result = chewbaccaAndNumbers(n);
        System.out.println(result);
    	sc.close();
    }
}