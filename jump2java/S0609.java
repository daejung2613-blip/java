//도서관 시스템 구현
package jump2java;
import java.util.Scanner;

//book 클래스
class Book{
	//변수선언
	String title;
	String author;
	int year;
	boolean borrow;
	
	//생성자
	Book(String title, String author, int year){
		this.title = title;
		this.author = author;
		this.year = year;
		borrow = false;
	}
	//메소드
	void show() {
		System.out.println("제목: "+ title);
	}
	
	//대출하는 메소드
	String borrowOf() {
		if (borrow) {
			return "대출 불가";	
		} else {
			borrow = true;
			return "대출 가능";
		}
	}
}

public class S0609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목: ");
		String title = sc.next();
		System.out.print("저자: ");
		String author = sc.next();
		System.out.print("발행연도: ");
		int year = sc.nextInt();
		
		//객체 생성
		Book b1 = new Book(title, author, year);
		b1.show();
		System.out.println(b1.borrowOf());
	}
}
