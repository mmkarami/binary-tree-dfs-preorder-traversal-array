package com.mmkarami.binary.tree.dfs.preorder.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class BinaryTreeAdtTest {

	private BinaryTreeAdt tree;

	@BeforeEach
	public void initBinaryTree() {
		
		String[] arr = {"", "N1", "N2", "N3", "N4", "N5", "N6", "N7", "N8", "N9"};
		tree = new BinaryTreeAdt(arr);
	}

	@Test
	public void testCreateTreeWithoutNode_whenCreateTreeWithoutNode_thenItMustBeCreatedTreeWithoutNode() {

		// Arrange
		BinaryTreeAdt tree;

		// Act
		tree = new BinaryTreeAdt(10);

		// Assert
		assertEquals(0, tree.size());
	}

	@Test
	public void testPreOrderTraverse_whenTraverseTreePreOrder_thenItMustReturnStringOfNodesInPreOrderSequence() {

		// Arrange
		BinaryTreeAdt tree = this.tree;

		// Act
		String result = tree.traverse();

		// Assert
		assertEquals("N1 N2 N4 N8 N9 N5 N3 N6 N7 ", result);
	}
}