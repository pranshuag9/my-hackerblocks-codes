package pattern_inverted_hour_glass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/488/problem
 * Algorithm:
 * 1. Set Middlerow = n, Middlecol = n+1, nn1 = 1, nn2 = 1, nsp = 2n-1, end=2n+1
 * 2. for row:=1 to end+1 step by 1
 * 		for col:=1 to end+1 step by 1
 * 			if col <= (number of numbers in block1 nn1) then Print(Middlecol - col + " ")
 * 			else if col <= (number of spaces nsp + nn1) then Print("  ")
 * 			else if col <= (nsp + nn1 + number of numbers in block2 nn2) then Print(col - Middlecol + " ")
 * 3. 	nn1 = nn1+1 if row <= Middlerow else nn1-1
 * 4. 	nn2 = nn2+1 if row <= Middlerow else nn2-1
 * 5. 	nsp = nsp-2 if row <= Middlerow else nsp+2
 * 6. 	Print(newline)
 * 7. end for loop
 */
public class Main {
	// My Input Function Taking irregular Testcases as input
	static String takeInput(BufferedReader sc, int n) throws Exception{
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	static void printInvertedHourGlass(int n) {
		int middlecol = n + 1, middlerow = n, nn1 = 1, nn2 = 1, nsp = 2 * n - 1, end = 2 * n + 1;
        for(int row = 1; row <= end; row++){
            for(int col = 1; col <= end; col++)
                if(col <= nn1) System.out.print(middlecol - col + " ");
                else if(col <= (nsp + nn1)) System.out.print("  ");
                else if(col <= (nn2 + nn1 + nsp)) System.out.print(col - middlecol + " ");
            nn1 = (row <= middlerow) ? nn1 + 1 : nn1 - 1;
            nsp = (row <= middlerow) ? nsp - 2 : nsp + 2;
            nn2 = (row <= middlerow) ? nn2 + 1 : nn2 - 1;
            System.out.println();
        }
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(takeInput(sc, 1));
        printInvertedHourGlass(n);
	}
}