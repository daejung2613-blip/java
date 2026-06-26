package jump2java;
import java.util.Scanner;

public class TriangleLU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이를 입력하세요: ");
        int num = sc.nextInt();
        sc.close();
        
        for (int i = 0; i < num; i++) {      // 줄 수
            for (int j = 1; j <= num-i; j++) {  // 별 개수
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

}
