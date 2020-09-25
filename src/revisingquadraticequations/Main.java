/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/1320/problem
 */
package revisingquadraticequations;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = sc.readLine().split(" ");
        double a = Double.parseDouble(inputArr[0]);
        double b = Double.parseDouble(inputArr[1]);
        double c = Double.parseDouble(inputArr[2]);
        double d = b * b - (4 * a * c);
        
        double alpha = ((-b) + (Math.sqrt(d))) / 2 * a;
        double beta = ((-b) - (Math.sqrt(d))) / 2 * a;
        
        if(d == 0){
            System.out.println("Real and Equal");
            System.out.println((int)alpha + " " + (int)beta);
        }else if(d > 0){
            System.out.println("Real and Distinct");
            System.out.println((int)beta + " " + (int)alpha);
        }else System.out.println("Imaginary");
    }
}