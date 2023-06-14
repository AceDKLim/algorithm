package 기하학;

import java.util.Scanner;

public class q9772 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            float x = scan.nextFloat();
            float y = scan.nextFloat();
            if (x == 0 || y == 0) {
                System.out.println("AXIS");
                if (x == 0 && y == 0) {
                    break;
                }
            } else if (x > 0) {
                if (y > 0) {
                    System.out.println("Q1");
                } else {
                    System.out.println("Q4");
                }
            } else {
                if (y > 0) {
                    System.out.println("Q2");
                } else {
                    System.out.println("Q3");
                }
            }
        }
        scan.close();
    }

}
