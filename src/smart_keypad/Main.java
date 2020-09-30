/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/742/problem
 */
package smart_keypad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	private static String[] table = { " ", ".+@$", "abc", "def", "ghi", "jkl" , "mno", "pqrs" , "tuv", "wxyz" };
    private static void smartKeypad(ArrayList<Integer> list, int i, StringBuilder str){
        if(i == list.size()){
            System.out.println(str);
            return;
        }
        for(int j = 0; j < table[list.get(i)].length(); j++){
            char ch = table[list.get(i)].charAt(j);
            smartKeypad(list, i + 1, str.append(ch));
            str.deleteCharAt(str.length() - 1);
        }
    }
    public static void main(String[] args) throws Exception {
    	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine().trim());
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            int rem = n % 10;
            n /= 10;
            list.add(0, rem);
        }
        StringBuilder str = new StringBuilder("");
        smartKeypad(list, 0, str);
    }
}
