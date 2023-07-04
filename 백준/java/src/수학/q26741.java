package 수학;

import java.util.Scanner;

public class q26741 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        int c = (y - 2 * x) / 2;
        System.out.println((x - c) + " " + c);
    }
}
