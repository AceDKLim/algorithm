package 문자열;

import java.util.Arrays;
import java.util.Scanner;

public class q26564 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int[] c = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
            for (int j = 0; j < 5; j++) {
                char g = scan.next().charAt(0);
                if (g == 'A') {
                    g = 0;
                } else if (g == 'T') {
                    g = 9;
                } else if (g == 'J') {
                    g = 10;
                } else if (g == 'Q') {
                    g = 11;
                } else if (g == 'K') {
                    g = 12;
                } else {
                    g -= '0';
                }
                c[g]++;
            }
            Arrays.sort(c);
            System.out.println(c[12]);
        }
        scan.close();
    }
}
