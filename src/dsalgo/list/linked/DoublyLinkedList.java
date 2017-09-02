package dsalgo.list.linked;

import dsalgo.list.List;
import dsalgo.node.DoublyNode;

public class DoublyLinkedList implements List {
	DoublyNode head;
	DoublyNode tail;
	DoublyNode curr;
	int currSize;

	public DoublyLinkedList() {
		tail = new DoublyNode();
		tail.setElement(null);
		head = new DoublyNode();
		head.setElement(null);

		head.setNext(tail);
		head.setPrev(null);
		tail.setPrev(head);
		tail.setNext(null);

		curr = tail;

		currSize = 0;
	}

	public boolean insert(Object it) {
		DoublyNode node = new DoublyNode(it, curr.prev(), curr);
		curr = node;
		curr.prev().setNext(curr);
		curr.next().setPrev(curr);
		currSize++;

		return true;
	}

	public boolean append(Object it) {
		tail.setPrev(new DoublyNode(it, tail.prev(), tail));
		tail.prev().prev().setNext(tail.prev());
		if (curr == tail)
			curr = tail.prev();
		currSize++;
		return true;
	}

	public Object remove() {
		if (curr == tail)
			return null;
		Object objectToRemove = curr;
		curr.next().setPrev(curr.prev());
		curr.prev().setNext(curr.next());
		curr = curr.next();
		currSize--;
		return objectToRemove;
	}

	public void moveToStart() {
		if (head.next() == curr)
			return;

		curr = head.next();

	}

	public void moveToEnd() {
		if (tail.prev() == curr)
			return;

		curr = tail.prev();

	}

	public void prev() {
		if (curr.prev() == head)
			return;
		curr = curr.prev();

	}

	public void next() {
		if (curr.next() == tail)
			return;
		curr = curr.next();

	}

	public int length() {
		return currSize;
	}

	public int currPos() {
		DoublyNode temp = head.next();
		int i;
		for (i = 0; curr != temp; i++)
			temp = temp.next();
		return i;
	}

	@Override
	public String toString() {
		String value = "0 = head\n";
		DoublyNode currPos = head;

		int c = 0;
		while (currPos != tail) {
			value += c + ": " + currPos.element() + " (curr pos value)  " + (c + 1)
					+ ": " + (currPos.next() != null ? currPos.next().element() : null)
					+ " (next pos value)   " + (c - 1) + ": "
					+ (currPos.prev() != null ? currPos.prev().element() : null)
					+ " (prev pos value)\n";
			currPos = currPos.next();
			c++;
		}

		return "Size: " + currSize + "\nValue: \n" + value;
	}
}
