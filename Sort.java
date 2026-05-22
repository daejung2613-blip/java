package jump2java;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 개의 정수 입력");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int temp;
		
		if(a>b) {
			temp=a;
			a=b;
			b=temp;
		}
		
		if(a>c) {
			temp=a;
			a=c;
			c=temp;
		}
		
		if(b>c) {
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println("오름차순 정렬: "+a+","+b+","+c);
				
		
	}

}
