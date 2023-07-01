package 수학;

import java.util.Scanner;

public class q21185 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n % 2 == 1) {
            System.out.println("Either");
        } else {
            if (n % 4 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}
