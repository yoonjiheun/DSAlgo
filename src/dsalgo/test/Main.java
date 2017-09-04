package dsalgo.test;

import dsalgo.list.arraybased.ArrayList;
import dsalgo.list.linked.DoublyLinkedList;
import dsalgo.list.linked.LinkedList;
import dsalgo.stack.arraybased.ArrayStack;

public class Main {
	// TODO: Write unit tests.
	// Just checking for null pointers with main method.
	public static void main(String[] args) {
		int size = 45;
		
		ArrayList list = new ArrayList(size, false);
		LinkedList linkedList = new LinkedList();
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		ArrayStack stack = new ArrayStack(size);
		
		for (int i = 0; i < size; i++) {
			String rng = String.format("%.0f", i + 1 * Math.random() * 100);
			stack.push(rng);
			list.append(rng);
			linkedList.append(rng);
			doublyLinkedList.append(rng);
		}
		
		System.out.println(list.toString());
		System.out.println(doublyLinkedList.toString());
		System.out.println(linkedList.toString());
		System.out.println(stack.toString());
	}
}
