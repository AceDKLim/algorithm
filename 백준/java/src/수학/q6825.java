package 수학;

import java.util.Scanner;

public class q6825 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double w = scan.nextDouble();
        double h = scan.nextDouble();
        scan.close();
        double bmi = (w / (h * h));
        if (bmi > 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Underweight");
        }
    }
}
