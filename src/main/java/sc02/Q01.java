package sc02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String sentence = br.readLine().toLowerCase();
            char ch = br.readLine().toLowerCase().charAt(0);

            int count = 0;
            for (char c : sentence.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }

            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
