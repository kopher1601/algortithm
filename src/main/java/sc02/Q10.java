package sc02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input
 * teachermode e
 * <p>
 * Output
 * 1 0 1 2 1 0 1 2 2 1 0
 */
public class Q10 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String[] line = br.readLine().split(" ");
            String[] str = line[0].split("");
            String aWord = line[1];

            int[] answer = new int[str.length];
            int count = 1;
            for (int i = 0; i < str.length; i = i + 1) {
                if (str[i].equals(aWord)) {
                    answer[i] = 0;
                    count = 1;
                    continue;
                }
                answer[i] = count++;
            }

            count = 1;
            for (int i = str.length - 1; i > 0; i--) {
                if (str[i].equals(aWord)) {
                    answer[i] = 0;
                    count = 1;
                    continue;
                }
                if (answer[i] > count) {
                    answer[i] = count;
                }
                count++;
            }

            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
