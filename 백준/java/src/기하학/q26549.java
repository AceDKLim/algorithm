package 기하학;

import java.util.Scanner;

public class q26549 {
    void dfs(String box[][], int a, int b, int r, int c) {
        box[a][b] = "*";
        int[] dx = { 1, -1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };
        for (int i = 0; i < 4; i++) {
            int nx = dx[i] + a;
            int ny = dy[i] + b;
            if (nx < 0 || ny < 0 || nx >= r || ny >= c) {
                continue;
            }
            if (box[nx][ny] == ".") {
                dfs(box, nx, ny, r, c);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int r = scan.nextInt();
            int c = scan.nextInt();
            static String[][] box = new String[r][c];
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    box[j][k] = scan.next();
                }
            }
            int section = 0;
            int space = 0;
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    if (box[j][k] == ".") {
                        section++;
                        dfs(box, j, k, r, c);
                    }
                    if (box[j][k] == "*") {
                        space++;
                    }
                }
            }
            System.out.println(section + " sections, " + space + " spaces");
        }
        scan.close();
    }
}
