package jump2java;

class Student{
	String name;
	int score;
	
	Student(String name, int score){
		this.name = name;
		this.score = score;
	}
	void printInfo() {
		System.out.println(name+", "+score);
	}
	
	String getGrade() {
		if (score>=90) {
			return "A";
		} else if (score>=80) {
			return "B";
		} else if (score>=70) {
			return "C";
		} else if (score>=60) {
			return "D";
		} else {
			return "F";
		}
	
}

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
