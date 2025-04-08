package sc02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * gooG
 * <p>
 * YES
 */

public class Q07 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line = br.readLine().toLowerCase();

            for (int i = 0; i < line.length() / 2; i++) {
                if (line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
