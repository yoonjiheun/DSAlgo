package dsalgo.stack.arraybased;

import dsalgo.stack.Stack;

public class ArrayStack implements Stack {
	static int defaultSize = 10;

	Object stack[];
	int maxSize;
	int top;

	public ArrayStack() {
		this(defaultSize);
	}

	public ArrayStack(int size) {
		maxSize = size;
		stack = new Object[maxSize];
		top = 0;
	}

	public Object pop() {
		if (top == 0)
			return null;
		return stack[--top];
	}

	public boolean push(Object value) {
		if (top >= maxSize) {
			maxSize = maxSize * 2;
			Object[] newList = new Object[maxSize];

			for (int i = 0; i < stack.length; i++) {
				newList[i] = stack[i];
			}

			stack = newList;
		}

		stack[top++] = value;

		return true;
	}

	public Object topValue() {
		return stack[top - 1];
	}

	public int length() {
		return top;
	}

	public void clear() {
		top = 0;
	}

}
