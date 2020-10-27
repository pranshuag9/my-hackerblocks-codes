/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/1102/problem
 */
package is_armstrong_number;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int myPow(int exp, int pow){
        int result = 1;
        for(int i = 0; i < pow; i++) result *= exp;
        return result;
    }
	static boolean is_armstrong_number(int n) {
        int temp = n, pow = 0;
        int arr[] = new int[11];
        while (temp > 0){
            arr[pow] = temp % 10;
            temp /= 10;
            pow++;
        }
        int size = pow, sum = 0;
        for(int j = 0; j < size; j++) sum += myPow(arr[j], pow);
        return sum == n;
	}
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine().trim());
        System.out.println(is_armstrong_number(n));
        sc.close();
    }
}
