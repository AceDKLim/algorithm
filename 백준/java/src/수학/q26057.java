package 수학;

import java.util.Scanner;

public class q26057 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int a = scan.nextInt();
        scan.close();
        int b = l - a;
        System.out.println(Math.abs(a - b));
    }
}
