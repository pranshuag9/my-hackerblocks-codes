/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/practice/1/219/problem
 */
package von_neuman_loves_binary;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    static int myPow(int b,int power){
        int result=1;
        for(int i = 1; i <= power; i++) result = result * b;
        return result;
    }
    static int binary_to_decimal(int binary) {
    	int arr[] = new int[11];
        int i = 1, decimal = 0;
        while(binary != 0){
            int rem = binary % 10;
            binary = binary / 10;
            arr[i] = rem;
            i++;
        }
        int size=i;
        for(int j = 1; j < size; j++){
            if(arr[j] == 1){
                int a;
                a = myPow(2,j-1);
                decimal += a;
            }
        }
        return decimal;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(sc.readLine());
        for(int testcase = 0; testcase < testcases; testcase++){
        	int binary = Integer.parseInt(sc.readLine());
            int decimal = binary_to_decimal(binary);
            System.out.println(decimal);
        }
        sc.close();
    }
}