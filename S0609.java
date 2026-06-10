package jump2java;
//도서관 
import java.util.Scanner;

//Book 클래스
class Book {
	String title;
	String author;
	int year; //발행 년도
	boolean borrow;
	
	//생성자
	Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
		borrow = false; //생성자에서 값 지정 가능
		
	}
	
	//메소드(반환X)
	void show() {
		System.out.println("제목: "+ title);
	}
	
	//대출하는 메소드
	String borrowOf() {
		if (borrow) {
			return "대출 중";
		} else {
			borrow = true;
			return "대출 가능";
		}
	}
	
	
	
	
}

public class S0609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("책 제목: ");
		String title = sc.next();
		System.out.println("저자: ");
		String author = sc.next();
		System.out.println("발행연도: ");
		int year = sc.nextInt();
		
		//객체 생성
		Book b1 = new Book(title, author, year);
		b1.show();
		System.out.println(b1.borrowOf());
		
		
		
	}
}
