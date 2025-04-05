package sc02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Input

3
good
Time
Big

Output

doog
emiT
giB

 */
public class Q04 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int count = Integer.parseInt(br.readLine());
            for (int i = 0; i < count; i++) {
                String word = br.readLine();
                StringBuilder answer = new StringBuilder();
                char[] chars = word.toCharArray();
                for (int j = chars.length; j > 0; j--) {
                    answer.append(chars[j - 1]);
                }
                System.out.println(answer);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
