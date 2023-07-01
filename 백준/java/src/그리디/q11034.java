package 그리디;

import java.util.Scanner;

public class q11034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int r = Math.max(b - a, c - b);
            System.out.println(r - 1);
        }
        scan.close();
    }
}
