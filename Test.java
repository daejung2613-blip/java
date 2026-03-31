package jump2java;

public class Test {
	public static void main(String[] args) {
		String a = "Hello Java";
		System.out.println(a.contains("Java"));
		System.out.println(a.charAt(5));
		System.out.println(a.replaceAll("Java", "world"));
		System.out.println(a.substring(3, 8));
	}
}