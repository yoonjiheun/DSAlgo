package dsalgo.list.array;

import dsalgo.list.List;

public class ArrayList implements List {
	boolean dynamic;
	int maxSize;
	int size;
	static int defaultSize = 10;
	int currPos;
	Object[] list;
	
	public ArrayList (int size, boolean dynamic) {
		maxSize = size;
		currPos = 0;
		size = 0;
		list = new Object[maxSize];
		this.dynamic = dynamic;
	}
	
	public ArrayList() {
		this(defaultSize, true);
	}
	
	public boolean append(Object value) {
		if(!dynamic && size >= maxSize) return false; // Non resizeable list
		if(dynamic && size >= maxSize) {
			maxSize = maxSize * 2;
			Object[] newList = new Object[maxSize];

			for(int i=0;i<list.length;i++) {
				newList[i] = list[i];
			}

			list = newList;
		}
		
		list[size++] = value;
		
		return true;
	}
	
	public boolean insert(Object value) {
		if(!dynamic && size >= maxSize) return false;
		if(dynamic && size >= maxSize) {
			maxSize = maxSize * 2;
			Object[] newList = new Object[maxSize];
			
			for(int i=0;i<list.length;i++) {
				newList[i] = list[i];
			}
			list = newList;
		}
		
		for(int i=size; i>currPos;i--) {
			list[i] = list[i-1];
		}
		list[currPos] = value;
		size++;
		
		return true;
	}
	
	public void clear () {
		size = currPos = 0;
	}
	
	public Object remove() {
		if(currPos < 0 || currPos >= size) return null;
		Object valueToRemove = list[currPos];
		for(int i=0; i<list.length;i++) {
			list[i] = list[i+1];
		}
		
		size--;
		return valueToRemove;
	}
	

	public void moveToStart() {
		currPos = 0;
		
	}

	public void moveToEnd() {
		currPos = size;
		
	}

	public void prev() {
		if(currPos != 0) currPos--;
		
	}

	public void next() {
		if(currPos < size) currPos++;
		
	}

	public int length() {
		return size;
	}

	public int currPos() {
		return currPos;
	}
	
	public boolean isAtEnd() {
		return currPos == size;
	}
	
	public Object getCurrValue() {
		if(currPos < 0 || currPos >= size) return null;
		return list[currPos];
	}
	
	@Override
	public String toString() {
		String values = "";
		for(int i=0;i<size;i++) {
			values += i + ": " + list[i] + "\n";
		}
		return "Current Position: " + currPos + "\nSize: " + size + "\nValues : \n" + values;
	}
}
