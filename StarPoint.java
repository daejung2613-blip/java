package jump2java;
import java.util.Scanner;

public class StarPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("출력할 개수 입력: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            // 5개마다 줄바꿈
            if (i - 5 == 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}