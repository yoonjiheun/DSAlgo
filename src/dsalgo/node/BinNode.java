package dsalgo.node;

import dsalgo.node.binary.BinaryNode;

public class BinNode extends Node implements BinaryNode{
	BinNode left;
	BinNode right;

	public BinNode getLeft() {
		return left;
	}

	public void setLeft(BinNode left) {
		this.left = left;
	}

	public void setRight(BinNode right) {
		this.right = right;
	}

	public BinNode getRight() {
		return right;
	}

	@Override
	public BinNode left() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinNode right() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}
}
