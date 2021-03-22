package finding_cb_numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/165/problem
 * Algorithm: 
 * 1. Put loop on string that will give substring of every length.
 * 2. Create a function that will return true if the passed number is a CB number else return false.
 * 3. To put a check if the digit is already a part of the any other CB number, create an boolean array say, valid which store which digits till now has been a part of any other CB number.
 * 4. Take a counter and increment if a CB number is found.
 * 5. Print the count.
 */
public class Main {
	static boolean isPrime(long sub) {
		if(sub == 0 || sub == 1) return false;
		int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		for(int i = 0; i < prime.length; i++) if(sub == prime[i]) return true;
		for(int i = 0; i < prime.length; i++) if(sub % prime[i] == 0) return false;
		return true;
	}
	static boolean isValid(boolean[] visited, String str, int start, int end) {
		for(int i = start; i < end; i++) if(visited[i]) return false;
		return true;
	}
	static int countCBnumbers(int N, String str) {
		boolean[] visited = new boolean[N];
		int len = 1, cnt = 0;
		while(len <= N) {
			int start = 0;
			while(start <= N - len) {
				int end = start + len;
				String sub = str.substring(start, start + len);
				long val_of_sub;
				try{
					val_of_sub = Long.parseLong(sub);
				}catch(Exception e) {
					val_of_sub = 0;
				}
				if(isPrime(val_of_sub) && isValid(visited, sub, start, end)) {
					for(int i = start; i < end; i++) visited[i] = true;
					cnt++;
				}
				start++;
			}
			len++;
		}
		return cnt;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(sc.readLine());
		String str = sc.readLine();
		System.out.println(countCBnumbers(N, str));
	}
}
