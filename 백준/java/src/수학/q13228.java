package 수학;

import java.util.Scanner;

public class q13228 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int r = scan.nextInt();
            x = Math.abs(x - scan.nextInt());
            y = Math.abs(y - scan.nextInt());
            r += scan.nextInt();
            System.out.println((x + y + r));
        }
        scan.close();
    }
}
