package 구현;

import java.util.Scanner;

public class q26772 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String[] h = { " @@@   @@@ ", "@   @ @   @", "@    @    @", "@         @", " @       @ ", "  @     @  ",
                "   @   @   ", "    @ @    ", "     @     " };
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(h[i] + " ");
            }
            System.out.println();
        }
    }
}
