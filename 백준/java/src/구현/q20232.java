package 구현;

import java.util.Scanner;

public class q20232 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        if (n == 1996 || n == 1997 || n == 2000 || n == 2007 || n == 2008 || n == 2013 || n == 2018) {
            System.out.println("SPbSU");
        } else if (n == 2006) {
            System.out.println("PetrSU, ITMO");
        } else {
            System.out.println("ITMO");
        }
    }
}
