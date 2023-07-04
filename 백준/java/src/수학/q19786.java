package 수학;

import java.util.Scanner;

public class q19786 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int c = scan.nextInt();
            int r = scan.nextInt();
            int g = scan.nextInt();
            int b = scan.nextInt();
            int s1 = (int) (a * (Math.pow(r + 1, 2) + Math.pow(g, 2) + Math.pow(b, 2))
                    + c * Math.min(r + 1, Math.min(g, b)));
            int s2 = (int) (a * (Math.pow(r, 2) + Math.pow(g + 1, 2) + Math.pow(b, 2))
                    + c * Math.min(r, Math.min(g + 1, b)));
            int s3 = (int) (a * (Math.pow(r, 2) + Math.pow(g, 2) + Math.pow(b + 1, 2))
                    + c * Math.min(r, Math.min(g, b + 1)));
            if (s1 >= s2 && s1 >= s3) {
                System.out.println("RED");
            } else if (s2 >= s1 && s2 >= s3) {
                System.out.println("GREEN");
            } else if (s3 >= s2 && s3 >= s1) {
                System.out.println("BLUE");
            }
        }
        scan.close();
    }
}
