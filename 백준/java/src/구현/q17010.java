package 구현;

import java.util.Scanner;

public class q17010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scan.nextInt();
            String s = scan.next();
            for (int j = 0; j < n; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
        scan.close();
    }
}
