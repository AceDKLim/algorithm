package 수학;

import java.util.Scanner;

public class q27267 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        a *= scan.nextInt();
        int b = scan.nextInt();
        b *= scan.nextInt();
        scan.close();
        char r = a > b ? 'M' : a < b ? 'P' : 'E';
        System.out.println(r);
    }
}
