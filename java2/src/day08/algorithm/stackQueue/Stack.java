package day08.algorithm.stackQueue;

import java.util.ArrayList;

public class Stack<E> extends ArrayList<E> {
	public Stack() {
		super();
	}

	// 마지막 요소를 ArrayList 상에서 제거하고
	// 이를 반환하는 함수
	public E pop() {
		// 요소의 개수를 반환한다.
		int amount = this.size();
		if (amount == 0) {// 개수가 0개면 null을 반환한다.
			return null;
		}
		// 개수가 1개 이상이면, 개수-1번째 요소를 가져온다.
		E element = this.get(amount - 1);
		
		// 마지막 요소를 리스트상에서 제거한다.
		this.remove(element); // 요소의 주소를 전달하여 리스트에서 제거
//		this.remove(amount-1);// 요소의 인덱스를 전달하여 리스트에서 제거
		
		return element;
	}

	public void put(E element) {
		super.add(element);
	}

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.put(1);
		st.put(2);
		st.put(3);
		st.put(4);
		st.put(5);
		System.out.println(st.pop()); // 5
		System.out.println(st.pop()); // 4
		System.out.println(st.pop()); // 3
		System.out.println(st.pop()); // 2
		st.put(5);
		System.out.println(st.pop()); // 5
		System.out.println(st.pop()); // 1
		System.out.println(st.pop()); // null

	}

}
