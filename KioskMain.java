package jump2java;
import java.util.Scanner;

class Menu {

    String name;
    int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void printMenu(int number) {
        System.out.println(number + ". " + name + " (" + price + "원)");
    }

    int getPrice(int quantity) {
        return price * quantity;
    }
}

public class KioskMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu m1 = new Menu("햄버거", 5000);
        Menu m2 = new Menu("감자튀김", 2500);
        Menu m3 = new Menu("콜라", 2000);

        int number = 0;
        int quantity = 0;
        int total = 0;

        System.out.println("=== 키오스크 프로그램 ===");
        m1.printMenu(1);
        m2.printMenu(2);
        m3.printMenu(3);

        System.out.print("메뉴 번호 선택: ");
        number = sc.nextInt();

        System.out.print("수량 입력: ");
        quantity = sc.nextInt();

        if (number == 1) {
            System.out.println(m1.name + " " + quantity + "개 주문");
            total = m1.getPrice(quantity);
        } else if (number == 2) {
            System.out.println(m2.name + " " + quantity + "개 주문");
            total = m2.getPrice(quantity);
        } else if (number == 3) {
            System.out.println(m3.name + " " + quantity + "개 주문");
            total = m3.getPrice(quantity);
        }

        System.out.println("총 결제 금액: " + total + "원");

        sc.close();
    }
}