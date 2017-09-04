package dsalgo.stack.linked;

import dsalgo.node.SinglyNode;
import dsalgo.stack.Stack;

public class LinkedStack implements Stack {
	
	SinglyNode top;
	int size;
	
	public LinkedStack () {
		top = null;
		size = 0;
	}

	public Object pop() {
		if(top == null) return null;
		Object itemToRemove = top.element();
		top = top.next();
		size--;
		
		return itemToRemove;
	}

	public boolean push(Object value) {
		top = new SinglyNode(value, top);
		size++;
		return false;
	}

	public Object topValue() {
		if(top == null) return null;
		return top.element();
	}

	public int length() {
		return size;
	}

	public void clear() {
		top = null;
		size = 0;
	}

}
