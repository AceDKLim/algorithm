package 수학;

import java.util.Scanner;

public class q20473 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int three = n / 3;
        n %= 3;
        while (n % 2 != 0) {
            n += 3;
            three--;
        }
        System.out.println((n / 2) + " " + three);
    }
}
