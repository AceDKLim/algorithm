package 문자열;

import java.util.Scanner;

public class q26583 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String[] s = scan.nextLine().split(" ");
            int[] r = new int[s.length];
            r[s.length - 1] = Integer.parseInt(s[s.length - 1]);
            for (int i = 0; i < s.length - 1; i++) {
                r[i] = Integer.parseInt(s[i]) * Integer.parseInt(s[i + 1]);
            }
            for (int i = 1; i < s.length; i++) {
                r[i] = r[i] * Integer.parseInt(s[i - 1]);
            }
            for (int i = 0; i < s.length; i++) {
                System.out.print(r[i] + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
