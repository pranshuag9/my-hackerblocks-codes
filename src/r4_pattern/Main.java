package r4_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/5/problem
 */
public class Main {
	// My Input Function Taking irregular Testcases as input
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(takeInput(sc, 1)), sum = 1;
        for(int row = 1; row <= 2 * n - 1; row++){
            if(row % 2 == 1){
                for(int col = 1; col <= sum; col++) System.out.print("*");
                sum++;
            }
            System.out.println();
        }
        sc.close();
    }
}