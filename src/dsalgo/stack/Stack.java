package dsalgo.stack;

public interface Stack {
	public Object pop();
	public boolean push(Object value);
	public Object topValue();
	public int length();
	public void clear();
}
