package piyush_and_magical_park;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/1051/problem
 */
public class Main {
	static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	static String takeInput(BufferedReader sc, int n) throws Exception {
		String str = "";
		while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
		return str.trim();
	}
	static int canPiyushTravel(int N, int M, int K, int S) throws Exception {
		for(int i = 0; i < N; i++)
			if(S > K) {
				String[] str = takeInput(sc, M).split("\\s+");
				for(int j = 0; j < M && S > K; j++) {
					char ch = str[j].charAt(0);
					if(ch == '#') break;
					S = (ch == '.' && j != M - 1) ? S - 3 : (ch == '.' && j == M - 1) ? S - 2 : (ch == '*' && j != M - 1) ? S + 4 : S + 5;
				}
			}else break;
		return S;
	}
	public static void main(String[] args) throws Exception {
		String[] NMKS = takeInput(sc, 4).split("\\s+");
		int N = Integer.parseInt(NMKS[0]), M = Integer.parseInt(NMKS[1]), K = Integer.parseInt(NMKS[2]), S = Integer.parseInt(NMKS[3]);
		S = canPiyushTravel(N, M, K, S);
		System.out.println((S > K ? "Yes\n" + S : "No"));
		sc.close();
	}
}