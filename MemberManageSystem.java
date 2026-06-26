package jump2java;
class Member {
    String name;
    int point;

    Member(String n, int p) {
        name = n;
        point = p;
    }

    void showInfo() {
        System.out.println(name + " 회원 정보");
    }

    void showInfo(int addPoint) {
        System.out.println(addPoint + "포인트 적립");
    }
}

class VIPMember extends Member {
    double discountRate;

    VIPMember(String n, int p, double d) {
        super(n, p);      // (가) 단계
        discountRate = d;
    }

    void showInfo() {
        System.out.println(name + " VIP 회원 정보");
    }

    void useCoupon(int price) {
        System.out.println((int)(price * discountRate) + "원 할인");
    }
}

public class MemberManageSystem {
    public static void main(String[] args) {
        VIPMember member = new VIPMember("김철수", 1000, 0.1);

        member.showInfo();
        member.showInfo(500);
        member.useCoupon(30000);
    }
}