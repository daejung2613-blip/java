package jump2java;

class Animal {
    String name;
    int age;

    Animal(String n, int a) {
        name = n;
        age = a;
    }

    void sound() {
        System.out.println(name + " 소리를 냅니다.");
    }

    void sound(int count) {
        System.out.println(count + "번 소리를 냅니다.");
    }
}
//상속: 부모의 기능 재사용 가능
class Dog extends Animal {
    int speed;

    Dog(String n, int a, int s) {
        super(n, a);       // super: 부모 생성자 호출
        speed = s;
    }

    void sound() {
        System.out.println(name + " 멍멍!");
    }

    void run(int time) {
        System.out.println((speed * time) + "m 달렸습니다.");
    }
}

public class AnimalManagement {
    public static void main(String[] args) {
        Dog dog = new Dog("바둑이", 3, 10);

        dog.sound();
        dog.sound(3);
        dog.run(5);
    }
}