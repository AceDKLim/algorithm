package 수학;

import java.util.Scanner;

public class q26532 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        long farm = a * b;
        long corn = 4840 * 5;
        if (farm % corn == 0) {
            System.out.println(farm / corn);
        } else {
            System.out.println(farm / corn + 1);
        }
    }
}
