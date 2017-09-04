package dsalgo.queue;

public interface Queue {
	public void clear();
	public boolean placeInQueue(Object value);
	public Object removeFromQueue();
	public Object firstValue();
	public int length();
}
