package 수학;

import java.util.Scanner;

public class q15700 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long h = scan.nextLong();
        long w = scan.nextLong();
        System.out.println(h * w / 2);
        scan.close();
    }
}
