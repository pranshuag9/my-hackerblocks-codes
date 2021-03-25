package pattern_inverted_triangle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/214/problem
 * Algorithm(start, end):
 * 1. if start > end, then return
 * 2. Recursively Increment start by 1
 * 3. This condition is executed when increasing stack of recursion is filled upto end, and now starts printing, so
 * 		for i:=0 to start step by 1, print("*\t")
 * 4. print(newline)
 */
public class Main {
	// My Input Function Taking irregular Testcases as input
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	static void patternInvertedTriangle(int start, int end) {
		if(start > end) return;
		patternInvertedTriangle(start + 1, end);
		for(int i = 0; i < start; i++) System.out.print("*\t");
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(takeInput(sc, 1));
		patternInvertedTriangle(0, n);
	}
}
