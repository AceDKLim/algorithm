package 수학;

import java.util.Scanner;

public class q3460 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            String n = Integer.toBinaryString(scan.nextInt());
            for (int j = n.length() - 1; j >= 0; j--) {
                if (n.charAt(j) == '1') {
                    System.out.print((n.length() - j - 1) + " ");
                }
            }
        }
        scan.close();

    }
}
