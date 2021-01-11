package reverse_an_array;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/2/1366/problem
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void reverseUsingFor(int[] arr) {
		for(int head = 0, tail = arr.length - 1; head < tail; head++, tail--) swap(arr, head, tail);
	}
	// Taking irregular testcases as input
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n)
			str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine().trim());
		int[] arr = Arrays.stream(takeInput(sc, n).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		reverseUsingFor(arr);
		for(int i : arr) System.out.println(i);
		sc.close();
	}
}