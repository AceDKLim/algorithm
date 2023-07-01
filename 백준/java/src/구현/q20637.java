package 구현;

import java.util.Scanner;

public class q20637 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int q = scan.nextInt();
        scan.close();
        if (p <= 50 && q <= 10) {
            System.out.println("White");
        } else if (q > 30) {
            System.out.println("Red");
        } else {
            System.out.println("Yellow");
        }
    }
}
