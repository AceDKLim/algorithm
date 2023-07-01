package 수학;

import java.util.Scanner;

public class q5666 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            float h = scan.nextFloat();
            float p = scan.nextFloat();
            System.out.printf("%.2f\n", h / p);
        }
        scan.close();
    }
}
