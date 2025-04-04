package sc02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
it is time to study -> study
Hello my name is Yaro -> Hello
 */

public class Q03 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();

            String answer = "";
            int pos = 0;
            int max = 0;
            while ((pos = str.indexOf(" ")) != -1) {
                String tmp = str.substring(0, pos);
                int len = tmp.length();
                if (len > max) {
                    max = len;
                    answer = tmp;
                }
                str = str.substring(pos + 1);
            }
            if (str.length() > max) {
                answer = str;
            }

            System.out.println(answer);
        } catch (Exception ex) {
            System.out.println("ex = " + ex);
        }

    }
}
