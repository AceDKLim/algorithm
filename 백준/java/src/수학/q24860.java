package 수학;

import java.util.Scanner;

public class q24860 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long vk = scan.nextLong();
        long jk = scan.nextLong();
        long vg = scan.nextLong();
        long jg = scan.nextLong();
        long vh = scan.nextLong();
        long dh = scan.nextLong();
        long jh = scan.nextLong();
        scan.close();
        long k = vk * jk;
        long g = vg * jg;
        long h = vh * dh * jh;
        System.out.println(k * h + g * h);
    }
}
