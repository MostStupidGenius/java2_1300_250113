package day04.collection.arrayList;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
//		ArrayList
//		리스트의 대표형으로, 배열처럼 한 가지 타입의 객체를
//		여러 개 저장할 수 있는 자료구조다.
//		하지만, 클래스의 다형성에 의해서
//		해당 타입을 가진 여러가지 객체들이 모두 담길 수 있다는 특징
//		- 순서가 있다. -> 인덱스(순서 번호)를 통해 접근한다.
//		- 값의 중복이 가능하다 -> 순서로 값이 구분되기 때문에
//			값의 중복에 영향을 받지 않는다.
//		0. 리스트의 선언
//		ArrayList<클래스타입> 참조변수명 = new ArrayList<클래스타입>();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
//		1. 리스트의 요소 추가
//		객체.add(값)
		arrList.add(3);
		arrList.add(67);
		arrList.add(35);
		arrList.add(31);
		arrList.add(13);
		arrList.add(23);
		
//		2. 요소 값 조회
//		.get(인덱스)
//			3. .size() 요소의 개수 반환
		for (int i = 0; i < arrList.size(); i++) {
			int value = arrList.get(i);
			System.out.println(value);
		}
		
//		4. 요소의 삭제
//		.remove(인덱스)
		int poped = arrList.remove(0);
		System.out.println(poped);
	}

}
