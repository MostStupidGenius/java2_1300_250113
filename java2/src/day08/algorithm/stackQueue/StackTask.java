package day08.algorithm.stackQueue;

public class StackTask {
//		스택 클래스를 직접 구현
	Integer[] elements = new Integer[1]; // 값을 담을 인스턴스 클래스
	{
		elements = new Integer[] {};
	}
	
	public StackTask() {;}
	
	
	// 현재 내부 배열의 길이를 반환하는 함수
	public int getLength() {
		int size = this.elements.length;
		return size;
	}
	
	// 값을 추가
	// - 여러 값 중 가장 마지막에 요소를 추가해야 한다.
	public void add(Integer e) {
		// 현재 배열의 길이를 확인
		int size = this.getLength();
		
		// 기존 길이 + 1만큼의 길이를 가진 새로운 배열 생성
		int newSize = size+1;
		Integer[] newArr = new Integer[newSize];
		
		for (int i = 0; i < size; i++) {
			// 기존 요소들을 새로운 배열에 추가
			newArr[i] = this.elements[i];
		}
		
		// 새로 추가된 요소를 마지막 인덱스에 추가
		// 기존 배열의 길이가 새로운 요소의 인덱스와 동일하다.
		newArr[newSize-1] = e;
		
		// 기존 배열을 담은 변수에 새로운 배열 대입
		this.elements = newArr;
	}
	
	// 값을 제거
	// - 여러 값 중 마지막 요소를 제거해야 한다.
	public Integer remove() {
		int size = this.getLength();
		if(size == 0) {
			return null;
		}
		// 새로운 배열은 기존 길이보다 1 짧다.
		Integer[] newArr = new Integer[size-1];
		
		for (int i = 0; i < size-1; i++) {
			// 기존 요소들을 새로운 배열에 추가
			newArr[i] = this.elements[i];
		}
		// 마지막 요소를 임시로 담을 변수
		Integer legacy = this.elements[size-1];
		
		// 새롭게 줄어든 배열을 내부 배열로 대입
		this.elements = newArr;
		
		// 제거한 마지막 요소를 반환
		return legacy;
	}
	
	// 요소를 찾는다.
	// - 마지막 요소 || 인덱스를 전달받아서 해당 요소를 출력
	
	
	public static void main(String[] args) {
		StackTask st = new StackTask();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		st.add(5);
		System.out.println(st.remove()); // 5
		st.add(6);
		st.add(7);
		System.out.println(st.remove()); // 7
		System.out.println(st.remove()); // 6
		System.out.println(st.remove()); // 4
		System.out.println(st.remove()); // 3
		System.out.println(st.remove()); // 2
		System.out.println(st.remove()); // 1
		System.out.println(st.remove()); // null 요소가 없다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
