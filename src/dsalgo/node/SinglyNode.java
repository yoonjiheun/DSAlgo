package dsalgo.node;

public class SinglyNode extends Node {
	SinglyNode next;

	public SinglyNode(Object value, SinglyNode next) {
		this.value = value;
		this.next = next;
	}

	public SinglyNode(SinglyNode next) {
		this.value = null;
		this.next = next;
	}

	public void setNext(SinglyNode next) {
		this.next = next;
	}

	public SinglyNode next() {
		return next;
	}
}
