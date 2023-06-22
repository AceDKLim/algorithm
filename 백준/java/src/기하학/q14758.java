package 기하학;

import java.util.Scanner;

public class q14758 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            // 여러 정보 받기
            int check = 0;
            int[] num = new int[6];
            for (int i = 0; i < 6; i++) {
                num[i] = scan.nextInt();
                check += num[i];
            }
            if (check == 0) {
                break;
            }

            // 칠하지 않는 면적 구하기
            int door = 0;
            for (int i = 0; i < num[5]; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                door += (a * b);
            }

            // 전체 면적 구하기
            int wall = 0;
            for (int i = 1; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    wall += num[i] * num[j] * 2;
                }
            }
            wall -= num[1] * num[2];

            // 안칠하는 면적 빼고 방 개수 곱하고 페인트 나눠서 올리기
            wall -= door;
            wall *= num[0];
            int r = (int) Math.ceil((double) wall / num[4]);
            System.out.println(r);
        }
        scan.close();
    }
}
