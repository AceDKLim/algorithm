package 기하학;

import java.util.Scanner;

public class q26556 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            Double a1 = scan.nextDouble();
            Double p1 = scan.nextDouble();
            Double r1 = scan.nextDouble();
            Double p2 = scan.nextDouble();
            a1 /= p1;
            Double a2 = (Math.PI * Math.pow(r1, 2)) / p2;
            if (a1 > a2) {
                System.out.println("Slice of pizza");
            } else {
                System.out.println("Whole pizza");
            }
        }
        scan.close();
    }

}
