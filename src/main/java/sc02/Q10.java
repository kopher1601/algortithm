package sc02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] strs = br.readLine().split(" ");
            char[] chars = strs[0].toCharArray();
            char target = strs[1].charAt(0);
            int[] result = new int[chars.length];
            int count = 1000;
            for (int i = 0; i < chars.length; i++) {
                if (target == chars[i]) {
                    count = 0;
                    result[i] = count;
                    count++;
                    continue;
                }
                result[i] = count;
                count++;
            }

            count = 1000;
            for (int j = chars.length - 1; j >= 0; j--) {
                if (target == chars[j]) {
                    count = 0;
                    result[j] = count;
                    count++;
                    continue;
                }
                if (result[j] > count) {
                    result[j] = count;
                }
                count++;
            }

            for (int i : result) {
                System.out.print(i + " ");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}