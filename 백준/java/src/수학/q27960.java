package 수학;

import java.util.Scanner;

public class q27960 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int c = 0;
        for (int i = 9; i >= 0; i--) {
            int p = (int) Math.pow(2, i);
            int k = 0;
            if (a - p >= 0) {
                a -= p;
                k++;
            }
            if (b - p >= 0) {
                b -= p;
                k++;
            }
            c = k == 1 ? p + c : c;
        }
        System.out.println(c);
    }
}
