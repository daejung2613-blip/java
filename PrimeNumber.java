package jump2java;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.print("2이상 입력");
			num = sc.nextInt();
			if(num>=2) break;
			System.out.println("2이상 입력해야함!");
		}
		sc.close();
			
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+"은(는) 소수이다.");
		}else {
			System.out.println(num+"은(는) 소수가 아니다.");
		}
		
	}

}
