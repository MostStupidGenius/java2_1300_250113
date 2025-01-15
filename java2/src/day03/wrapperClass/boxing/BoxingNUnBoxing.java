package day03.wrapperClass.boxing;

public class BoxingNUnBoxing {

	public static void main(String[] args) {
//		래퍼 클래스
//		기본 자료형을 객체처럼 다루고자 포장(wrap)하기 위해서
//		만들어진 클래스들로, 이렇게 만들어진 래퍼 클래스와
//		기본 자료형은 1대1 관계를 이룬다.
//		박싱(boxing)
//		기본 자료형-> 래퍼 클래스
//		언박싱(un-boxing)
//		래퍼 클래스-> 기본 자료형
//		변환하는 일이 잦다.
//		이러한 변환에 대해서 이름을 붙여 박싱과 언박싱이라 부른다.
//		정수값을 Intger 변수에 담는 코드
		Integer int1 = Integer.valueOf(3); // 직접 박싱
		
		// 언박싱
		int intValue = int1.intValue();
		
//		JDK 1.5 이상
		// 오토 박싱
		int1 = 3; // 함수나 메서드, 캐스팅 연산자 없이 변환이 된다.
		// 오토 언박싱
		intValue = int1;
		
		
	}

}
