package dsalgo.node;

public abstract class Node {
	Object value;

	public Object element() {
		return value;
	}

	public void setElement(Object value) {
		this.value = value;
	}
}
