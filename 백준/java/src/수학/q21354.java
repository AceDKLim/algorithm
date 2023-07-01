package 수학;

import java.util.Scanner;

public class q21354 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt() * 7;
        int b = scan.nextInt() * 13;
        scan.close();
        if (a > b) {
            System.out.println("Axel");
        } else if (a < b) {
            System.out.println("Petra");
        } else {
            System.out.println("lika");
        }
    }
}
