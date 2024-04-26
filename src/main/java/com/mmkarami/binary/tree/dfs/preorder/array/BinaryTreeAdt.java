package com.mmkarami.binary.tree.dfs.preorder.array;

public class BinaryTreeAdt {

	private Object[] treeArray;

	private int lastIndex;

	public BinaryTreeAdt(int size) {
		this.treeArray = new Object[size + 1];
		this.lastIndex = 0;
	}
	
	public BinaryTreeAdt(Object[] treeArray) {
		this.treeArray = treeArray;
		this.lastIndex = treeArray.length - 1;
	}

	public int getLastIndex() {
		return lastIndex;
	}

	public boolean isEmpty() {
		return lastIndex == 0;
	}

	public boolean isFull() {
		return lastIndex == treeArray.length - 1;
	}
	
	public void insert(Object value) {
		if (isFull())
			throw new RuntimeException();
		else {
			treeArray[lastIndex + 1] = value;
			lastIndex++;
		}
	}

	public int size() {
		return lastIndex;
	}
	
	public String traverse() {
		return traverseNodeValuesByDfsPreOrder(0);
	}
	
	private String traverseNodeValuesByDfsPreOrder(int index) {
		if (index == 0)
			index++;
		if (index > lastIndex)
			return "";
		String result = treeArray[index] + " ";
		result += traverseNodeValuesByDfsPreOrder(index * 2);
		result += traverseNodeValuesByDfsPreOrder(index * 2 + 1);
		return result;
	}
}