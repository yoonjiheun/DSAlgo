package dsalgo.test;

import dsalgo.list.array.ArrayList;
import dsalgo.list.linked.DoublyLinkedList;
import dsalgo.list.linked.LinkedList;

public class Main {
	// TODO: Write unit tests.
	// Just checking for null pointers with main method.
	public static void main(String[] args) {
		ArrayList list = new ArrayList(20, false);
		LinkedList linkedList = new LinkedList();
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		for (int i = 0; i < 45; i++) {
			String rng = String.format("%.0f", i + 1 * Math.random() * 100);
			list.append(rng);
			linkedList.append(rng);
			doublyLinkedList.append(rng);
		}

		System.out.println(list.toString());
		System.out.println(doublyLinkedList.toString());
		System.out.println(linkedList.toString());
	}
}
