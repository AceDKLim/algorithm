package 구현;

import java.util.Scanner;

public class q6764 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        if (a < b && b < c && c < d) {
            System.out.println("Fish Rising");
        } else if (a > b && b > c && c > d) {
            System.out.println("Fish Diving");
        } else if (a == b && b == c && c == d) {
            System.out.println("Fish At Constant  Depth");
        } else {
            System.out.println("No Fish");
        }
        scan.close();
    }
}
