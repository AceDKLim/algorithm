package 수학;

import java.util.Scanner;

public class q12790 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int hp = scan.nextInt();
            int mp = scan.nextInt();
            int att = scan.nextInt();
            int def = scan.nextInt();
            hp = Math.max(1, hp + scan.nextInt());
            mp = Math.max(1, mp + scan.nextInt());
            att = Math.max(0, att + scan.nextInt());
            def = def + scan.nextInt();
            System.out.println(hp + 5 * mp + 2 * att + 2 * def);
        }
        scan.close();
    }
}
