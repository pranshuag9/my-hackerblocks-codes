/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/1092/problem
 */
package smart_keypad_advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    private static ArrayList<String> substrings = new ArrayList<>();
    private static void smartKeypad1(ArrayList<Integer> list, int i, StringBuilder str){
        if(i==list.size()){
            String s = str.toString();
            substrings.add(s);
            return;
        }
        for(int j=0;j<table[list.get(i)].length();j++){
            char ch = table[list.get(i)].charAt(j);
            smartKeypad1(list,i+1,str.append(ch));
            str.deleteCharAt(str.length()-1);
        }
    }
    private static boolean isSubstring(String s1, String s2){
        int M = s1.length();
        int N = s2.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++) if (s2.charAt(i + j) != s1.charAt(j)) break;
            if (j == M) return true;
        }
        return false;
    }
    private static void smartKeypadAdvanced(){
        String[] searchIn = {
                "prateek", "sneha", "deepak", "arnav", "shikha", "palak",
                "utkarsh", "divyam", "vidhi", "sparsh", "akku"
        };
        for(int i=0;i<substrings.size();i++){
            String s1 = substrings.get(i);
            for(int j=0;j<searchIn.length;j++){
                String s2 = searchIn[j];
                if(isSubstring(s1,s2)) System.out.println(s2);
            }
        }
    }
    public static void main(String[] args) throws Exception {
    	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine().trim());
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            list.add(0,rem);
        }
        StringBuilder str = new StringBuilder("");
        smartKeypad1(list,0,str);
        smartKeypadAdvanced();
    }
}
