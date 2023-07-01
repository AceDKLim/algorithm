package 구현;

import java.util.Arrays;
import java.util.Scanner;

public class q3047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            n[i] = scan.nextInt();
        }
        Arrays.sort(n);
        String s = scan.next();
        scan.close();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                System.out.print(n[0] + " ");
            } else if (s.charAt(i) == 'B') {
                System.out.print(n[1] + " ");
            } else if (s.charAt(i) == 'C') {
                System.out.print(n[2] + " ");
            }
        }
    }
}
