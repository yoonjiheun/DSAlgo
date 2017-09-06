package dsalgo.node.binary;

import dsalgo.node.BinNode;

public interface BinaryNode {
	public BinNode left();
	public BinNode right();
	public boolean isLeaf();
}
