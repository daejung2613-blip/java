package jump2java;


class Animal {
	String name;
	
	Animal(String name){
		this.name = name;
	}
	void bark() {
		System.out.println("멍멍");
	}
}
public class T0609 {
	public static void main(String[] args) {
		Animal dog = new Animal("puppy");
		dog.bark();

	}

}
