package sc02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 * KKHSSSSSSSE
 * <p>
 * Output
 * K2HS7E
 */
public class Q11 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String answer = "";
            String s = br.readLine() + " ";
            int cnt = 1;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    cnt++;
                } else {
                    answer += s.charAt(i);
                    if (cnt > 1) {
                        answer += String.valueOf(cnt);
                    }
                    cnt = 1;
                }
            }
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
