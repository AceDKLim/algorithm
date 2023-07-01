package 수학;

import java.util.Scanner;

public class q27239 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int x = 0;
        if (n % 8 == 0) {
            x = n / 8;
        } else {
            x = n / 8 + 1;
        }
        n -= (x - 1) * 8;
        char y = (char) ((int) 'a' - 1 + n);
        System.out.println(y + "" + x);
    }
}
