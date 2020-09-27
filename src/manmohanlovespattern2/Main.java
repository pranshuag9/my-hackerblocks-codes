/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/232/problem
 */
package manmohanlovespattern2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static void method1(int n) {
		for(int row = 1; row<n+1; row++) {
			if(row>1) {
				System.out.print(row-1);
				for(int col = 0; col < row - 2; col++) System.out.print(0);
				System.out.println(row-1);
			}else System.out.println(row);
		}
	}
	static void method2(int n) {
		int first = 1;
        System.out.println(first);
        for(int row=1;row<n;row++){
            for(int col=1;col<=row+1;col++) 
            	if(col==1||col==row+1) System.out.print(row); 
            	else System.out.print("0");
            System.out.println();
        }
	}
    public static void main(String[] args) throws Exception {
    	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine().trim());
		method1(n);
    }
}