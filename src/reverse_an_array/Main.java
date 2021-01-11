package reverse_an_array;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/2/1366/problem
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void reverseUsingFor(int[] arr) {
		for(int head = 0, tail = arr.length - 1; head < tail; head++, tail--) swap(arr, head, tail);
	}
	static void printArray(int[] arr) {
		for(int i : arr) System.out.println(i);
	}
	public static void main(String[] args) throws Exception {
		// Using this because of wrong input testcases in problem
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =	 new int[n];
		for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
//		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(sc.readLine().trim());
//		long startTime, endTime;
//		startTime = System.nanoTime();
//		int[] arr = Arrays.stream(sc.readLine().trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		reverseUsingFor(arr);
		printArray(arr);
//		endTime = System.nanoTime();
//		System.out.println(endTime - startTime + "ns");
		sc.close();
	}
}
