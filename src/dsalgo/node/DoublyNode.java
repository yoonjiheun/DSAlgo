package dsalgo.node;

public class DoublyNode extends Node {
	DoublyNode next;
	DoublyNode prev;

	public DoublyNode() {

	}

	public DoublyNode(Object value, DoublyNode prev, DoublyNode next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}

	public DoublyNode(DoublyNode prev, DoublyNode next) {
		this.prev = prev;
		this.next = next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}

	public DoublyNode next() {
		return next;
	}

	public DoublyNode prev() {
		return prev;
	}
}
