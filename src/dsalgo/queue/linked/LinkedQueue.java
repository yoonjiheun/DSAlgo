package dsalgo.queue.linked;

import dsalgo.node.SinglyNode;
import dsalgo.queue.Queue;

public class LinkedQueue implements Queue {
	SinglyNode front;
	SinglyNode rear;
	int size;
	
	public LinkedQueue () {
		front = rear = new SinglyNode(null);
		size = 0;
	}
	

	public void clear() {
		front = rear = new SinglyNode(null);
		size = 0;
	}

	public boolean placeInQueue(Object value) {
		rear.setNext(new SinglyNode(value, null));
		rear = rear.next();
		size++;
		return false;
	}

	public Object removeFromQueue() {
		if(size == 0) return null;
		Object objectToDequeue = front.next().element();
		front.setNext(front.next().next());
		if(front.next() == null) rear = front;
		size--;
		return objectToDequeue;
	}

	public Object firstValue() {
		if(size == 0) return null;
		
		return front.next().element();
	}

	public int length() {

		return size;
	}

}
