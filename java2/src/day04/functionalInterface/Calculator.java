package day04.functionalInterface;

public class Calculator {
	public static int calculator(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
//		람다식과 함수형 인터페이스
//		람다식
//		메서드를 쉽고 빠르게 나타내기 위한 표현식으로
//		(매개변수1,...) -> {매개변수를 활용한코드블록};
		
//		원래 인터페이스의 기능만 구현하여 쓰려면
//		익명 클래스 방식으로 재정의(override)를 해야 했다.
		Calc add1 = new Calc() {
			@Override
			public int calculate(int num1, int num2) {
				return num1 + num2;
			}
		};
//		그런데 함수형 인터페이스와 람다식을 조합하면
//		아래와 같이 쉽고 간결하게 함수를 작성할 수 있다.
		Calc add2 = (x, y) -> x + y;
		
		System.out.println(add2.calculate(3, 5));		
		
//		실습1. 위의 add2처럼 함수형 인터페이스를 활용하여
//		람다식으로 뺄셈, 곱셈, 나눗셈, 몫 연산을
//		구현해보자.
		
		Calc sub = (x, y)->x-y; // 뺄셈
		Calc multi = (n1, n2) -> n1 * n2; // 곱
		Calc quotient = (num1, num2) -> num1 / num2; // 몫
		Calc remainder = (a, b) -> a % b; // 나머지
		
		int result = sub.calculate(10, 2);
		System.out.printf("sub 10, 2 : %d\n", result);
		
		result = multi.calculate(2, 10);
		System.out.printf("multi 2, 10 : %d\n", result);
		
		result = quotient.calculate(31, 3);
		System.out.printf("quot 31, 3 : %d\n", result);
		
		result = remainder.calculate(31, 3);
		System.out.printf("rem 31, 3 : %d\n", result);
		
	}

}
