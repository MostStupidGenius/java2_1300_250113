package day04.collection.set;

import java.util.HashSet;

class HashSetPractice {

	public static void main(String[] args) {
//		Set 자료구조
//		- 저장된 순서 무시 -> 인덱스로 접근할 수 없음
//		- 값으로 직접 접근한다.
//		- 중복된 값을 저장 수 없다.
//		-> 주로 중복을 제거할 때, 혹은 그 리스트가 필요할 때
//		있는 그대로 사용하면 안 되고 반드시 HashSet과 같은
//		구현할 수 있는 클래스로 만들어야 한다.
//		HashSet<클래스명> ~~
//		HashSet 선언 방법
		HashSet<String> setVar1 = new HashSet<String>();
		
//		데이터 추가
//		.add(객체)
//		요소에 해당 객체가 없다면 추가가 성공적으로 이루어지며
//		반환값으로 true가 반환된다.
//		만약 요소 중에 해당 객체가 있다면
//		추가가 되지 않고 false를 반환한다.
		System.out.println(setVar1.add("2번째 문자열"));
		System.out.println(setVar1.add("5번째 문자열"));
		System.out.println(setVar1.add("첫번째 문자열"));
		System.out.println(setVar1.add("3번째 문자열"));
		System.out.println(setVar1.add("4번째 문자열"));
		System.out.println(setVar1.add("4번째 문자열"));
		
//		2. 포함 여부 반환 기능
//		.contains(객체)
//		해당 객체를 set의 요소로 가지고 있는지 여부를 반환
		System.out.println(setVar1.contains("4번째 문자열"));
	}

}
