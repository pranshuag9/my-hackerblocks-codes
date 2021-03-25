package pattern_magic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/740/problem
 * Algorithm:
 * 1. Take input n
 * 2. Modify n to 2n-1
 * 3. Set c = n / 2
 * 4. for x:=0 to n step by 1
 * 5. for y:=0 to n step by 1
 * 6. if [y <= c and (y <= x - c or y <= -x + c)] 
 * 	  or [y > c and (y >= x + c or y >= -x + 3c)] then
 * 			Print("*")
 * 7. else 	Print(" ")
 * 8. Print(Newline)
 */
public class Main {
	// My Input Function Taking irregular Testcases as input
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	static void patternMagic(int n) {
		n = 2 * n - 1;
		int mid = n / 2;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++)
				if (((col <= mid && (col <= -row + mid || col <= row - mid)
						|| (col > mid && (col >= row + mid || col >= -row + 3 * mid)))))
					System.out.print("*");
				else System.out.print(" ");
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(takeInput(sc, 1));
        patternMagic(n);
        sc.close();
    }
}
