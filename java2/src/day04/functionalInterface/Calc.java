package day04.functionalInterface;

@FunctionalInterface
public interface Calc {
//	두 정수를 받아서 연산을 하는 인터페이스
	public abstract int calculate(int num1, int num2);
}
