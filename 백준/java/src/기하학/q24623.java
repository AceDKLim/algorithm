package 기하학;

import java.util.Scanner;

public class q24623 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        float a1 = (180 - a) / 2f;
        float a2 = a / 2f;
        System.out.println((int) (a1 + a2));
        scan.close();
    }
}
