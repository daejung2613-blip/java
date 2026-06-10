package jump2java;

import java.util.Scanner;

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void printInfo() {
        System.out.println(name + ", " + score);
    }

    String getGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
} // Student 클래스 종료

public class StudentMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름과 점수를 입력하시오: ");
        String name = sc.next();
        int score = sc.nextInt();

        Student s1 = new Student(name, score);

        s1.printInfo();
        System.out.println(s1.getGrade() + "등급입니다.");

        sc.close();
    }
}