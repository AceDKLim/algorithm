package 구현;

import java.util.Scanner;

public class q16727 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p1 = scan.nextInt();
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int p2 = scan.nextInt();
        scan.close();
        int p = p1 + p2;
        int s = s1 + s2;
        if (p == s) {
            if (p1 < s2) {
                p++;
            } else if (p1 > s2) {
                s++;
            }
        }
        if (p > s) {
            System.out.println("Persepolis");
        } else if (p < s) {
            System.out.println("Esteghlal");
        } else {
            System.out.println("Penalty");
        }
    }
}
