package sc02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// A ~ : 65 ~ 90
// a ~ : 97 ~ 122

public class Q02 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String input = br.readLine();

            StringBuilder result = new StringBuilder();
            for (char ch : input.toCharArray()) {
                if (ch >= 65 && ch <= 90) {
                    result.append((char) (ch + 32));
                } else {
                    result.append((char) (ch - 32));
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
