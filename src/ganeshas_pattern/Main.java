package ganeshas_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/6/1055/problem
 * Algorithm:
 * 1. Take input n
 * 2. if n is odd then
 * 3. start = 1, c = (n+1)/2, end=n
 * 4. for x:=1 to n + 1 step by 1
 * 5. for y:=1 to n + 1 step by 1
 * 6. if x == c or (x < c && ((y == start) || (y > c && x == start)))
 * 	 or (x > c && ((y < c && x == end) || (y > c && y == end)))
 *   or (y == c && (x > c || x < c)))
 *   	Print("*")
 * 7. else Print(" ")
 * 8. end for loop
 * 9. Print(newline)
 * 10.end for loop
 * 11. else Recursively call(n+1)
 */
public class Main {
	// My Input Function Taking irregular Testcases as input
	static String takeInput(BufferedReader sc, int n) throws Exception{
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	static void printGanesha(int n) {
		if (n % 2 == 1) {
			int start = 1, mid = (n + 1) / 2, end = n;
			for (int row = 1; row <= n; row++) {
				for (int col = 1; col <= n; col++) {
					if (row == mid 
							|| (row < mid && ((col == start) || (col > mid && row == start))) 
							|| (row > mid && ((col < mid && row == end) || (col > mid && col == end))) 
							|| (col == mid && (row > mid || row < mid)))
						System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println();
			}
		}else printGanesha(n + 1);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(takeInput(sc, 1));
        printGanesha(n);
        sc.close();
	}
}