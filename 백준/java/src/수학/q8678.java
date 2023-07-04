package 수학;

import java.util.Scanner;

public class q8678 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (b % a == 0) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
        scan.close();
    }
}
