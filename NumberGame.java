package jump2java;
import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int answer = rand.nextInt(90)+10;
		int user;
		int count = 0;
		
		while(true) {
			System.out.print("2자리 자연수 입력 :");
			user = sc.nextInt();
			count++;
			
			if(user>answer) {
				System.out.println("정답은 더 작은 수");
			} else if(user<answer) {
				System.out.println("정답은 더 큰 수");
			}else {
				System.out.println("정답");
				System.out.println("시도 횟수: "+ count);
				break;
			}
		}
		
	}

}
