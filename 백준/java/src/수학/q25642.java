package 수학;

import java.util.Scanner;

public class q25642 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        while (a < 5 && b < 5) {
            b += a;
            if (b >= 5) {
                break;
            }
            a += b;
        }
        if (a < b) {
            System.out.println("yt");
        } else {
            System.out.println("yj");
        }
    }
}
