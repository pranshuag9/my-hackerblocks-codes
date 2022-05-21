package celebration;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * @author Pranshu Aggarwal
 * @problem https://hack.codingblocks.com/app/dcb/2740
 */
public class Main {
    static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    static String takeInput(BufferedReader sc, int n) throws Exception {
        String str = "";
        while(str.split(" ").length <= n) str += " " + sc.readLine().trim().replaceAll("\\s+", " ");
        return str.trim();
    }
    public static void main(String[] args) throws Exception {
        String[] NKLCDPNLNP = takeInput(sc, 8).split("\\s+");
        sc.close();

        int numberOfFriends = Integer.parseInt(NKLCDPNLNP[0]);
        int numberOfBottles = Integer.parseInt(NKLCDPNLNP[1]);
        int amountOfDrinkIn1Bottle = Integer.parseInt(NKLCDPNLNP[2]);
        int numberOfLemons = Integer.parseInt(NKLCDPNLNP[3]);
        int numberOfSlicesIn1Lemon = Integer.parseInt(NKLCDPNLNP[4]);
        int totalAmountOfSalt = Integer.parseInt(NKLCDPNLNP[5]);
        int amountOfDrinkIn1Toast = Integer.parseInt(NKLCDPNLNP[6]);
        int amountOfSaltIn1Toast = Integer.parseInt(NKLCDPNLNP[7]);
        int amountOfSlicesIn1Toast = 1;

        int totalAmountOfDrink = numberOfBottles * amountOfDrinkIn1Bottle;
        int totalLemonSlices = numberOfLemons * numberOfSlicesIn1Lemon;

        int numberOfToastsBy1PersonBasedOnSalt = totalAmountOfSalt / amountOfSaltIn1Toast;
        int numberOfToastsBy1PersonBasedOnDrink = totalAmountOfDrink / amountOfDrinkIn1Toast;
        int numberOfToastsBy1PersonBasedOnSlices = totalLemonSlices / amountOfSlicesIn1Toast;

        int min = numberOfToastsBy1PersonBasedOnDrink;
        if (min > numberOfToastsBy1PersonBasedOnSlices) min = numberOfToastsBy1PersonBasedOnSlices;
        if (min > numberOfToastsBy1PersonBasedOnSalt) min = numberOfToastsBy1PersonBasedOnSalt;

        int numberOfToastsCanBeMade = min / numberOfFriends;

        System.out.println(numberOfToastsCanBeMade);
    }
}
