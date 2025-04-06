package sc02;

/*
Input
a#b!GE*T@S

Output
S#T!EG*b@a

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();
            char[] chars = input.toCharArray();
            int lp = 0;
            int rp = chars.length - 1;

            while (lp < rp) {
                if (!Character.isAlphabetic(chars[lp])) {
                    lp++;
                } else if (!Character.isAlphabetic(chars[rp])) {
                    rp--;
                } else {
                    // swap
                    char tmp = chars[lp];
                    chars[lp] = chars[rp];
                    chars[rp] = tmp;
                    lp++;
                    rp--;
                }
            }

            System.out.println(new String(chars));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

