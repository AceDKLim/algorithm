// package 기하학;

// import java.util.Scanner;

// public class q4105 {
// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// while (true) {
// // 입력 받고 모두 0이면 종료
// float[] coords = new float[14];
// int cnt = 0;
// for (int i = 0; i < 12; i++) {
// coords[i] = scan.nextFloat();
// if (coords[i] == 0) {
// cnt++;
// }
// }
// if (cnt == 12) {
// break;
// }

// // 삼각형 넓이 구하기
// coords[12] = coords[6];
// coords[13] = coords[7];
// float t1 = 0;
// float t2 = 0;
// for (int i = 6; i < 12; i += 2) {
// t1 += coords[i] * coords[i + 3];
// t2 += coords[i + 1] * coords[i + 2];
// }
// double tri = 0.5 * Math.abs(t1 - t2);

// // 삼각형 넓이를 평행사변형 밑변으로 나눠 높이 구하기
// double x = Math.pow(coords[0] - coords[2], 2);
// double y = Math.pow(coords[1] - coords[3], 2);
// double w = Math.sqrt(x + y);
// double h = tri / w;

// // ac기울기(ah기울기) 구하기
// float inc = (coords[4] - coords[0]) / (coords[5] - coords[1]);
// }
// }
// }
