package 구현;

import java.util.Scanner;

public class q16017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] phone = new int[4];
        for (int i = 0; i < 4; i++) {
            phone[i] = scan.nextInt();
        }
        if ((phone[0] == 8 || phone[0] == 9) && (phone[3] == 8 || phone[3] == 9) && phone[1] == phone[2]) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
        scan.close();
    }
}
