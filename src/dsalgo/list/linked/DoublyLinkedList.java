package dsalgo.list.linked;



import dsalgo.list.List;
import dsalgo.node.DoublyNode;
import dsalgo.node.SinglyNode;

public class DoublyLinkedList implements List {
	DoublyNode head;
	DoublyNode tail;
	DoublyNode currPos;
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
		
		currPos = tail;
		
		currSize = 0;
	}
	
	public boolean insert(Object it) {
		DoublyNode node = new DoublyNode(it, currPos.prev(), currPos);
		currPos = node;
		currPos.prev().setNext(currPos);
		currPos.next().setPrev(currPos);
		currSize++;
		
		return true;
	}
	
	public boolean append(Object it) {
		tail.setPrev(new DoublyNode(it, tail.prev(), tail));
		tail.prev().prev().setNext(tail.prev());
		if(currPos == tail) currPos = tail.prev();
		currSize++;
		return true;
	}
	
	public Object remove() {
		if(currPos == tail) return null;
		Object objectToRemove = currPos;
		currPos.next().setPrev(currPos.prev());
		currPos.prev().setNext(currPos.next());
		currPos = currPos.next();
		currSize--;
		return objectToRemove;
	}
	
	

	public void moveToStart() {
		// TODO Auto-generated method stub
		
	}

	public void moveToEnd() {
		// TODO Auto-generated method stub
		
	}

	public void prev() {
		// TODO Auto-generated method stub
		
	}

	public void next() {
		// TODO Auto-generated method stub
		
	}

	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int currPos() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		String value = "0 = head\n";
		DoublyNode currPos = head;
		
		int c = 0;
		while(currPos != tail) {
			value += c + ": " + currPos.element() + " (curr pos value)  " + (c+1) + ": " + (currPos.next() != null ? currPos.next().element() : null)  + " (next pos value)   " + (c-1) + ": " + (currPos.prev() != null ? currPos.prev().element() : null) + " (prev pos value)\n";
			currPos = currPos.next();
			c++;
		}
		
		return "Size: " + currSize + "\nValue: \n" + value;
	}
}
