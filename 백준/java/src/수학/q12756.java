package 수학;

import java.util.Scanner;

public class q12756 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ap = scan.nextInt();
        int ah = scan.nextInt();
        int bp = scan.nextInt();
        int bh = scan.nextInt();
        scan.close();
        while (ah > 0 && bh > 0) {
            ah -= bp;
            bh -= ap;
        }
        if (ah <= 0 && bh <= 0) {
            System.out.println("DRAW");
        } else {
            String r = ah > bh ? "PLAYER A" : "PLAYER B";
            System.out.println(r);
        }
    }
}
