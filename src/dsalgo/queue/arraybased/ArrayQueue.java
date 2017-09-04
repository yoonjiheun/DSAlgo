package dsalgo.queue.arraybased;

import dsalgo.queue.Queue;

public class ArrayQueue implements Queue {
	Object queueArray[]; // Array holding queue elements
	static final int defaultSize = 10;
	int maxSize; // Maximum size of queue
	int front; // Index of front element
	int rear;

	public ArrayQueue(int size) {
		maxSize = size + 1; // One extra space is allocated
		rear = 0;
		front = 1;
		queueArray = new Object[maxSize];
	}

	public ArrayQueue() {
		this(defaultSize);
	}

	public void clear() {
		rear = 0;
		front = 1;
	}

	public boolean placeInQueue(Object it) {
		if (((rear + 2) % maxSize) == front)
			return false; // Full
		rear = (rear + 1) % maxSize; // Circular increment
		queueArray[rear] = it;
		return true;
	}

	public Object removeFromQueue() {
		if (length() == 0)
			return null;
		Object it = queueArray[front];
		front = (front + 1) % maxSize; // Circular increment
		return it;
	}

	public Object firstValue() {
		if (length() == 0)
			return null;
		return queueArray[front];
	}

	public int length() {
		return ((rear + maxSize) - front + 1) % maxSize;
	}
}
