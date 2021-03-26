package pattern_pascal_triangle1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/285/problem
 * Algorithm to Generate(arr, n):
 * for row:=0 to n step by 1,
 * 		for col:=0 to row + 1 step by 1,
 * 			Set arr[row][col] = 1 if column is 0 or equals row
 * 			Set arr[row][col] = (Sum of Diagonally Previous element and Upper previous element) if row > 1 and col > 0
 * 
 * Algorithm to Print(n):
 * for row:=0 to n step by 1
 * 		for col:=0 to (n - row) step by 1, Print("  ")
 * 		for col:=0 to (row + 1) step by 1,
 * 			for i:=0 to (4 - number of digits of n) step by 1, Print(" ")
 * 			Print(arr[row][col])
 * 		Print(newline)
 */
public class Main {
	// My input function that can handle irregular input
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	// METHOD 1
	static int[][] generatePascalTriangle(int n) {
		int[][] arr = new int[n][n];
		for(int row = 0; row < n; row++) for(int col = 0; col < row + 1; col++)
    		if(col == 0 || col == row) arr[row][col] = 1;
    		else if(row > 1 && col > 0) arr[row][col] = arr[row - 1][col - 1] + arr[row - 1][col];
		return arr;
	}
    private static void pascalTriangle2DArray(int n){
        int arr[][] = generatePascalTriangle(n);
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n - row; col++) System.out.print("  ");
            for(int col = 0; col < row + 1; col++) {
            	for(int i = 0; i < 4 - String.valueOf(arr[row][col]).length(); i++) System.out.print(" ");
            	System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
    // METHOD 2
    static int fact(int n) {
    	if(n == 0 || n == 1) return 1;
    	return n * fact(n - 1);
    }
    static int nCr(int n, int r) {
    	return fact(n) / (fact(r) * fact(n - r));
    }
    static void pascalTriangleNCR(int n) {
    	if(n == 1) System.out.print(n);
    	for(int i = 0; i < n; i++) {
    		for(int j = 0; j < n - i; j++) System.out.print(" ");
    		for(int k = 0; k <= i; k++) System.out.print(" " + nCr(i, k));
    		System.out.println();
    	}
    }
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(takeInput(sc, 1));
        pascalTriangle2DArray(n); // METHOD 1
//        pascalTriangleNCR(n); // METHOD 2
    }
}