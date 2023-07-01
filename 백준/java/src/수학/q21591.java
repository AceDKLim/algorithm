package 수학;

import java.util.Scanner;

public class q21591 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int wc = scan.nextInt();
        int hc = scan.nextInt();
        int ws = scan.nextInt();
        int hs = scan.nextInt();
        if (wc - ws > 1 && hc - hs > 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        scan.close();
    }
}
