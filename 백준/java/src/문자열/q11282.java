package 문자열;

import java.util.Scanner;

public class q11282 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println((char) (n + '가' - 1));
        scan.close();
    }
}
