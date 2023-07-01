package 수학;

import java.util.Scanner;

public class q21633 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float k = scan.nextFloat() / 100 + 25;
        scan.close();
        k = k < 100 ? 100 : k > 2000 ? 2000 : k;
        System.out.println(String.format("%.2f", k));
    }
}
