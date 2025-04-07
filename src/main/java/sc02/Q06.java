package sc02;

/*
Input
ksekkset

Output
kset
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length(); i++) {
                if (line.indexOf(line.charAt(i)) == i) {
                    sb.append(line.charAt(i));
                }
            }
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
