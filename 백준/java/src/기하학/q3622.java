package 기하학;

import java.util.Scanner;

public class q3622 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int a = scan.nextInt();
        int B = scan.nextInt();
        int b = scan.nextInt();
        int P = scan.nextInt();

        if ((P >= B && b >= A) || (P >= A && a >= B) || (P >= A + B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
