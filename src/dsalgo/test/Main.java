package dsalgo.test;

import dsalgo.list.array.ArrayList;
import dsalgo.list.linked.LinkedList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(20, false);
		LinkedList linkedList = new LinkedList();
		for(int i=0; i<45;i++) {
			String rng = String.format("%.0f", i+1 * Math.random() * 100);
			list.append(rng);
			linkedList.append(rng);
		}
		
		System.out.println(linkedList.toString());
	}
}
