package 구현;

import java.util.Scanner;

public class q4806 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        while (scan.hasNext()) {
            scan.nextLine();
            cnt++;
        }
        scan.close();
        System.out.println(cnt);
    }
}
