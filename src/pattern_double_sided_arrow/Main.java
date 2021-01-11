/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/75/problem
 */
package pattern_double_sided_arrow;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void pattern_double_sided_arrow(int n){
		int last = n, nsp1 = last - 1, nn1 = 1, mid = (last + 1) / 2, nsp2 = 0, nn2 = 1;
        for(int row = 1; row <= n; row++){
        	int sum = 1;
            for(int col = 1; col <= 2 * n + 1; col++){
                System.out.print((col > nsp1 && (col <= nn1 + nsp1)) ? (last - col + 1) + " " : (((col >= nsp1 + nn1 + nsp2) && (col < nsp1 + nn1 + nsp2 + nn2))) ? sum++ + " " : "");
                System.out.print(((col <= nsp1) || (col < nn1 + nsp1 + nsp2) && (col > nn1 + nsp1)) ? "  " : "");
            }
            System.out.println();
            nsp1 = (row < mid) ? (nsp1 - 2) : (nsp1 + 2);
            nn1 = (row < mid) ? (nn1 + 1) : (nn1 - 1);
            last = (row < mid) ? (last - 1) : (last + 1);
            nsp2 = (row < mid) ? (nsp2 + 2) : (nsp2 - 2);
            nn2 = (row < mid) ? (nn2 + 1) : (nn2 - 1);
        }
	}
	public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine().trim());
        sc.close();
        pattern_double_sided_arrow(n);
    }
}
