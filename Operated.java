package jump2java;
import java.util.Scanner;

public class Operated {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		while(true) {
			System.out.print("월 입력: ");
			month = sc.nextInt();
			
			if(month>=1 && month<=12) {
				sc.close();
				break;
			} else {
					System.out.println("다시 입력해주세요.");
				}
				
			}
		
		

	
		
		if (month==3 ||  month==4 || month=5) {
			System.out.println("봄이다.");
		}
		else {
			System.out.println("봄이 아니다.");
		}
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄이다.");
			break;
		default:
			System.out.println("봄이 아니다.");
		}
		
		
	}
}
