package day01.inherit;

public class Method {
	static int add(int a, int b) {
		return a + b;
	}
	
	static void changeElement(int[] arrInt, int index, int value) {
		arrInt[index] = value;
	}
	
	public static void main(String[] args) {
//		int num1 = add(3, 5);
//		System.out.println(num1);
		int[] arrInt = {1, 2, 3};
		changeElement(arrInt, 0, 0);
		
//		System.out.println(arrInt[0]);
		for (int i : arrInt) {
			System.out.println(i);
		}
		
		
	}
}
