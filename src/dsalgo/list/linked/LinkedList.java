package dsalgo.list.linked;

import dsalgo.list.List;
import dsalgo.node.SinglyNode;

public class LinkedList implements List {
	SinglyNode head;
	SinglyNode tail;
	SinglyNode curr;
	int currSize;

	public LinkedList() {
		this.tail = new SinglyNode(null);
		this.head = new SinglyNode(tail);
		this.curr = tail;
		this.currSize = 0;
	}

	public Object remove() {
		if (curr == tail)
			return null;

		Object objectToRemove = curr.element();
		curr.setElement(curr.next().element());
		if (curr.next() == tail)
			tail = curr;
		curr.setNext(curr.next().next());
		currSize--;

		return objectToRemove;
	}

	public boolean append(Object it) {
		tail.setNext(new SinglyNode(null));
		tail.setElement(it);
		tail = tail.next();
		currSize++;
		return true;
	}

	public boolean insert(Object it) {
		curr.setNext(new SinglyNode(curr.element(), curr.next()));
		curr.setElement(it);
		if (curr == tail)
			tail = curr.next();
		currSize++;

		return true;
	}

	public void moveToStart() {
		curr = head.next();

	}

	public void moveToEnd() {
		moveToStart();
		while (curr != tail) {
			curr = curr.next();
		}
	}

	public void prev() {
		SinglyNode temp = curr;
		moveToStart();
		while (curr != temp) {
			curr = curr.next();
		}

	}

	public void next() {
		if (curr != tail)
			curr = curr.next();

	}

	public int length() {
		return currSize;
	}

	public int currPos() {
		SinglyNode temp = head.next();
		int i;
		for (i = 0; curr != temp; i++)
			temp = temp.next();
		return i;
	}

	@Override
	public String toString() {
		String value = "0 = head\n";
		SinglyNode currPos = head;

		int c = 0;
		while (currPos != tail) {
			value += c + ": " + currPos.element() + " (curr pos value)  " + (c + 1)
					+ ": " + currPos.next().element() + " (next pos value)" + "\n";
			currPos = currPos.next();
			c++;
		}

		return "Size: " + currSize + "\nValue: \n" + value;
	}
}
