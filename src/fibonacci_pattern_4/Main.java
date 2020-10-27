/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/498/problem
 */
package fibonacci_pattern_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static int series[] = new int[5050];
    static void enterElements(){
    	series[0] = 0;
        series[1] = 1;
        for(int i = 2; i < series.length; i++) series[i] = series[i - 1] + series[i - 2];
    }
    static void fibonacci_pattern(int n) {
    	int i = 0;
        for(int row = 0; row < n; row++){
            for(int col = 0; col <= row; col++){
            	System.out.print(series[i] + "\t");
                i++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
    	enterElements();
        int n = Integer.parseInt(sc.readLine().trim());
        fibonacci_pattern(n);
        sc.close();
    }
}