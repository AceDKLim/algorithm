package 구현;

import java.util.Scanner;

public class q4493 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            int p1 = 0;
            int p2 = 0;
            for (int j = 0; j < n; j++) {
                String a = scan.next();
                String b = scan.next();
                if (a.equals("R")) {
                    if (b.equals("P")) {
                        p2++;
                    } else if (b.equals("S")) {
                        p1++;
                    }
                } else if (a.equals("S")) {
                    if (b.equals("R")) {
                        p2++;
                    } else if (b.equals("P")) {
                        p1++;
                    }
                } else if (a.equals("P")) {
                    if (b.equals("S")) {
                        p2++;
                    } else if (b.equals("R")) {
                        p1++;
                    }
                }
            }
            if (p1 > p2) {
                System.out.println("Player 1");
            } else if (p1 < p2) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
        scan.close();
    }
}
