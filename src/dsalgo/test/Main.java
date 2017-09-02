package dsalgo.test;

import dsalgo.list.array.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(20, false);
		for(int i=0; i<45;i++) {
			list.append(String.format("%.0f", i+1 * Math.random() * 100));
		}
		
		System.out.println(list.toString());
	}
}
