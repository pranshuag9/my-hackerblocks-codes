package histogram;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	
	static int largestRectangleArea(int[] arr, int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int maxArea = Integer.MIN_VALUE;
		for(int i = 0; i <= n; i++) {
			int h = i != n ? arr[i] : 0;
			if(stack.isEmpty() || h >= arr[stack.peek()]) stack.push(i);
			else {
				int top = stack.pop();
				int currArea = arr[top] * (stack.isEmpty() ? i : i - stack.peek() - 1);
				maxArea = maxArea >= currArea ? maxArea : currArea;
				i--;
			}
		}
		return maxArea;
	}
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(takeInput(sc, 1));
		int[] arr = new int[n];
		String[] input = takeInput(sc, n).split(" ");
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(input[i]);
		int largestArea = largestRectangleArea(arr, n);
		System.out.println(largestArea);
		sc.close();
	}
}
