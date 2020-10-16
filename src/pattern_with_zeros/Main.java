/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/484/problem
 */
package pattern_with_zeros;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void patternWithZeros(int n) {
		for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++)
                if(col == 1 || col == row) System.out.print(row + "\t");
                else System.out.print(0 + "\t");
            System.out.println();
        }
	}
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine().trim());
        patternWithZeros(n);
        sc.close();
    }
}