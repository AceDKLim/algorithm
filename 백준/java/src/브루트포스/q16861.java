package 브루트포스;

import java.util.Scanner;

public class q16861 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        while (true) {
            String[] s = Integer.toString(n).split("");
            int r = 0;
            for (String i : s) {
                r += Integer.parseInt(i);
            }
            if (n % r == 0) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
