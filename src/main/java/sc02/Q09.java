package sc02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 * g0en2T0s8eSoft
 * <p>
 * Output
 * 208
 */

public class Q09 {

    private static final char NUMERIC_START = 48;
    private static final char NUMERIC_END = 57;

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            char[] chars = br.readLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < chars.length - 1; i++) {
                // Character.isDigit()もある
                if (chars[i] >= NUMERIC_START && chars[i] <= NUMERIC_END) {
                    sb.append(chars[i]);
                }
            }
            System.out.println(Integer.parseInt(sb.toString()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
