/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/1381/problem
 */
package replace_all_pi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	private static String ReplaceAllPi(int end, int current, String given, String ans){
        if(given.length() <= 1) return given;
        if(current == end) return ans;
        ans = ans + given.charAt(current);
        if(current != 0){
            String str = given.substring(current-1, current+1);
            if(str.equals("pi")) ans = ans.substring(0, ans.length() - 2) + "3.14";
        }
        ans = ReplaceAllPi(end, current + 1, given, ans);
        return ans;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(sc.readLine().trim());
        for(int testcase = 0; testcase < testcases; testcase++){
            String str = sc.readLine().trim();
            System.out.println(ReplaceAllPi(str.length(), 0, str, ""));
        }
        sc.close();
    }
}